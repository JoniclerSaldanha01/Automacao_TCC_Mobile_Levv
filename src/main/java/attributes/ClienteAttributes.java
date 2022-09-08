package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class ClienteAttributes {

    @AndroidFindBy(id = "com.example.levv:id/rbCliente")
    protected MobileElement cliente;

    @AndroidFindBy(id = "com.example.levv:id/editDtNascCadUser")
    protected MobileElement diaMesAno;

    @AndroidFindBy(id = "com.example.levv:id/editCpfCadUser")
    protected MobileElement cpfLojista;

    @AndroidFindBy(id = "com.example.levv:id/BtnUserCad")
    protected MobileElement cadastrarCliente;
}
