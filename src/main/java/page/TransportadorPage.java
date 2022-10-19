package page;

import static utils.BasePage.setText;
import static utils.Utils.driver;
import static utils.Utils.getPropertySettings;
import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import attributes.TransportadorAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;
import utils.Utils;

/**
 * @author Jonicler
 *
 */
public class TransportadorPage extends TransportadorAttributes {

	LocalDate myObj = LocalDate.now();
	
	public TransportadorPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}
	
	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher nome e Sobre nome
	 */
	public void nomeTransportador() {

		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.NomeTransportador"));
	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher celular
	 */
	public void celularTransportador() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.CelularTransportador"));
	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher e-mail
	 */
	public void emailTransportador() {

		setText(Email, getPropertySettings("LevvMobile.data.emailTransportador"));
	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher senha
	 */
	public void senhaTransportador() {

		setText(password1, getPropertySettings("LevvMobile.data.Senha1Transportador"));
	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher confirma senha
	 */
	public void confirmaSenhaTransportador() {

		setText(password2, getPropertySettings("LevvMobile.data.Senha1Transportador"));

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/1 Cadastro Transportador " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * Seleciona Transportador
	 */
	public void selecionaTransportador() throws InterruptedException {
		BasePage.implicitWait(transportador, 10);
		transportador.click();
		BasePage.fixedWait(2);

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher DATA e CPF
	 */
	public void dataEcpf() throws InterruptedException {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimentoTransportador"));
		cpfLojista.sendKeys(BasePage.gerarDocumento("CPF"));
		BasePage.fixedWait(2);

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher numero Documento
	 */
	public void numeroDocumento() throws InterruptedException {

		setText(docIdentificacao, getPropertySettings("LevvMobile.data.DocumentoTransportador"));
		BasePage.fixedWait(2);

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * Foto IDT
	 */
	public void imagemIdt() throws InterruptedException {

		btnIdt.click();
		BasePage.implicitWait(fotoIdt, 15);
		fotoIdt.click();
		BasePage.implicitWait(aceitarFotoIdt, 10);
		aceitarFotoIdt.click();

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * Seleciona Transporte Tipo
	 */
	public void selecionaTransporte() throws InterruptedException {

		moto.click();
		BasePage.fixedWait(2);

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * preencher Campos obrigatorios
	 */
	public void camposObrigatorios() throws InterruptedException {

		marca.setValue("kawasaki");
		modelo.setValue("Z400");
		renavan.setValue("125482649700");
		BasePage.fixedWait(2);
		renavan.click();
		BasePage.fixedWait(2);
		driver.hideKeyboard();
		BasePage.fixedWait(2);
		placa.setValue("KWZ6678");

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * Emitir CRLV
	 */
	public void emitrCrlv() throws InterruptedException {
	
		BasePage.fixedWait(2);
		crlv.click();
		BasePage.implicitWait(btnFotoCrlv, 10);
		System.out.println("Emitir foto");
		btnFotoCrlv.click();
		BasePage.implicitWait(aceitarCrlv, 10);
		aceitarCrlv.click();
		BasePage.fixedWait(2);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/2 Cadastro Transportador " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe transportadorSteps, no qual contem o metodo para
	 * Botao Cadastrar
	 */
	public void btnCadastrar() throws InterruptedException {

		cadastroTransportador.click();
		BasePage.implicitWait(permitirLocalizacao, 10);

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/3 Permitir localizacao " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		permitirLocalizacao.click();

	}

}
