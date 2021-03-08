package com.challenge.page;

import org.openqa.selenium.By;

import com.challenge.dsl.BasePage;

public class LoginPage extends BasePage {
	public void personalInformation(String title, String firstName, String lastName, String email, String password)
			throws Exception {

		// Caso o titulo for Mr, alterar o valor para 1 e assim substituir no xpath, caso contrário, atribuir valor 2.
		switch (title) {
		case "Mr":
			title = "1";
			break;
		case "Mrs":
			title = "2";
			break;
		}

		click.element("//input[@id='id_gender" + title + "']");
		sendKeys.element("//input[@id='customer_firstname']", firstName);
		sendKeys.element("//input[@id='customer_lastname']", lastName);
		
		// Optei por limpar o campo e-mail, pois o sistema pode ter preenchido automaticamente errado
		// Em seguida preenchi novamente o campo e-mail.
		driver.findElement(By.xpath("//input[@id='email']")).clear();
		sendKeys.element("//input[@id='email']", email);
		sendKeys.element("//input[@id='passwd']", password);
		select.elementValue("//select[@id='days']", "8");
		select.elementValue("//select[@id='months']", "3");
		select.elementValue("//select[@id='years']", "1997");
		
	}
	
	public void adressInformation(String adress, String city, String state, String zipCode, String country, String mobile) throws Exception {
		sendKeys.element("//input[@id='address1']", adress);
		sendKeys.element("//input[@id='city']", city);
		select.element("//select[@name='id_state']", state);
		sendKeys.element("//input[@id='postcode']", zipCode);
		select.element("//select[@id='id_country']", country);
		sendKeys.element("//input[@name='phone_mobile']", mobile);
		
	}
}
