package com.challenge.step;

import org.openqa.selenium.Keys;

import com.challenge.dsl.BasePage;
import com.challenge.page.LoginPage;
import com.github.javafaker.Faker;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;
import net.andreinc.mockneat.unit.user.Emails;

public class LoginStepDefs extends BasePage {
	LoginPage loginPage = new LoginPage();
	Faker faker = new Faker();

	String firstName = faker.name().firstName();
	String lastName = faker.name().lastName();
	String email = Emails.emails().val();
	String streetAdress = faker.address().streetAddress();
	String cityAdress = faker.address().city();
	String stateAdress = faker.address().state();

	@Dado("^que o usuario abre a url automation practice$")
	public void que_o_usuario_abre_a_url_automation_practice() throws Throwable {
		
		// Utilizando uma ação que irá se repetir diversas vezes.
		utils.navigateTo("http://automationpractice.com/");

	}

	@Quando("^clico no botao Sign in usando o xpath \"([^\"]*)\"$")
	public void clico_no_botao_Sign_in_usando_o_xpath(String xpath) throws Throwable {
		
		// Click realizando através de uma DSL, facilitando a construção do código
		click.element(xpath);
	}

	@Entao("^valido se o campo de email adress do formulario existe utilizando o xpath \"([^\"]*)\"$")
	public void valido_se_o_campo_de_email_adress_do_formulario_existe_utilizando_o_xpath(String xpath)
			throws Throwable {
		// Validação se o campo formulário estiver presente, caso não o script para por ai mesmo.
		wait.isVisible(xpath);
	}

	@Quando("^preencho o campo email adress com um email com o seguinte xpath \"([^\"]*)\" e em seguida realizo uma acao tab do teclado$")
	public void preencho_o_campo_email_adress_com_um_email_com_o_seguinte_xpath_e_em_seguida_realizo_uma_acao_tab_do_teclado(
			String xpath) throws Throwable {

		// Foi criado uma função para limpar o texto do notepad.
		utils.limparNotepad();
		
		// Foi criado uma função pra armazenar em um bloco de notas o email criado pelo Faker.
		utils.escreverNotepad(email);
		
		// Optei por utilizar a DSL com uma ação do teclado ( VIA WEBDRIVER ) para facilitar o validador, também
		// podia ter utilizado qualquer outra ação para aparecer o check de e-mail valido.
		sendKeys.element(xpath, email + Keys.TAB);
	}

	@Entao("^realizo que esta visivel o check verde com o elemento \"([^\"]*)\" validando meu email e clico em Create An Account com o elemento \"([^\"]*)\"$")
	public void realizo_que_esta_visivel_o_check_verde_com_o_elemento_validando_meu_email_e_clico_em_Create_An_Account_com_o_elemento(
			String xpathCheck, String xpathCriarAcc) throws Throwable {
		
		// Valido o check verde, após a realização do TAB
		wait.isVisible(xpathCheck);
		
		click.element(xpathCriarAcc);
	}

	@Quando("^valido se o texto \"([^\"]*)\" esta visivel na tela$")
	public void valido_se_o_texto_esta_visivel_na_tela(String xpath) throws Throwable {
		
		// Aguardo o campo estar visivel para dar continuidade na automação.
		wait.isVisible(xpath);
	}

	@Entao("^preencho todos os campos necessarios para realizar o cadastro e em seguida clico no seguinte elemento \"([^\"]*)\" para finalizar o cadastro$")
	public void preencho_todos_os_campos_necessarios_para_realizar_o_cadastro_e_em_seguida_clico_no_seguinte_elemento_para_finalizar_o_cadastro(
			String xpath) throws Throwable {
		
		// Aqui eu criei uma outra classe para retirar as informações, claro que poderia ter sido mais elaborado
		// Utilizando Planilha de Excel, Banco de Dados e até mesmo um csv.
		loginPage.personalInformation("Mr", firstName, lastName, email, "123456");

		loginPage.adressInformation(streetAdress, cityAdress, stateAdress, "12345", "United States", "21995634342");
		click.element(xpath);
		
		// Validação de espera, para confirmar que o e-mail foi cadastrado com sucesso.
		wait.isVisible("//h1[text()='My account']");
	}
}