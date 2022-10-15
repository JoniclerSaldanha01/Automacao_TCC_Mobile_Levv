package page;

import static org.junit.Assert.*;
import static utils.BasePage.setText;
import static utils.Utils.driver;
import static utils.Utils.getPropertySettings;

import java.awt.AWTException;
import org.openqa.selenium.support.PageFactory;
import attributes.LojistaAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.BasePage;

public class LojistaPage extends LojistaAttributes {

	public LojistaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

// Valida tela de cadastro
	public void validarTelaRegistro() {

		BasePage.implicitWait(nameLastName, 10);
		assertTrue(nameLastName.isDisplayed());
	}

// Insere Nome e SobreNome    
	public void nome() {
		BasePage.implicitWait(nameLastName, 10);
		setText(nameLastName, getPropertySettings("LevvMobile.data.nomeLojista"));

	}

	public void phone() {

		setText(NumberPhone, getPropertySettings("LevvMobile.data.telefone"));
	}

	public void email() {

		setText(Email, getPropertySettings("LevvMobile.data.emailLojista"));

	}

	public void senha1() {

		setText(password1, getPropertySettings("LevvMobile.data.senhaLojista"));
	}

	public void senha2() {

		setText(password2, getPropertySettings("LevvMobile.data.senhaLojista"));

	}

	public void botaoCadastrarCelular() {
		BasePage.implicitWait(botaoCadastrar, 10);		
		System.out.println("CLICK");
		botaoCadastrar.click();
	}

	public void cadastroValidador() {

		BasePage.implicitWait(validarCadastro, 10);
		assertTrue(validarCadastro.isDisplayed());
	}

	public void lojista() {
		BasePage.implicitWait(selecionaLojista, 10);
		selecionaLojista.click();

	}

	// Cadastro Tela Lojista

	public void dataNascimento() {

		setText(diaMesAno, getPropertySettings("LevvMobile.data.dtNasc"));

	}

	public void cpfLojista() {
		
		cpfLojista.sendKeys(BasePage.gerarDocumento("CPF"));
		
	}

	public void cnpjLojista() {
		
		lojistaCnpj.sendKeys(BasePage.gerarDocumento("CNPJ"));
		
	}

	public void empresaNome() {

		setText(nomeEmp, getPropertySettings("LevvMobile.data.NomeEmpresa"));
	}

	public void nomeFantasia() {

		setText(nomeFantasia, getPropertySettings("LevvMobile.data.NomeFantasia"));
	}

	public void BotaoCadastrarLojista() throws InterruptedException {

		cadastrarLojista.click();
		BasePage.fixedWait(4);
		//assertTrue(cadastroLojistaValidado.isDisplayed());
		//cadastroLojistaValidado.click();
		System.out.println("PERMITIR");
		BasePage.fixedWait(2);
		permitir.click();
	}

	// CADASTRO ENDERECO LOJISTA

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
		
	}

	public void botaoCadastrarEndereco() throws InterruptedException, AWTException {

		btnCadastrarEndereco.click();
		BasePage.implicitWait(enderecoLojistaValidado, 10);
		assertTrue(enderecoLojistaValidado.isDisplayed());
		System.out.println("VALIDADO CADASTRO LOJISTA");
		//BasePage.implicitWait(enderecoLojistaValidado, 22);
		//assertEquals(enderecoLojistaValidado, falhaSistema);
	}

	public void usuarioCadastrado() {

		BasePage.implicitWait(usuarioJaCadastrado, 10);
		usuarioJaCadastrado.click();
		setText(emailCadastrado, getPropertySettings("LevvMobile.data.emailLojista"));
		setText(senhaCadastrada, getPropertySettings("LevvMobile.data.senhaLojista"));
		logar.click();

	}

	public void produtoEnviar() throws InterruptedException {
		BasePage.implicitWait(eviarProduto, 10);
		eviarProduto.click();
		BasePage.implicitWait(permitir, 10);
		permitir.click();

		}

	public void preencherCampos() throws InterruptedException {
		BasePage.implicitWait(descricaoItem, 10);
		setText(descricaoItem, getPropertySettings("LevvMobile.data.descricaoItem"));
		BasePage.fixedWait(2);
		volume.click();
		setText(enderecoColeta, getPropertySettings("LevvMobile.data.endercoColeta"));
		setText(enderecoEntrega, getPropertySettings("LevvMobile.data.enderecoEntrega"));
		setText(valorNegociado, getPropertySettings("LevvMobile.data.valorNegociado"));
		valorNegociado.click();
		driver.hideKeyboard();

	}

	public void enviarPedido() throws InterruptedException {

		btnEnviarPedido.click();
		// BasePage.fixedWait(4);
		// btnEnviarPedido.click();
		BasePage.fixedWait(3);
		confirmarValor.click();

	}

	public void validarPedido() throws InterruptedException {

		BasePage.implicitWait(acompanharEntrega, 10);
		acompanharEntrega.click();
		BasePage.implicitWait(abaPendentes, 10);
		abaPendentes.click();
		assertTrue(numeroPedido.isDisplayed());
		BasePage.fixedWait(6);
	}
}
