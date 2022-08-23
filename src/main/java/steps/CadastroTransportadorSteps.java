package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.CadastroLojistaPage;
import page.CadastroTransportadorPage;


public class CadastroTransportadorSteps {
	
	CadastroTransportadorPage cadastroTransportador = new CadastroTransportadorPage(driver);
	
	@Dado("que o usuario esteja na tela de criacao de Cadastro")
	public void queOUsuarioEstejaNaTelaDeCriacaoDeCadastro() throws InterruptedException {
		Thread.sleep(4000);
		driver.hideKeyboard();
		cadastroTransportador.validarTelaRegistro();
		
	}

	@Quando("preencho o campo (.*)")
	public void preencho_o_campo(String nome) throws InterruptedException {

		cadastroTransportador.nome(nome);
		Thread.sleep(4000);
	}

	@Quando("informo (.*) com DDD")
	public void informo_com_DDD(String int1) {
		cadastroTransportador.phone(int1);
	}

	@Quando("informo o (.*)")
	public void informo_o_QAQA_gmail_com(String Email) {
		cadastroTransportador.email(Email);

	}

	@Quando("informo a (.*)")
	public void informo_a(String pass1) {
		cadastroTransportador.senha1(pass1);
	}

	@Quando("confirmo a (.*)")
	public void confirmo_a_senha(String pass2) throws InterruptedException {
		cadastroTransportador.senha2(pass2);
		Thread.sleep(4000);
	}

	@Quando("clico em cadastrar")
	public void clico_em_cadastrar() throws InterruptedException {
		cadastroTransportador.botaoCadastrarCelular();
		Thread.sleep(3000);
		cadastroTransportador.cadastroValidador();
		System.out.println("VALIDOU");
		Thread.sleep(8000);
	}

	@Entao("cadastro com sucesso")
	public void cadastro_com_sucesso() throws InterruptedException {
		cadastroTransportador.cadastroValidador();

	}

	
	
	@Quando("seleciono transportador")
	public void seleciono_transportador() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

}
