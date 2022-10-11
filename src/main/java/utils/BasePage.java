package utils;

import io.appium.java_client.MobileElement;
import org.openqa.selenium.*;
import steps.Hooks;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BasePage {

	// private static WebDriver driver = Hooks.getDriver();
	// private static int numArquivos = 0;
	private static Duration gap(int time) {
		return Duration.ofSeconds(time);
	}
	// private final Logger logger = Logger.getLogger(BasePage.class);

	public BasePage() {
	}

	/**
	 * Envia um determinado texto parametrizado de acordo com o WebElement com uma
	 * espera
	 *
	 * @param mobileElement
	 * @param text
	 */
	public static void setText(MobileElement mobileElement, String text) {
		implicitWait(mobileElement, 10);
		mobileElement.setValue(text);
		Hooks.gerarScreenShot();
	}

	/**
	 * Espera Explicita
	 * 
	 * @param seconds
	 */
	public static void fixedWait(int seconds) {
		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			Hooks.gerarScreenShot();
		}
	}

	/**
	 * Espera implicita
	 * 
	 * @param element
	 * @param timeOutSeconds
	 */
	public static void implicitWait(WebElement element, int timeOutSeconds) {
		Utils.driver.manage().timeouts().implicitlyWait(timeOutSeconds, TimeUnit.SECONDS);
		if (element.isDisplayed()) {
			Utils.driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
		}
	}

}
