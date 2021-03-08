package com.challenge.dsl.commands;

import org.openqa.selenium.By;

import com.challenge.dsl.BasePage;

public class Select extends BasePage {

	public Select element(String locator, String value) throws Exception {
		final By locatorText = By.xpath(locator);
		new org.openqa.selenium.support.ui.Select(driver.findElement(locatorText)).selectByVisibleText(value);

		return this;
	}
	
	public Select elementValue(String locator, String value) throws Exception {
		final By locatorText = By.xpath(locator);
		new org.openqa.selenium.support.ui.Select(driver.findElement(locatorText)).selectByValue(value);

		return this;
	}
}

