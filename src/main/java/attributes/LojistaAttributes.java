package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class LojistaAttributes {


// Atributos Tela de cadastro
    
    @AndroidFindBy(id = "com.example.levv:id/editNomeCadastrarFragment")
	protected MobileElement nameLastName;
    
    @AndroidFindBy(id = "com.example.levv:id/editCelularCadastrarFragment")
    protected MobileElement NumberPhone;
    
    @AndroidFindBy(id = "com.example.levv:id/editEmailCadastrarFragment")
    protected MobileElement Email;

    @AndroidFindBy(id = "com.example.levv:id/editSenha1CadastrarFragment")
    protected MobileElement password1;
    
    @AndroidFindBy(id = "com.example.levv:id/editSenha2CadastrarFragment")
    protected MobileElement password2;
    
    
    @AndroidFindBy(id = "com.example.levv:id/btnCadastrarLogar")
    protected MobileElement botaoCadastrar;
    
    @AndroidFindBy(id = "com.example.levv:id/editDtNascCadUser")
    protected MobileElement validarCadastro;

    
 // Atributos Tela cadastro Lojista   
    @AndroidFindBy(id = "com.example.levv:id/rbLojista")
    protected MobileElement selecionaLojista;
    
    
    @AndroidFindBy(id = "com.example.levv:id/editDtNascCadUser")
    protected MobileElement diaMesAno;
    
    @AndroidFindBy(id = "com.example.levv:id/editCpfCadUser")
    protected MobileElement cpfLojista;
    
    @AndroidFindBy(id = "com.example.levv:id/editLojistaCnpj")
    protected MobileElement lojistaCnpj;
    
    @AndroidFindBy(id = "com.example.levv:id/editLojistaNomeEmpresa")
    protected MobileElement nomeEmp;
    
    @AndroidFindBy(id = "com.example.levv:id/editLojistaNomeFantasia")
    protected MobileElement nomeFantasia;
    
    @AndroidFindBy(id = "com.example.levv:id/BtnUserCad")
    protected MobileElement cadastrarLojista;
    
    @AndroidFindBy(id = "com.android.packageinstaller:id/permission_allow_button")
    protected MobileElement cadastroLojistaValidado;
    
    
  //Cadastro endereco Lojista

	   @AndroidFindBy(id = "com.example.levv:id/editLogradouro")
		protected MobileElement logradouroLojista;
	  
	   @AndroidFindBy(id = "com.example.levv:id/editCadEndNumero")
		protected MobileElement numero;
	   
	   
	   @AndroidFindBy(id = "com.example.levv:id/editComplemento")
		protected MobileElement complemento;
	   
	   
	   @AndroidFindBy(id = "com.example.levv:id/rbTipoDeMoradiaLoja")
		protected MobileElement lojaTipo;
	   
	   
	   @AndroidFindBy(id = "com.example.levv:id/editCep")
		protected MobileElement cep;
	   
	   @AndroidFindBy(id = "com.example.levv:id/editBairro")
		protected MobileElement bairro;
	   
	   @AndroidFindBy(id = "com.example.levv:id/editCidade")
		protected MobileElement cidade;
	   
	   @AndroidFindBy(id = "com.example.levv:id/editEstado")
		protected MobileElement estado;
	   
	   @AndroidFindBy(id = "com.example.levv:id/btnCadEnd")
		protected MobileElement btnCadastrarEndereco;
	   
	   @AndroidFindBy(id = "com.example.levv:id/btnEntregarProduto")
		protected MobileElement enderecoLojistaValidado;

    @AndroidFindBy(id = "android:id/alertTitle")
    protected MobileElement falhaSistema;
    
    //////////////// Entrega /////////////////////////////
    @AndroidFindBy(id = "com.example.levv:id/txtCadastrarLogar")
    protected MobileElement usuarioJaCadastrado;
    
    
    @AndroidFindBy(id = "com.example.levv:id/editEmailCelularLoginFragment")
    protected MobileElement emailCadastrado;
    
    
    @AndroidFindBy(id = "com.example.levv:id/editSenhaCelularLoginFragment")
    protected MobileElement senhaCadastrada;
    
    
    @AndroidFindBy(id = "com.example.levv:id/btnCadastrarLogar")
    protected MobileElement logar;
    
    
    @AndroidFindBy(id = "com.example.levv:id/btnEnviarProduto")
    protected MobileElement eviarProduto;


    @AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
    protected MobileElement permitir;
    
    
    @AndroidFindBy(id = "com.example.levv:id/editDescricaoItem2")
    protected MobileElement descricaoItem;
    
    
    @AndroidFindBy(id = "com.example.levv:id/rbVolumeMedio")
    protected MobileElement volume;
    
    
    @AndroidFindBy(id = "com.example.levv:id/autoCompletarColeta")
    protected MobileElement enderecoColeta;
    
    
    @AndroidFindBy(id = "com.example.levv:id/autoCompletarEntrega")
    protected MobileElement enderecoEntrega;
    
    
    @AndroidFindBy(id = "com.example.levv:id/edtValorEstimado")
    protected MobileElement valorNegociado;
        

    @AndroidFindBy(id = "com.example.levv:id/btnEnviarPedido")
    protected MobileElement btnEnviarPedido;
    
    
    @AndroidFindBy(id = "android:id/button1")
    protected MobileElement confirmarValor;
    
    
    @AndroidFindBy(id = "com.example.levv:id/btnAcompanharProduto")
    protected MobileElement acompanharEntrega;
    
    
    @AndroidFindBy(id = "com.example.levv:id/btnPendentes")
    protected MobileElement abaPendentes;
    
    
    @AndroidFindBy(id = "com.example.levv:id/txtNumeroDoPedido")
    protected MobileElement numeroPedido;
    
    
    
}
