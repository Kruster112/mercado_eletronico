package com.challenge.dsl.commands;

import org.openqa.selenium.By;

import com.challenge.dsl.BasePage;

public class SendKeys extends BasePage {

	public SendKeys element(String locator, String value) throws Exception {
		final By locatorText = By.xpath(locator);

		if (!value.isEmpty()) {
			Thread.sleep(1500);
			driver.findElement(locatorText).sendKeys(value);
		}
		return this;
	}

}
