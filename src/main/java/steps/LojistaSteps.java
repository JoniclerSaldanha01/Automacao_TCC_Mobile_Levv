package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.LojistaPage;
import utils.BasePage;

import static utils.Utils.*;
import java.awt.AWTException;

public class LojistaSteps {

	LojistaPage cadastro = new LojistaPage(driver);

	@Dado("que o usuario esteja na tela de criacao de Cadastro")
	public void queOUsuarioEstejaNaTelaDeCriacaoDeCadastro() throws InterruptedException {
		BasePage.fixedWait(2);
		driver.hideKeyboard();
		cadastro.validarTelaRegistro();

	}

	@Quando("preencho o campo Nome")
	public void preencho_o_campo_Nome() throws InterruptedException {
	
		cadastro.nome();
		BasePage.fixedWait(2);

	}

	@Quando("informo Celular com DDD")
	public void informo_Celular_com_DDD() {
		driver.hideKeyboard();
		cadastro.phone();
	}

	@Quando("informo o email")
	public void informo_o_email() {
		cadastro.email();

	}

	@Quando("informo a Senha")
	public void informo_a_Senha() {
		cadastro.senha1();
	}

	@Quando("confirmo a Senha")
	public void confirmo_a_Senha() throws InterruptedException {
		cadastro.senha2();
		Thread.sleep(2000);
	}

	@Quando("clico em cadastrar")
	public void clico_em_cadastrar() throws InterruptedException {
		cadastro.botaoCadastrarCelular();
		Thread.sleep(3000);
		cadastro.cadastroValidador();
		System.out.println("VALIDOU");
		Thread.sleep(6000);
	}

	@Entao("cadastro com sucesso")
	public void cadastro_com_sucesso() throws InterruptedException {
		cadastro.cadastroValidador();

	}

	@Quando("seleciono lojista")
	public void seleciono_lojista() {
		cadastro.lojista();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Quando("informo dataNascimento  cpf e cnpj")
	public void informo_dataNascimento_cpf_e_cnpj() throws InterruptedException {
		cadastro.dataNascimento();
		cadastro.cpfLojista();
		cadastro.cnpjLojista();
		Thread.sleep(4000);
	}

	@Quando("informo Nome Empresa lojista")
	public void informo_Nome_Empresa_lojista() {
		cadastro.empresaNome();
	}

	@Quando("informo Nome Fantasia lojista nome fantasia")
	public void informo_Nome_fantasia() throws InterruptedException {
		cadastro.nomeFantasia();
		Thread.sleep(13000);
	}

	@Quando("cadastro usuario lojista")
	public void cadastro_usuario_lojista() throws InterruptedException {
		cadastro.BotaoCadastrarLojista();
		Thread.sleep(6000);
	}

	@E("preencho a tela de cadastro de endereco")
	public void preencho_a_tela_de_cadastro_de_endereco() throws InterruptedException {
		cadastro.CadastrarEndecoLojista();
		Thread.sleep(8000);
	}

	@Entao("cadastro com sucesso o endereco")
	public void cadastro_com_sucesso_o_endereco() throws InterruptedException, AWTException {

		cadastro.botaoCadastrarEndereco();
		Thread.sleep(8000);

	}

	// Produto Entrega
	@Dado("que acesse o sistema com usuario cadastrado")
	public void que_acesse_o_sistema_com_usuario_cadastrado() throws InterruptedException {
		Thread.sleep(3000);
		cadastro.usuarioCadastrado();

	}

	@Dado("acesso enviar produto")
	public void acesso_enviar_produto() throws InterruptedException {
		cadastro.produtoEnviar();
		Thread.sleep(3000);
	}

	@Quando("preencho os campos enviar produto")
	public void preencho_os_campos_enviar_produto() throws InterruptedException {
		cadastro.preencherCampos();
		Thread.sleep(22000);
	}

	@Quando("clico em enviar pedido")
	public void clico_em_enviar_pedido() throws InterruptedException {
		cadastro.enviarPedido();

	}

	@Entao("valido pedido em Pendentes")
	public void valido_pedido_em_Pendentes() throws InterruptedException {
		cadastro.validarPedido();

	}

}