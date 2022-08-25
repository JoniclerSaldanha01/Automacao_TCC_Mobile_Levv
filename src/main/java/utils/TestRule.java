package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.appium.java_client.AppiumDriver;

public class TestRule {

	private static AppiumDriver<WebElement> driver;
	//private static WebDriver driver;
	private static ExtentHtmlReporter htmlReporter;
	private static ExtentReports extentReport;
	private static ExtentTest extentTest;

	@Before
	public void beforeCenario(Scenario cenario) {
		if (extentReport == null) {
			extentReport = new ExtentReports();
			htmlReporter = new ExtentHtmlReporter("src/test/resources/htmlReporter.html");
			extentReport.attachReporter(htmlReporter);
		}

		extentTest = extentReport.createTest(cenario.getId());

		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver.exe");

		// Para acessar a base de dados corretamente
		ChromeOptions options = new ChromeOptions();
		options.addArguments("user-data-dir=C:/Users/Nataliaado/AppData/Local/Google/Chrome/User Data");

		// Inicia o driver e navega at� a p�gina inicial
		driver = new AppiumDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.navigate().to("file:///C:/Users/Nataliaado/Documents/versao2/Vers�o 2/index.html");

	}

	@After
	public void afterCenario(Scenario cenario) {
		if (cenario.isFailed()) {
			extentTest.log(Status.FAIL, "Cenario " + cenario.getName() + " executado com falhas");
			extentReport.flush();
		} else {
			extentTest.log(Status.PASS, "Cenario " + cenario.getName() + " executado com sucesso");
			extentReport.flush();
		}

		if (driver != null) {
			driver.close();
		}

	}

	public static WebDriver getDriver() {
		return driver;
	}

	public static ExtentTest getExtentTest() {
		return extentTest;
	}
}
