package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CadastroTransportadorAttributes {

	
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


}
