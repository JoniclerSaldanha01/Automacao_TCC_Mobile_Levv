package page;

import attributes.ClienteAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class ClientePage extends ClienteAttributes {

	public ClientePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void selecionaClente() {

		try {
			cliente.click();
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	public void dataEcpf(String dt, String cpf) {

		try {
			diaMesAno.sendKeys(dt);
			cpfLojista.sendKeys(cpf);
			Thread.sleep(6000);
		} catch (Exception e) {

		}
	}

	public void BotaoCadastrarCliente() throws InterruptedException {
		cadastrarCliente.click();
		Thread.sleep(8000);
		permitirLocalizacao.click();

	}

	public void CadastrarEndecoCliente() throws InterruptedException {
		logradouroLojista.setValue("Praça Alfredo Issa");
		numero.setValue("488");
		complemento.setValue("Ap 9 Andar");
		apartamentoTipo.click();
		cep.setValue("01033-902");
		bairro.setValue("Centro");
		cidade.setValue("São Paulo");
		estado.setValue("São Paulo");
		Thread.sleep(2000);
		estado.click();
	}

}
