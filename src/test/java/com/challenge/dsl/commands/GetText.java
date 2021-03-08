package com.challenge.dsl.commands;

import org.openqa.selenium.By;

import com.challenge.dsl.BasePage;

public class GetText extends BasePage {

	/**
	 * Retorna o texto de um elemento
	 * 
	 * @param xpath = xpath do elemento
	 * @throws Exception
	 */
	public String element(String locator) throws Exception {
		final By locatorText = By.xpath(locator);
		String texto = "";
		texto = driver.findElement(locatorText).getText().toString();

		return texto;

	}

	public String getAttribute(String locator, String element) {
		final By locatorText = By.xpath(locator);
		return driver.findElement(locatorText).getAttribute(element).toString();
	}

}
