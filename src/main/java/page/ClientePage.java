package page;

import attributes.ClienteAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import static utils.BasePage.setText;
import static utils.Utils.getPropertySettings;

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

		setText(logradouroLojista,getPropertySettings("LevvMobile.data.logradouro"));
		setText(numero,getPropertySettings("LevvMobile.data.numero"));
		setText(complemento,getPropertySettings("LevvMobile.data.complemento"));
		apartamentoTipo.click();
		setText(cep,getPropertySettings("LevvMobile.data.cep"));
		setText(bairro,getPropertySettings("LevvMobile.data.bairro"));
		setText(cidade,getPropertySettings("LevvMobile.data.cidade"));
		setText(estado,getPropertySettings("LevvMobile.data.estado"));
		Thread.sleep(2000);
		estado.click();
	}

}
