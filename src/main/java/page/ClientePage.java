package page;

import attributes.ClienteAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;
import utils.Utils;
import org.apache.commons.io.FileUtils;
import java.time.LocalDate;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import static utils.BasePage.setText;
import static utils.Utils.getPropertySettings;
import java.io.File;
import java.io.IOException;

/**
 * @author Jonicler
 *
 */
public class ClientePage extends ClienteAttributes {
	LocalDate myObj = LocalDate.now();
		
	
	public ClientePage(AppiumDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		 
		
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem os metodos para
	 * preencher Nome e sobre nome
	 */
	public void nomeCliente() {

		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.NomeCliente"));
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher numero de Celular
	 */
	public void celular() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.Celular"));
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher e-mail do cliente
	 */
	public void emailCliente() {

		setText(Email, getPropertySettings("LevvMobile.data.email"));
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher o Campo Senha
	 */
	public void senha1() {

		setText(password1, getPropertySettings("LevvMobile.data.Senha1"));
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher confirmar a Senha
	 */
	public void confirmarSenha() {
		
		setText(password2, getPropertySettings("LevvMobile.data.Senha1"));
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/1 Cadastro cliente " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * selecionar Cliente
	 */
	public void selecionaCliente() throws InterruptedException {
		BasePage.implicitWait(cliente, 10);
		cliente.click();
		BasePage.fixedWait(6);

	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher o Campo CPF
	 */
	public void dataEcpf() throws InterruptedException {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimento"));
		cpfLojista.sendKeys(BasePage.gerarDocumento("CPF"));
		BasePage.fixedWait(6);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/2 Cliente-Dados " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * Cadastrar Cliente
	 */
	public void BotaoCadastrarCliente() throws InterruptedException {

		cadastrarCliente.click();
		BasePage.implicitWait(permitirLocalizacao, 10);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/4 Cliente-Permitir localizacao " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		permitirLocalizacao.click();

	}

	/**
	 * Metodo a ser chamado pela classe clientSteps, no qual contem o metodo para
	 * preencher o Endereco Cliente
	 */
	public void CadastrarEnderecoCliente() throws InterruptedException {

		BasePage.implicitWait(logradouroLojista, 10);
		setText(logradouroLojista, getPropertySettings("LevvMobile.data.logradouro"));
		setText(numero, getPropertySettings("LevvMobile.data.numero"));
		setText(complemento, getPropertySettings("LevvMobile.data.complemento"));
		apartamentoTipo.click();
		setText(cep, getPropertySettings("LevvMobile.data.cep"));
		setText(bairro, getPropertySettings("LevvMobile.data.bairro"));
		setText(cidade, getPropertySettings("LevvMobile.data.cidade"));
		setText(estado, getPropertySettings("LevvMobile.data.estado"));
		BasePage.fixedWait(2);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/4.1 Cliente-Cadastro endereco " + myObj + ".png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		// estado.click();
	}

}
