package utils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.TimeUnit;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.cucumber.core.api.Scenario;
import io.appium.java_client.AppiumDriver;


public class Utils {

    public static AppiumDriver<WebElement> driver;

    public static void acessarApp() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Device");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.levv");
        desiredCapabilities.setCapability("appActivity", ".view.funcional.TelaSplashActivity");
        driver = new AppiumDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static void logPrint(String strLog) {
        String strLogFormatado = formatarNomeLog(strLog);
        ExtentTest extentTest = TestRule.getExtentTest();
        try {
            efetuarPrintTela(strLogFormatado);
            extentTest.log(Status.INFO, strLog,
                    MediaEntityBuilder.createScreenCaptureFromPath(
                                    System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLogFormatado + ".png")
                            .build());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void efetuarPrintTela(String strLog) {
        File scrFile = ((TakesScreenshot) TestRule.getDriver()).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scrFile,
                    new File(System.getProperty("user.dir") + "\\src\\test\\resources\\" + strLog + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void logPass(String strMensagem) {
        ExtentTest extentTest = TestRule.getExtentTest();
        extentTest.log(Status.PASS, strMensagem);
    }

    public static void logFail(String strMensagem) {
        ExtentTest extentTest = TestRule.getExtentTest();
        extentTest.log(Status.FAIL, strMensagem);
    }

    public static void wait(int intSegundos) {
        try {
            synchronized (TestRule.getDriver()) {
                TestRule.getDriver().wait(intSegundos * 1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    private static String formatarNomeLog(String strLog) {
        LocalDateTime dataHoraAgora = LocalDateTime.now();
        DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("dd_MM_yy_HH_mm_ss");
        String strLogFormatado = strLog + "_" + dataHoraAgora.format(formatoDataHora);
        return strLogFormatado;
    }

}
