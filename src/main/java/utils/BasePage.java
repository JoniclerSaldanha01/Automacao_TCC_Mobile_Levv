package utils;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import steps.Hooks;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class BasePage {

	// private static MobileDriver<MobileElement> driver = Hooks.getDriver();
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

	// Gerador de CPF e CNPJ
	public static String gerarDocumento(String tipoDocumento) {
		switch (tipoDocumento) {
		case "CPF":
			return gerarCPF();
		case "CNPJ":
			return gerarCNPJ();
		default:
			return gerarCPF();
		}
	}

	public static String gerarCPF() {
		int[] n = new int[11];
		int d1;
		int d2;
		Random rnd = new Random();
		for (int i = 1; i < 10; i++) {
			n[i] = rnd.nextInt(10);
		}
		d1 = 0;
		for (int i = 1; i < 10; i++) {
			d1 = d1 + n[10 - i] * (1 + i);
		}
		d1 = (11 - (d1 % 11));
		d1 = (d1 >= 10) ? 0 : d1;
		d2 = d1 * 2;
		for (int i = 1; i < 10; i++) {
			d2 = d2 + n[10 - i] * (2 + i);
		}
		d2 = (11 - (d2 % 11));
		d2 = (d2 >= 10) ? 0 : d2;
		StringBuilder cpf = new StringBuilder();
		for (int i = 1; i < 10; i++) {
			cpf.append(n[i]);
		}
		cpf.append(d1);
		cpf.append(d2);
		return cpf.toString();
	}

	public static String gerarCNPJ() {
		int[] n = new int[13];
		int d1;
		int d2;
		Random rnd = new Random();
		for (int i = 1; i < 9; i++) {
			n[i] = rnd.nextInt(10);
		}
		n[9] = 0;
		n[10] = 0;
		n[11] = rnd.nextInt(10);
		n[12] = rnd.nextInt(10);
		d1 = 0;
		for (int i = 1; i < 9; i++) {
			d1 = d1 + n[13 - i] * (1 + i);
		}
		for (int i = 1; i < 5; i++) {
			d1 = d1 + n[5 - i] * (1 + i);
		}
		d1 = (11 - (d1 % 11));
		d1 = (d1 >= 10) ? 0 : d1;
		d2 = d1 * 2;
		for (int i = 1; i < 8; i++) {
			d2 = d2 + n[13 - i] * (2 + i);
		}
		for (int i = 1; i < 6; i++) {
			d2 = d2 + n[6 - i] * (1 + i);
		}
		d2 = (11 - (d2 % 11));
		d2 = (d2 >= 10) ? 0 : d2;
		StringBuilder cnpj = new StringBuilder();
		for (int i = 1; i < 13; i++) {
			cnpj.append(n[i]);
		}
		cnpj.append(d1);
		cnpj.append(d2);
		return cnpj.toString();
	}
	

	
}
