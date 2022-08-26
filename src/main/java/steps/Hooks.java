package steps;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.Utils;

import static utils.Utils.acessarApp;
import static utils.Utils.driver;

public class Hooks {
    @Before
    public void setUp() throws Exception {
        acessarApp();
    }

    @After
    public void fecharApp(Scenario cenario) throws Exception{
     //  Utils.gerarScreenShot(cenario);
      //  driver.quit();
    }
    
    
}
