package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.LojistaPage;
import static utils.Utils.*;
import java.awt.AWTException;

public class LojistaSteps {

	LojistaPage cadastro = new LojistaPage(driver);

	@Dado("que o usuario esteja na tela de criacao de Cadastro")
	public void queOUsuarioEstejaNaTelaDeCriacaoDeCadastro() throws InterruptedException {
		Thread.sleep(2000);
		driver.hideKeyboard();
		cadastro.validarTelaRegistro();

	}

	@Quando("preencho o campo Nome")
	public void preencho_o_campo_Nome() throws InterruptedException {

		cadastro.nome();
		Thread.sleep(2000);

	}

	@Quando("informo (.*) com DDD")
	public void informo_com_DDD(String int1) {
		driver.hideKeyboard();
		cadastro.phone(int1);
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

	@Quando("informo (.*)  (.*) e (.*)")
	public void informo_dataNascimento_cpf_e_cnpj(String dataNascimento, String cpf, String cnpj)
			throws InterruptedException {
		driver.hideKeyboard();
		cadastro.dataNascimento(dataNascimento);
		cadastro.cpfLojista(cpf);
		cadastro.cnpjLojista(cnpj);
		Thread.sleep(4000);
	}

	@Quando("informo (.*) lojista")
	public void informo_Quality_Assurence_LTDA_lojista(String NomeEmpresa) {
		cadastro.empresaNome(NomeEmpresa);
	}

	@Quando("informo (.*) lojista nome fantasia")
	public void informo_Testes_cia_lojista_nome_fantasia(String NomeFantasia) throws InterruptedException {
		cadastro.nomeFantasia(NomeFantasia);
		Thread.sleep(13000);
	}

	@Quando("cadastro usuario lojista")
	public void cadastro_usuario_lojista() throws InterruptedException {
		cadastro.BotaoCadastrarLojista();
		Thread.sleep(18000);
	}

	@Quando("preencho a tela de cadastro de endereco")
	public void preencho_a_tela_de_cadastro_de_endereco() throws InterruptedException {
		cadastro.CadastrarEndecoLojista();
		Thread.sleep(8000);
	}

	@Entao("cadastro com sucesso o endereco")
	public void cadastro_com_sucesso_o_endereco() throws InterruptedException, AWTException {
		driver.hideKeyboard();
		cadastro.botaoCadastrarEndereco();
		Thread.sleep(18000);

	}

	// Produto Entrega
	@Dado("que acesse o sistema com usuario cadastrado")
	public void que_acesse_o_sistema_com_usuario_cadastrado() throws InterruptedException {
		Thread.sleep(3000);
		driver.hideKeyboard();
		Thread.sleep(2000);
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
	public void valido_pedido_em_Pendentes() {

	}

}