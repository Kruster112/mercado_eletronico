package com.challenge.step;

import org.openqa.selenium.Keys;

import com.challenge.dsl.BasePage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

public class LoginBrancoStepDefs extends BasePage {

	@Dado("^que o usuario abra a pagina automation practice$")
	public void que_o_usuario_abra_a_pagina_automation_practice() throws Throwable {
		utils.navigateTo("http://automationpractice.com/");

	}

	@Quando("^clico no botao Sign in utilizando o xpath \"([^\"]*)\"$")
	public void clico_no_botao_Sign_in_utilizando_o_xpath(String xpath) throws Throwable {
		click.element(xpath);
	}

	@Entao("^preencho o campo password com uma senha utilizando o seguinte elemento \"([^\"]*)\" e em seguida realizo uma acao enter do teclado$")
	public void preencho_o_campo_password_com_uma_senha_utilizando_o_seguinte_elemento_e_em_seguida_realizo_uma_acao_enter_do_teclado(
			String xpath) throws Throwable {
		sendKeys.element(xpath, "123456" + Keys.ENTER);
	}

	@Entao("^valido se deu erro solicitando o Email Adress$")
	public void valido_se_deu_erro_solicitando_o_Email_Adress() throws Throwable {
		
		// Utilizo o isVisible para validar se o elemento de error está visivel.
		wait.isVisible("//li[text()='An email address required.']");
	}

}