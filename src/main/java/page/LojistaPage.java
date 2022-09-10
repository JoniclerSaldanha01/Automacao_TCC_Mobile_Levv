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

public class LojistaPage extends LojistaAttributes {

	public LojistaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

// Valida tela de cadastro
	public void validarTelaRegistro() {
		assertTrue(nameLastName.isDisplayed());
	}

// Insere Nome e SobreNome    
	public void nome() {
		setText(nameLastName,getPropertySettings("LevvMobile.data.nomeLojista"));

	}

	public void phone(String number) {
		NumberPhone.sendKeys(number);
	}

	public void email() {
		setText(Email,getPropertySettings("LevvMobile.data.email"));

	}

	public void senha1() {
		setText(password1,getPropertySettings("LevvMobile.data.senha"));
		}

	public void senha2() {
		setText(password2,getPropertySettings("LevvMobile.data.senha"));

	}

	public void botaoCadastrarCelular() {
		botaoCadastrar.click();
	}

	public void cadastroValidador() {
		assertTrue(validarCadastro.isDisplayed());
	}

	public void lojista() {
		selecionaLojista.click();

	}

	// Cadastro Tela Lojista

	public void dataNascimento(String dtNasc) {
		diaMesAno.sendKeys(dtNasc);

	}

	public void cpfLojista(String cpf) {
		cpfLojista.sendKeys(cpf);

	}

	public void cnpjLojista(String cnpj) {
		lojistaCnpj.sendKeys(cnpj);

	}

	public void empresaNome(String nomeEmpresa) {
		nomeEmp.sendKeys(nomeEmpresa);

	}

	public void nomeFantasia(String nomeFant) {
		nomeFantasia.sendKeys(nomeFant);

	}

	public void BotaoCadastrarLojista() {
		cadastrarLojista.click();
		assertTrue(cadastroLojistaValidado.isDisplayed());
		cadastroLojistaValidado.click();
	}

	// CADASTRO ENDERECO LOJISTA

	public void CadastrarEndecoLojista() throws InterruptedException {
		logradouroLojista.setValue("Praça da Sé");
		numero.setValue("s/nº");
		complemento.setValue("Ponto comercial");
		lojaTipo.click();
		cep.setValue("01018-010");
		bairro.setValue("Centro Histórico de São Paulo");
		cidade.setValue("São Paulo");
		estado.setValue("São Paulo");
		Thread.sleep(2000);
		estado.click();
	}

	public void botaoCadastrarEndereco() throws InterruptedException, AWTException {

		btnCadastrarEndereco.click();
		assertTrue(enderecoLojistaValidado.isDisplayed());
		System.out.println("VALIDADO CADASTRO LOJISTA");
		Thread.sleep(12000);
		assertEquals(enderecoLojistaValidado, falhaSistema);
	}
	
	public void usuarioCadastrado() {
		usuarioJaCadastrado.click();
		driver.hideKeyboard();
		setText(emailCadastrado,getPropertySettings("LevvMobile.data.email"));
		setText(senhaCadastrada,getPropertySettings("LevvMobile.data.senha"));
		logar.click();

		
	}
	
	public void produtoEnviar() throws InterruptedException {
		eviarProduto.click();
		Thread.sleep(3000);
		permitir.click();
	}
	
	public void preencherCampos() throws InterruptedException {
		setText(descricaoItem,getPropertySettings("LevvMobile.data.descricaoItem"));
		Thread.sleep(2000);
		driver.hideKeyboard();
		volume.click();
		setText(enderecoColeta,getPropertySettings("LevvMobile.data.endercoColeta"));
		setText(enderecoEntrega,getPropertySettings("LevvMobile.data.enderecoEntrega"));
		setText(valorNegociado,getPropertySettings("LevvMobile.data.valorNegociado"));
		valorNegociado.click();
		driver.hideKeyboard();


			
		
	}

	
	public void enviarPedido() throws InterruptedException {
		btnEnviarPedido.click();
		Thread.sleep(4000);
		btnEnviarPedido.click();
		confirmarValor.click();
	}
	
}
