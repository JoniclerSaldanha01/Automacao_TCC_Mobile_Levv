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
	}
}
