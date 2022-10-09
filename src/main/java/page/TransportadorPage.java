package page;

import static utils.BasePage.setText;
import static utils.Utils.driver;
import static utils.Utils.getPropertySettings;
import org.openqa.selenium.support.PageFactory;
import attributes.TransportadorAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TransportadorPage extends TransportadorAttributes {

	public TransportadorPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void nomeTransportador() {

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
		Thread.sleep(2000);

	}

	public void dataEcpf() throws InterruptedException {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimentoTransportador"));
		setText(cpfLojista, getPropertySettings("LevvMobile.data.cpfTransportador"));
		Thread.sleep(2000);

	}

	public void numeroDocumento() throws InterruptedException {

		setText(docIdentificacao, getPropertySettings("LevvMobile.data.DocumentoTransportador"));
		Thread.sleep(2000);

	}

	public void imagemIdt() throws InterruptedException {

		btnIdt.click();
		System.out.println("Aguarda 10s elemnto");
		Thread.sleep(10000);
		fotoIdt.click();
		Thread.sleep(6000);
		aceitarFotoIdt.click();

	}

	public void selecionaTransporte() throws InterruptedException {

		moto.click();
		Thread.sleep(2000);

	}

	public void camposObrigatorios() throws InterruptedException {

		marca.setValue("kawasaki");
		//modelo.click();
		modelo.setValue("Z400");
		renavan.setValue("125482649700");
		Thread.sleep(2000);
		renavan.click();
		Thread.sleep(2000);
		driver.hideKeyboard();
		Thread.sleep(2000);
		placa.setValue("KWZ6678");

	}

	public void emitrCrlv() throws InterruptedException {

		Thread.sleep(2000);
		crlv.click();
		Thread.sleep(10000);
		btnFotoCrlv.click();
		Thread.sleep(2000);
		aceitarCrlv.click();
		Thread.sleep(2000);

	}

	public void btnCadastrar() throws InterruptedException {

		cadastroTransportador.click();
		Thread.sleep(8000);
		permitirLocalizacao.click();

	}

}
