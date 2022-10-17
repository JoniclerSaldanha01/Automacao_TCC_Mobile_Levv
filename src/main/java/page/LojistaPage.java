package page;

import static org.junit.Assert.*;
import static utils.BasePage.setText;
import static utils.Utils.getPropertySettings;
import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.PageFactory;
import attributes.LojistaAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;
import utils.Utils;

/**
 * @author Jonicler
 *
 */
public class LojistaPage extends LojistaAttributes {

	public LojistaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * valida Tela de Registro
	 */
	public void validarTelaRegistro() {

		BasePage.implicitWait(nameLastName, 10);
		assertTrue(nameLastName.isDisplayed());
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher Nome e Sobre nome
	 */
	public void nome() {
		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.nomeLojista"));

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher campo telefone
	 */
	public void phone() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.telefone"));
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher e-mail do Lojista
	 */
	public void email() {

		setText(Email, getPropertySettings("LevvMobile.data.emailLojista"));

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher o campo senha
	 */
	public void senha1() {

		setText(password1, getPropertySettings("LevvMobile.data.senhaLojista"));
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher o campo confirmar senha
	 */
	public void senha2() {

		setText(password2, getPropertySettings("LevvMobile.data.senhaLojista"));

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/1 Cadastrar  preenchida.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Botao Cadastrar Celular
	 */
	public void botaoCadastrarCelular() {
		BasePage.implicitWait(botaoCadastrar, 10);
		botaoCadastrar.click();
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Validar Cadastro
	 */
	public void cadastroValidador() {

		BasePage.implicitWait(validarCadastro, 10);
		assertTrue(validarCadastro.isDisplayed());
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Seleciona Lojista
	 */
	public void lojista() {
		BasePage.implicitWait(selecionaLojista, 10);
		selecionaLojista.click();

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Preencher Data Nascimento
	 */
	public void dataNascimento() {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dtNasc"));

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Preencher Campo CPF
	 */
	public void cpfLojista() {

		cpfLojista.sendKeys(BasePage.gerarDocumento("CPF"));

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher CNPJ
	 */
	public void cnpjLojista() {

		lojistaCnpj.sendKeys(BasePage.gerarDocumento("CNPJ"));

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher NOme empresa
	 */
	public void empresaNome() {

		setText(nomeEmp, getPropertySettings("LevvMobile.data.NomeEmpresa"));
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher nome fantasia Empresa
	 */
	public void nomeFantasia() {

		setText(nomeFantasia, getPropertySettings("LevvMobile.data.NomeFantasia"));

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/2 Lojista-Dados empresa.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Cadastrar Lojista
	 */
	public void BotaoCadastrarLojista() throws InterruptedException {

		cadastrarLojista.click();
		BasePage.fixedWait(4);
		// assertTrue(cadastroLojistaValidado.isDisplayed());
		// cadastroLojistaValidado.click();
		BasePage.fixedWait(2);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/3 Lojista-Permitir.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		permitir.click();
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Cadastrar Endereco Lojista
	 */
	public void CadastrarEndecoLojista() throws InterruptedException {

		BasePage.implicitWait(logradouroLojista, 10);
		logradouroLojista.setValue("Praça da Sé");
		numero.setValue("s/nº");
		complemento.setValue("Ponto comercial");
		lojaTipo.click();
		cep.setValue("01018-010");
		bairro.setValue("Centro Histórico de São Paulo");
		cidade.setValue("São Paulo");
		estado.setValue("São Paulo");
		BasePage.fixedWait(2);

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/4 Cadastro-Endereco preenchida.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Cadastrar Endereco
	 */
	public void botaoCadastrarEndereco() throws InterruptedException, AWTException {

		btnCadastrarEndereco.click();
		BasePage.fixedWait(1);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/5 Cadastrado.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		BasePage.implicitWait(enderecoLojistaValidado, 10);
		assertTrue(enderecoLojistaValidado.isDisplayed());
		// BasePage.implicitWait(enderecoLojistaValidado, 22);
		// assertEquals(enderecoLojistaValidado, falhaSistema);
	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Logar em usuario cadastrado
	 */
	public void usuarioCadastrado() {

		BasePage.implicitWait(usuarioJaCadastrado, 10);
		usuarioJaCadastrado.click();
		setText(emailCadastrado, getPropertySettings("LevvMobile.data.emailLojista"));
		setText(senhaCadastrada, getPropertySettings("LevvMobile.data.senhaLojista"));
		logar.click();
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/1 EnviarProduto-usuario Cadastrado.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Acessar Enviar Produto
	 */
	public void produtoEnviar() throws InterruptedException {
		BasePage.implicitWait(eviarProduto, 10);
		eviarProduto.click();
		BasePage.implicitWait(permitir, 10);
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/2 EnviarProduto-Permitir.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		permitir.click();

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * preencher campos Produto enviar
	 */
	public void preencherCampos() throws InterruptedException {
		BasePage.implicitWait(descricaoItem, 10);
		setText(descricaoItem, getPropertySettings("LevvMobile.data.descricaoItem"));
		BasePage.fixedWait(2);
		volume.click();
		setText(enderecoColeta, getPropertySettings("LevvMobile.data.endercoColeta"));
		setText(enderecoEntrega, getPropertySettings("LevvMobile.data.enderecoEntrega"));
		setText(valorNegociado, getPropertySettings("LevvMobile.data.valorNegociado"));

		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/3 EnviarProduto-preencher Campos Produtos.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Enviar pedido e Confirmar Valor
	 */
	public void enviarPedido() throws InterruptedException {

		btnEnviarPedido.click();
		BasePage.fixedWait(3);
		confirmarValor.click();
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/4 EnviarProduto-Confirma Valor.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * Metodo a ser chamado pela classe lojistaSteps, no qual contem o metodo para
	 * Validar Pedido
	 */
	public void validarPedido() throws InterruptedException {

		BasePage.implicitWait(acompanharEntrega, 10);
		acompanharEntrega.click();
		BasePage.implicitWait(abaPendentes, 10);
		abaPendentes.click();
		try {
			File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/5 EnviarProduto-Validar Pedido.png"));

		} catch (IOException e) {
			e.printStackTrace();
		}
		assertTrue(numeroPedido.isDisplayed());
		BasePage.fixedWait(6);

	}
}
