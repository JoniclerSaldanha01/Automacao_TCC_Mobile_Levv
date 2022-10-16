package page;

import attributes.ClienteAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;
import utils.Utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import static utils.BasePage.setText;
import static utils.Utils.getPropertySettings;

import java.io.File;
import java.io.IOException;

public class ClientePage extends ClienteAttributes {

	public ClientePage(AppiumDriver<?> driver) {

		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	public void nomeCliente() {

		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.NomeCliente"));
	}

	public void celular() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.Celular"));
	}

	public void emailCliente() {

		setText(Email, getPropertySettings("LevvMobile.data.email"));
	}

	public void senha1() {

		setText(password1, getPropertySettings("LevvMobile.data.Senha1"));
	}

	public void confirmarSenha() {

		setText(password2, getPropertySettings("LevvMobile.data.Senha1"));
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/1 Cadastro cliente.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void selecionaClente() throws InterruptedException {
		BasePage.implicitWait(cliente, 10);
		cliente.click();
		BasePage.fixedWait(6);

	}

	public void dataEcpf() throws InterruptedException {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimento"));
		cpfLojista.sendKeys(BasePage.gerarDocumento("CPF"));
		BasePage.fixedWait(6);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/2 Cliente-Dados.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	public void BotaoCadastrarCliente() throws InterruptedException {

		cadastrarCliente.click();
		BasePage.implicitWait(permitirLocalizacao, 10);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/4 Cliente-Permitir localizacao.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		permitirLocalizacao.click();

	}

	public void CadastrarEndecoCliente() throws InterruptedException {

		BasePage.implicitWait(logradouroLojista, 10);
		setText(logradouroLojista, getPropertySettings("LevvMobile.data.logradouro"));
		setText(numero, getPropertySettings("LevvMobile.data.numero"));
		setText(complemento, getPropertySettings("LevvMobile.data.complemento"));
		apartamentoTipo.click();
		setText(cep, getPropertySettings("LevvMobile.data.cep"));
		setText(bairro, getPropertySettings("LevvMobile.data.bairro"));
		setText(cidade, getPropertySettings("LevvMobile.data.cidade"));
		setText(estado, getPropertySettings("LevvMobile.data.estado"));
		BasePage.fixedWait(2);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/3 Cliente-Cadastro endereco.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		// estado.click();
	}

}
