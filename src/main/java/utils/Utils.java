package utils;

import java.io.FileInputStream;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;


public class Utils {

    public static AppiumDriver<MobileElement> driver;

    public static void acessarApp() throws Exception {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("deviceName", "Device");
        desiredCapabilities.setCapability("automationName", "uiautomator2");
        desiredCapabilities.setCapability("appPackage", "com.example.levv");
        desiredCapabilities.setCapability("appActivity", ".view.funcional.TelaSplashActivity");
        driver = new AppiumDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), desiredCapabilities);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public static Properties loadProperties(String propertiesPath) {
        Properties prop = new Properties();
        try {
            FileInputStream input = new FileInputStream(propertiesPath);
            prop.load(input);
            input.close();
        } catch (Exception e) {
            throw new RuntimeException("Cannot load propertie file: " + propertiesPath);
        }
        return prop;
    }

    public static  String getPropertySettings(String key){
        return getProperty(loadProperties(System.getProperty("user.dir") + "\\src\\main\\resources\\dataform.properties"), key);
    }

    public static String getProperty(Properties prop, String propertyKey) {
        try {
            if (System.getProperty(propertyKey) != null) {
                return System.getProperty(propertyKey);
            }
            return prop.getProperty(propertyKey).trim();
        } catch (Exception e) {
            String error_msg = String.format("Cannot load propertie %s. Error %s", propertyKey,
                    e.getMessage());
            throw new IllegalStateException(error_msg);
        }
    }
    
    
}
