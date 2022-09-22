package page;

import static org.junit.Assert.*;
import static utils.BasePage.setText;
import static utils.Utils.driver;
import static utils.Utils.getPropertySettings;
import java.awt.AWTException;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import attributes.LojistaAttributes;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import steps.Hooks;

public class LojistaPage extends LojistaAttributes {

	public LojistaPage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);

	}

	
// Valida tela de cadastro
	public void validarTelaRegistro() {
		try {

			assertTrue(nameLastName.isDisplayed());

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

// Insere Nome e SobreNome    
	public void nome() {
		try {

			setText(nameLastName, getPropertySettings("LevvMobile.data.nomeLojista"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void phone() {
		try {

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}
		setText(NumberPhone, getPropertySettings("LevvMobile.data.celular"));

	}

	public void email() {
		try {

			setText(Email, getPropertySettings("LevvMobile.data.email"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void senha1() {
		try {

			setText(password1, getPropertySettings("LevvMobile.data.senha"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void senha2() {
		try {

			setText(password2, getPropertySettings("LevvMobile.data.senha"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void botaoCadastrarCelular() {
		try {

			botaoCadastrar.click();

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void cadastroValidador() {
		try {

			assertTrue(validarCadastro.isDisplayed());

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void lojista() {
		try {

			selecionaLojista.click();

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	// Cadastro Tela Lojista

	public void dataNascimento() {
		try {

			setText(diaMesAno, getPropertySettings("LevvMobile.data.dataNascimento"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void cpfLojista() {
		try {

			setText(cpfLojista, getPropertySettings("LevvMobile.data.cpf"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void cnpjLojista() {
		try {

			setText(lojistaCnpj, getPropertySettings("LevvMobile.data.cnpj"));

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void empresaNome() {
		try {

			setText(nomeEmp, getPropertySettings("LevvMobile.data.nomeEmpresa"));
		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void nomeFantasia() {
		try {

			setText(nomeFantasia, getPropertySettings("LevvMobile.data.nomeFantasia"));
		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void BotaoCadastrarLojista() throws InterruptedException {
		try {

			cadastrarLojista.click();
			System.out.println("PERMITIR");
			Thread.sleep(2000);
			permitir.click();

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	// CADASTRO ENDERECO LOJISTA

	public void CadastrarEndecoLojista() throws InterruptedException {
		try {

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

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void botaoCadastrarEndereco() throws InterruptedException, AWTException {
		try {

			btnCadastrarEndereco.click();
			assertTrue(enderecoLojistaValidado.isDisplayed());
			System.out.println("VALIDADO CADASTRO LOJISTA");
			Thread.sleep(22000);
			assertEquals(enderecoLojistaValidado, Hooks.driver.getTitle());

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void usuarioCadastrado() {
		try {

			usuarioJaCadastrado.click();
			driver.hideKeyboard();
			setText(emailCadastrado, getPropertySettings("LevvMobile.data.email"));
			setText(senhaCadastrada, getPropertySettings("LevvMobile.data.senha"));
			logar.click();

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void produtoEnviar() throws InterruptedException {
		try {

			eviarProduto.click();
			Thread.sleep(3000);
			permitir.click();
			Thread.sleep(8000);

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void preencherCampos() throws InterruptedException {
		try {

			setText(descricaoItem, getPropertySettings("LevvMobile.data.descricaoItem"));
			Thread.sleep(2000);
			driver.hideKeyboard();
			volume.click();
			setText(enderecoColeta, getPropertySettings("LevvMobile.data.endercoColeta"));
			setText(enderecoEntrega, getPropertySettings("LevvMobile.data.enderecoEntrega"));
			setText(valorNegociado, getPropertySettings("LevvMobile.data.valorNegociado"));
			valorNegociado.click();
			driver.hideKeyboard();

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}

	public void enviarPedido() throws InterruptedException {
		
			btnEnviarPedido.click();
			Thread.sleep(4000);

			if (confirmarValor.isDisplayed()) {
				System.out.println("Clicar em SIM");
				confirmarValor.click();
			} else {
				
				Hooks.driver.getTitle();
			
			}
	

	}

	public void validarPedido() throws InterruptedException {
		try {

			Thread.sleep(6000);
			acompanharEntrega.click();
			Thread.sleep(2000);
			abaPendentes.click();
			if (numeroPedido.isDisplayed()) {
				System.out.println("Pedido Validado");
			} else {
				 Hooks.driver.getTitle();
			}

			Thread.sleep(6000);

		} catch (Exception e) {
			System.err.println("Nao foi possivel acessar: " + e);
		}

	}
}
