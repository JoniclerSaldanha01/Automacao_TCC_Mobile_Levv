package steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.acessarApp;
import static utils.Utils.driver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.Scenario;


public class Hooks {

    
    @Before
    public static void setUp() throws Exception {
        acessarApp();
    }


    @After
    public void fecharApp(Scenario scenario) throws Exception{
		try {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			if (scenario.isFailed()) {
				scenario.log("this is my failure message");
				TakesScreenshot ts = (TakesScreenshot) driver;
				byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", screenshotName);
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
		driver.quit();
    }
    
	}
 
        

    

