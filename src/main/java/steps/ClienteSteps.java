package steps;

import io.cucumber.java.pt.Quando;
import page.ClientePage;
import static utils.Utils.driver;

public class ClienteSteps {

	ClientePage cliente = new ClientePage(driver);

	@Quando("seleciono cliente")
	public void seleciono_cliente() throws InterruptedException {
		cliente.selecionaClente();

	}

	@Quando("informo (.*)  (.*)")
	public void informo(String dtNasc, String nCpf) {
		cliente.dataEcpf(dtNasc, nCpf);
	}

	@Quando("clico em cadastrar Cliente")
	public void clico_em_cadastrar_Cliente() throws InterruptedException {
		cliente.BotaoCadastrarCliente();
		Thread.sleep(8000);
	}

	@Quando("preencho a tela de cadastro de endereco cliente")
	public void preencho_a_tela_de_cadastro_de_endereco_cliente() throws InterruptedException {
		cliente.CadastrarEndecoCliente();
		Thread.sleep(8000);
	}

}
