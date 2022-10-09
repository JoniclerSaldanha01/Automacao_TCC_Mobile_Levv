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

	public void nomeCliente() {
		
		setText(nameLastName,getPropertySettings("LevvMobile.data.NomeCliente"));
	}
	
	public void celular() {
		
		setText(NumberPhone,getPropertySettings("LevvMobile.data.Celular"));
	}
		
	public void emailCliente() {
		
		setText(Email,getPropertySettings("LevvMobile.data.email"));
	}
	
	public void senha1() {
		
		setText(password1,getPropertySettings("LevvMobile.data.Senha1"));
	}
	
	public void confirmarSenha() {
		
		setText(password2,getPropertySettings("LevvMobile.data.Senha1"));
	}
	
	public void selecionaClente() throws InterruptedException {

			cliente.click();
			Thread.sleep(6000);
		
	}

	public void dataEcpf() throws InterruptedException {
		
		setText(diaMesAno,getPropertySettings("LevvMobile.data.dataNascimento"));
		setText(cpfLojista,getPropertySettings("LevvMobile.data.cpf"));
		Thread.sleep(6000);
		
	}

	public void BotaoCadastrarCliente() throws InterruptedException {
		
		cadastrarCliente.click();
		Thread.sleep(3000);
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
