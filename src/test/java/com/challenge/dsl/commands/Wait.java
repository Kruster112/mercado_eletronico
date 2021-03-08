package com.challenge.dsl.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.challenge.dsl.BasePage;

public class Wait extends BasePage {

	// Método criado para apoio na validação de elementos.
	public void isVisible(String locator) {
		waitDriver.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
	}

	// Método criado para apoio na validação de elementos.
	public void isNotVisible(String locator) {
		waitDriver.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(locator)));
	}

}