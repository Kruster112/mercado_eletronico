package com.challenge.dsl;

import com.challenge.core.DriverLoading;
import com.challenge.dsl.commands.Click;
import com.challenge.dsl.commands.GetText;
import com.challenge.dsl.commands.Select;
import com.challenge.dsl.commands.SendKeys;
import com.challenge.dsl.commands.Utilities;
import com.challenge.dsl.commands.Wait;

public class BasePage extends DriverLoading {

	// Essa classe extende a classe de driver, facilitando a manipulação das DSLS e chamadas da ação.
	
	protected static Click click = new Click();
	protected static SendKeys sendKeys = new SendKeys();
	protected static Select select = new Select();
	protected static GetText getText = new GetText();
	protected static Utilities utils = new Utilities();
	protected static Wait wait = new Wait();

}
