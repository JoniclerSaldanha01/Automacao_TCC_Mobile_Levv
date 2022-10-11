package steps;

import static utils.Utils.driver;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import page.TransportadorPage;

public class TransportadorSteps {

	TransportadorPage cadastroTransportador = new TransportadorPage(driver);

	@E("preencho o campo Nome Transportador")
	public void preencho_o_campo_nome_transportador() {
		cadastroTransportador.nomeTransportador();
	}

	@E("informo Celular com DDD Transportador")
	public void informo_celular_com_ddd_transportador() {
		cadastroTransportador.celularTransportador();
	}

	@E("informo o email Transportador")
	public void informo_o_email_transportador() {
		cadastroTransportador.emailTransportador();
	}

	@E("informo a Senha1 Transportador")
	public void informo_a_senha1_transportador() {
		cadastroTransportador.senhaTransportador();
	}

	@E("confirmo a Senha1 Transportador")
	public void confirmo_a_senha1_transportador() {
		cadastroTransportador.confirmaSenhaTransportador();
	}

	@E("seleciono transportador")
	public void seleciono_transportador() throws InterruptedException {
		cadastroTransportador.selecionaTransportador();
	}

	@E("preencho a dataNascimento e cpf do transportador")
	public void preencho_a_dataNascimento_e_cpf_do_transportador() throws InterruptedException {
		cadastroTransportador.dataEcpf();

	}

	@E("preencho o Documento do transportador")
	public void preencho_o_Documento_do_transportador() throws InterruptedException {
		cadastroTransportador.numeroDocumento();
		driver.hideKeyboard();
	}

	@E("envio uma foto do IDT")
	public void envio_uma_foto_do_IDT() throws InterruptedException {
		cadastroTransportador.imagemIdt();
	}

	@E("seleciono o veiculo")
	public void seleciono_o_veiculo() throws InterruptedException {
		System.out.println("Seleciona Tipo Transporte");
		cadastroTransportador.selecionaTransporte();
	}

	@Quando("preencho demais campos obrigatorios")
	public void preencho_demais_campos_obrigatorios() throws InterruptedException {
		cadastroTransportador.camposObrigatorios();
	}

	@E("envio foto CRLV")
	public void envio_foto_CRLV() throws InterruptedException {
		cadastroTransportador.emitrCrlv();

	}

	@Quando("efetuo o cadastro do transportador")
	public void efetuo_o_cadastro_do_transportador() throws InterruptedException {
		cadastroTransportador.btnCadastrar();

	}

}
