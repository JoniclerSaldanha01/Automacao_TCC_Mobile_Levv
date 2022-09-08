package steps;

import io.cucumber.java.pt.Quando;
import page.ClientePage;
import page.LojistaPage;

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
    public void clico_em_cadastrar_Cliente() {
        cliente.BotaoCadastrarCliente();
    }
}
