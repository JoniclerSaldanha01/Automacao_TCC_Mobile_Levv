package attributes;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CadastroTransportadorAttributes {

	
// Atributos Tela de cadastro
    
	@AndroidFindBy(id = "com.example.levv:id/editDtNascCadUser")
    protected MobileElement diaMesAno;
    
    @AndroidFindBy(id = "com.example.levv:id/editCpfCadUser")
    protected MobileElement cpfLojista;
    
    @AndroidFindBy(id = "com.example.levv:id/rbEntregador")
	protected MobileElement transportador;
    
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_doc_nr_edit")
   	protected MobileElement docIdentificacao;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_doc_btn")
   	protected MobileElement btnIdt;

    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
   	protected MobileElement fotoIdt;
    
    @AndroidFindBy(id = "com.android.camera2:id/done_button")
   	protected MobileElement aceitarFotoIdt;
    
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_veiculo_crlv_btn")
   	protected MobileElement crlv;
    
    @AndroidFindBy(id = "com.android.camera2:id/shutter_button")
   	protected MobileElement btnFotoCrlv;
    
    @AndroidFindBy(id = "com.android.camera2:id/done_button")
   	protected MobileElement aceitarCrlv;
    
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////  
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_veiculo_marca_edit")
   	protected MobileElement marca;
    
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_veiculo_renavam_edit")
   	protected MobileElement renavan;
    
    @AndroidFindBy(id = "com.example.levv:id/tela_fragment_cadastro_entregador_veiculo_placa_edit")
   	protected MobileElement placa;
    


}
