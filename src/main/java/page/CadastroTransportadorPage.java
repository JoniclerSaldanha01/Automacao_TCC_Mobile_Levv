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

	// Valida tela de cadastro
		public void validarTelaRegistro() {
			assertTrue(nameLastName.isDisplayed());
		}

	// Insere Nome e SobreNome    
		public void nome(String name) {
			nameLastName.sendKeys(name);

		}

		public void phone(String number) {
			NumberPhone.sendKeys(number);
		}

		public void email(String email) {
			Email.sendKeys(email);

		}

		public void senha1(String pass) {
			password1.sendKeys(pass);
		}

		public void senha2(String pass) {
			password2.sendKeys(pass);
		}

		public void botaoCadastrarCelular() {
			botaoCadastrar.click();
		}

		public void cadastroValidador() {
			assertTrue(validarCadastro.isDisplayed());
		}


}
