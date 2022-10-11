package page;

import static utils.BasePage.setText;
import static utils.Utils.driver;
import static utils.Utils.getPropertySettings;
import org.openqa.selenium.support.PageFactory;
import attributes.TransportadorAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;

public class TransportadorPage extends TransportadorAttributes {

	public TransportadorPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void nomeTransportador() {

		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.NomeTransportador"));
	}

	public void celularTransportador() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.CelularTransportador"));
	}

	public void emailTransportador() {

		setText(Email, getPropertySettings("LevvMobile.data.emailTransportador"));
	}

	public void senhaTransportador() {

		setText(password1, getPropertySettings("LevvMobile.data.Senha1Transportador"));
	}

	public void confirmaSenhaTransportador() {

		setText(password2, getPropertySettings("LevvMobile.data.Senha1Transportador"));
	}

	public void selecionaTransportador() throws InterruptedException {

		transportador.click();
		BasePage.fixedWait(2);

	}

	public void dataEcpf() throws InterruptedException {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimentoTransportador"));
		setText(cpfLojista, getPropertySettings("LevvMobile.data.cpfTransportador"));
		BasePage.fixedWait(2);

	}

	public void numeroDocumento() throws InterruptedException {

		setText(docIdentificacao, getPropertySettings("LevvMobile.data.DocumentoTransportador"));
		BasePage.fixedWait(2);

	}

	public void imagemIdt() throws InterruptedException {

		btnIdt.click();
		System.out.println("Aguarda 10s elemnto");
		BasePage.implicitWait(fotoIdt, 15);
		fotoIdt.click();
		BasePage.implicitWait(aceitarFotoIdt, 10);
		aceitarFotoIdt.click();

	}

	public void selecionaTransporte() throws InterruptedException {

		moto.click();
		Thread.sleep(2000);

	}

	public void camposObrigatorios() throws InterruptedException {

		marca.setValue("kawasaki");
		// modelo.click();
		modelo.setValue("Z400");
		renavan.setValue("125482649700");
		BasePage.fixedWait(2);
		renavan.click();
		BasePage.fixedWait(2);
		driver.hideKeyboard();
		BasePage.fixedWait(2);
		placa.setValue("KWZ6678");

	}

	public void emitrCrlv() throws InterruptedException {

		BasePage.fixedWait(2);
		crlv.click();
		BasePage.implicitWait(btnFotoCrlv, 10);
		btnFotoCrlv.click();
		BasePage.implicitWait(aceitarCrlv, 10);
		aceitarCrlv.click();
		BasePage.fixedWait(2);

	}

	public void btnCadastrar() throws InterruptedException {

		cadastroTransportador.click();
		BasePage.implicitWait(permitirLocalizacao, 10);
		permitirLocalizacao.click();

	}

}
