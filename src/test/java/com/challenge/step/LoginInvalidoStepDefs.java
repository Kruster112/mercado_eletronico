package com.challenge.step;

import org.openqa.selenium.Keys;

import com.challenge.dsl.BasePage;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.andreinc.mockneat.unit.user.Emails;

public class LoginInvalidoStepDefs extends BasePage {
	String email = Emails.emails().val();

	@Dado("^que o usuario abra o site automation practice$")
	public void que_o_usuario_abra_o_site_automation_practice() throws Throwable {
		utils.navigateTo("http://automationpractice.com/");

	}

	@Quando("^clico no botao Sign in usando o seguinte elemento \"([^\"]*)\"$")
	public void clico_no_botao_Sign_in_usando_o_seguinte_elemento(String xpath) throws Throwable {
		click.element(xpath);
	}

	@Quando("^preencho o campo email adress com um email invalido e com o seguinte xpath \"([^\"]*)\"$")
	public void preencho_o_campo_email_adress_com_um_email_invalido__e_com_o_seguinte_xpath(String xpath) throws Throwable {

		// Utilizo um e-mail randomico para dar erro na autenticação.
		sendKeys.element(xpath, email + Keys.TAB);
	}

	@Entao("^preencho o campo de password com uma senha valida e com o elemento \"([^\"]*)\" em seguida realizo uma acao enter do teclado$")
	public void preencho_o_campo_de_password_com_uma_senha_valida_e_com_o_elemento_em_seguida_realizo_uma_acao_enter_do_teclado(String xpath) throws Throwable {
		sendKeys.element(xpath, "123456" + Keys.ENTER);
	}

	@Entao("^valido se deu erro de autenticação ao conectar$")
	public void valido_se_deu_erro_de_autenticação_ao_conectar() throws Throwable {
		
		// Valido se o e-mail randômico é inválido.
		wait.isVisible("//li[text()='Authentication failed.']");
	}
}