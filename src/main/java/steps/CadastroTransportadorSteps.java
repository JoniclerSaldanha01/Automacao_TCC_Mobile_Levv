package steps;

import static utils.Utils.driver;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import page.CadastroLojistaPage;
import page.CadastroTransportadorPage;


public class CadastroTransportadorSteps {
	
	CadastroTransportadorPage cadastroTransportador = new CadastroTransportadorPage(driver);
	
	@Quando("seleciono transportador")
	public void seleciono_transportador() {
		cadastroTransportador.selecionaTransportador();
	}
	
	@E("preencho a (.*) e (.*) do transportador")
	public void preencho_a_e_do_transportador(String dtNasc, String nCpf) {
		cadastroTransportador.dataEcpf(dtNasc, nCpf);
	    
	}

	@Quando("preencho o (.*) do transportador")
	public void preencho_o_Documento_do_transportador(String doc) {
		cadastroTransportador.numeroDocumento(doc);
		driver.hideKeyboard();
	}

	@Quando("envio uma foto do IDT")
	public void envio_uma_foto_do_IDT() {
		cadastroTransportador.imagemIdt();
	}

	@Quando("seleciono o veiculo")
	public void seleciono_o_veiculo() {
		System.out.println("Seleciona Tipo Transporte");
		cadastroTransportador.selecionaTransporte();
	}

	@Quando("preencho demais campos obrigatorios")
	public void preencho_demais_campos_obrigatorios() {
		cadastroTransportador.camposObrigatorios();
	}
	
	@Quando("envio foto CRLV")
	public void envio_foto_CRLV() throws InterruptedException {
		cadastroTransportador.emitrCrlv();
		Thread.sleep(20000);
	}
	
	@Quando("efetuo o cadastro do transportador")
	public void efetuo_o_cadastro_do_transportador() throws InterruptedException {
		cadastroTransportador.btnCadastrar();
		Thread.sleep(20000);

	}

}
