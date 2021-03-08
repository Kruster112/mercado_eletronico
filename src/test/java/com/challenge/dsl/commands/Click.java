package com.challenge.dsl.commands;

import org.openqa.selenium.By;

import com.challenge.dsl.BasePage;

public class Click extends BasePage {

	public Click element(String locator) throws Exception {
		final By locatorText = By.xpath(locator);
		driver.findElement(locatorText).click();
		return this;
	}
}
