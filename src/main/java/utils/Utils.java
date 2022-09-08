package utils;

import java.net.URL;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
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

   

}
