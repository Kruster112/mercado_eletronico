package com.challenge.step;

import org.openqa.selenium.Keys;

import com.challenge.dsl.BasePage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginSucessoStepDefs extends BasePage {

	@Dado("^que o usuario abre o website automation practice$")
	public void que_o_usuario_abre_o_website_automation_practice() throws Throwable {
		utils.navigateTo("http://automationpractice.com/");

	}

	@Quando("^clico no botao Sign in usando o elemento \"([^\"]*)\"$")
	public void clico_no_botao_Sign_in_usando_o_e(String xpath) throws Throwable {
		click.element(xpath);
	}

	@Quando("^preencho o campo email adress com um email com o seguinte xpath \"([^\"]*)\"$")
	public void preencho_o_campo_email_adress_com_um_email_com_o_seguinte_xpath(String xpath) throws Throwable {

		// Atribuo o valor da primeira linha do bloco de notas a uma String EMAIL.
		String email = utils.lerNotepad();
		sendKeys.element(xpath, email + Keys.TAB);
	}

	@Entao("^preencho o campo de password com uma senha valida com o xpath \"([^\"]*)\" e em seguida realizo uma acao enter do teclado$")
	public void preencho_o_campo_de_password_com_uma_senha_valida_com_o_xpath_e_em_seguida_realizo_uma_acao_enter_do_teclado(String xpath) throws Throwable {
		sendKeys.element(xpath, "123456" + Keys.ENTER);
	}

	@Entao("^valido se o login foi realizado com sucesso$")
	public void valido_se_o_login_foi_realizado_com_sucesso() throws Throwable {
		
		// Valido se o e-mail armazenado no bloco de notas ao criar uma nova conta é válido.
		wait.isVisible("//h1[text()='My account']");
	}
}