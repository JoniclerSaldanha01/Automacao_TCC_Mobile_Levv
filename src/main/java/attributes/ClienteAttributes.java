package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClienteAttributes {

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

	@AndroidFindBy(id = "com.example.levv:id/rbCliente")
	protected MobileElement cliente;

	@AndroidFindBy(id = "com.example.levv:id/editDtNascCadUser")
	protected MobileElement diaMesAno;

	@AndroidFindBy(id = "com.example.levv:id/editCpfCadUser")
	protected MobileElement cpfLojista;

	@AndroidFindBy(id = "com.example.levv:id/BtnUserCad")
	protected MobileElement cadastrarCliente;

	@AndroidFindBy(id = "com.android.permissioncontroller:id/permission_allow_foreground_only_button")
	protected MobileElement permitirLocalizacao;

	@AndroidFindBy(id = "com.example.levv:id/editLogradouro")
	protected MobileElement logradouroLojista;

	@AndroidFindBy(id = "com.example.levv:id/editCadEndNumero")
	protected MobileElement numero;

	@AndroidFindBy(id = "com.example.levv:id/editComplemento")
	protected MobileElement complemento;

	@AndroidFindBy(id = "com.example.levv:id/rbTipoDeMoradiaApt")
	protected MobileElement apartamentoTipo;

	@AndroidFindBy(id = "com.example.levv:id/editCep")
	protected MobileElement cep;

	@AndroidFindBy(id = "com.example.levv:id/editBairro")
	protected MobileElement bairro;

	@AndroidFindBy(id = "com.example.levv:id/editCidade")
	protected MobileElement cidade;

	@AndroidFindBy(id = "com.example.levv:id/editEstado")
	protected MobileElement estado;
}
