package steps;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import page.ClientePage;
import utils.BasePage;

import static utils.Utils.driver;

public class ClienteSteps {

	ClientePage cliente = new ClientePage(driver);

	@Quando("preencho o campo Nome Cliente Cliente")
	public void preencho_o_campo_nome_cliente_cliente() {
		cliente.nomeCliente();
	}

	@E("informo Celular com DDD Cliente")
	public void informo_celular_com_ddd_cliente() {
		cliente.celular();
	}

	@E("informo o email Cliente")
	public void informo_o_email_cliente() {
		cliente.emailCliente();
	}

	@E("informo a Senha1 Cliente")
	public void informo_a_senha1_cliente() {
		cliente.senha1();
	}

	@E("confirmo a Senha Cliente")
	public void confirmo_a_senha_cliente() {
		cliente.confirmarSenha();
	}

	@Quando("seleciono cliente")
	public void seleciono_cliente() throws InterruptedException {
		cliente.selecionaCliente();

	}

	@E("preencho data Nascimento e cpf Cliente")
	public void preencho_data_nascimento_e_cpf_cliente() throws InterruptedException {
		cliente.dataEcpf();
	}

	@Quando("clico em cadastrar Cliente")
	public void clico_em_cadastrar_Cliente() throws InterruptedException {
		cliente.BotaoCadastrarCliente();
		
	}

	@E("preencho a tela de cadastro de endereco cliente")
	public void preencho_a_tela_de_cadastro_de_endereco_cliente() throws InterruptedException {
		cliente.CadastrarEnderecoCliente();
		
	}

}
