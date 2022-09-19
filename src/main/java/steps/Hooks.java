package steps;

import io.cucumber.java.Scenario;
import io.appium.java_client.AppiumDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class Hooks {
	
	public static AppiumDriver<WebElement> driver;
    
    @Before
    public static void setUp() throws Exception {
        acessarApp();
    }
    
    
    @After
	public void tearDown(Scenario scenario) {

		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("Caso de Teste finalizado com Falha!!!");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.close();
	}

    /*
    @After
    public void fecharApp(Scenario cenario) throws Exception{
     //  Utils.gerarScreenShot(cenario);
        driver.quit();
    }
    */
    
}
 
        

    

