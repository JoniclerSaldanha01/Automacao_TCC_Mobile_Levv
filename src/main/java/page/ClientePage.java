package page;

import attributes.ClienteAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;

public class ClientePage extends ClienteAttributes {


    public ClientePage(AppiumDriver<?> driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);

    }

    public void selecionaClente() {

        try {
            cliente.click();
            Thread.sleep(2000);
        }
        catch(Exception e) {

        }
    }

    public void dataEcpf(String dt, String cpf) {

        try {
            diaMesAno.sendKeys(dt);
            cpfLojista.sendKeys(cpf);
            Thread.sleep(2000);
        }
        catch(Exception e) {

        }
    }

    public void BotaoCadastrarCliente() {
        cadastrarCliente.click();

    }
}
