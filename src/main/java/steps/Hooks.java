package steps;


import io.cucumber.java.Scenario;
import utils.Utils;
import io.appium.java_client.MobileDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.acessarApp;
import static utils.Utils.driver;
import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Hooks {

    @Rule
    public TestName testName = new TestName();
    
    @Before
	public static void setUp() throws Exception {
        acessarApp();

    }

    @After
	public static void fecharApp(Scenario cenario) throws Exception{
    	gerarScreenShot();
        driver.quit();
    }
    
    public static void gerarScreenShot() {
    	
    	try {
    		File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);      		
    		FileUtils.copyFile(imagem, new File("target/screenshots/Screenshot.png" ));
    		
    	} catch (IOException e) {
			e.printStackTrace();
		}
    
}
    
    
    /**
     * Retorna o browser inicialzado
     *
     * @return
     */
    public static MobileDriver getDriver() {
        return driver;
    }
}
