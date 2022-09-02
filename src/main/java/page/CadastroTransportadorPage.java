package page;

import static org.junit.Assert.assertTrue;
import static utils.Utils.driver;

import org.openqa.selenium.support.PageFactory;

import attributes.CadastroTransportadorAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class CadastroTransportadorPage extends CadastroTransportadorAttributes{
	
	public CadastroTransportadorPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}

	public void selecionaTransportador() {
		
		try {
			transportador.click();
			Thread.sleep(2000);
			}
			catch(Exception e) {
			  
			}
	}
	
	public void dataEcpf(String dt, String cpf) {
		
		try {
			diaMesAno.sendKeys(dt);
			cpfLojista.sendKeys(cpf);
			Thread.sleep(2000);
			}
			catch(Exception e) {
			  
			}
	}

	public void numeroDocumento(String documento){
		try {
			docIdentificacao.sendKeys(documento);
			Thread.sleep(2000);
		}
		catch(Exception e) {

		}
	}

	public void imagemIdt(){
		try {
			btnIdt.click();
			Thread.sleep(2000);
			fotoIdt.click();
			Thread.sleep(2000);
			aceitarFotoIdt.click();
			
		}
		catch(Exception e) {

		}

	}

	public void selecionaTransporte(){
		try {
			moto.click();
			Thread.sleep(2000);
		}
		catch(Exception e) {

		}
	}

	public void camposObrigatorios(){
		try {
			marca.setValue("kawasaki");
			modelo.click();
			driver.hideKeyboard();
			modelo.setValue("Z400");
			renavan.setValue("125482649700");
			placa.setValue("KWZ6678");

		}
		catch(Exception e) {

		}
	}


	public void emitrCrlv(){
		try {
			Thread.sleep(2000);
			crlv.click();
			Thread.sleep(2000);
			btnFotoCrlv.click();
			Thread.sleep(2000);
			aceitarCrlv.click();
			Thread.sleep(2000);
			
		}
		catch(Exception e) {

		}
	}

	public void btnCadastrar(){
		try {
			cadastroTransportador.click();
			Thread.sleep(8000);
			permitirLocalizacao.click();
		}
		catch(Exception e) {

		}
	}


}
