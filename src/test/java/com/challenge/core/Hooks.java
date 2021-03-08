package com.challenge.core;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {

	DriverLoading driverLoading = new DriverLoading();
	
	@Before(order = 0)
	public void inicio() {
		driverLoading.initialize();
		driverLoading.getDriver().manage().deleteAllCookies();
	}

	@After(order = 0)
	public void fimFluxo(Scenario scenario) {
		if (scenario.isFailed()) {
			TakesScreenshot screenshotTaker = (TakesScreenshot) driverLoading.getDriver();
			byte[] screenshot = screenshotTaker.getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenshot, "image/png");
		}
		driverLoading.quit();
	}

}
