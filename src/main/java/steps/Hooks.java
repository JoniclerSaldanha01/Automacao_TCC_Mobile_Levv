package steps;


import io.cucumber.java.Scenario;
import utils.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static utils.Utils.acessarApp;
import static utils.Utils.driver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @Rule
    public TestName testName = new TestName();
    
    @Before
	public static void setUp() throws Exception {
        acessarApp();
    }

    @After
	public void fecharApp(Scenario cenario) throws Exception{
    	gerarScreenShot();
        driver.quit();
    }
    
    public void gerarScreenShot() {
    	try {
    		File imagem = ((TakesScreenshot) Utils.driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(imagem, new File("target/screenshots/"+testName.getMethodName()+".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
    
}
    
}
