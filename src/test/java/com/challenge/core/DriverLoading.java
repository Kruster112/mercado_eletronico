package com.challenge.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverLoading {

	protected static WebDriver driver;
	protected static WebDriverWait waitDriver;

	@SuppressWarnings("deprecation")
	public void initialize() {
		// Apontamento de local do ChromeDriver.
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/driver/88/chromedriver.exe");
		
		// Instanciar o ChromeDriver na variável driver.
		driver = new ChromeDriver();
		
		// Instanciar o WebDriverWait na variavel waitDriver.
		waitDriver = new WebDriverWait(driver, 20);
	}

	public void close() {
		closeDriver();
	}

	public void quit() {
		quitDriver();
	}

	public WebDriver getDriver() {
		return driver;
	}

	private static void closeDriver() {
		driver.close();
	}

	private static void quitDriver() {
		driver.quit();
	}

}
