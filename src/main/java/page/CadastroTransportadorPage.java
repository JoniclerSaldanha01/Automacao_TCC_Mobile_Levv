package page;

import static org.junit.Assert.assertTrue;

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
			Thread.sleep(12000);
		}
		catch(Exception e) {

		}
	}

}
