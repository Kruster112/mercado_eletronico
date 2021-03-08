$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#language: pt"
    }
  ],
  "line": 3,
  "name": "Cadastro de Usuario",
  "description": "",
  "id": "cadastro-de-usuario",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "line": 2,
      "name": "@login"
    }
  ]
});
formatter.before({
  "duration": 1667075800,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Criacao de Login com Sucesso",
  "description": "",
  "id": "cadastro-de-usuario;criacao-de-login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 5,
      "name": "@login1"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "que o usuario abre a url automation practice",
  "keyword": "Dado "
});
formatter.step({
  "line": 8,
  "name": "clico no botao Sign in usando o xpath \"//a[@class\u003d\u0027login\u0027]\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 9,
  "name": "valido se o campo de email adress do formulario existe utilizando o xpath \"//input[@id\u003d\u0027email_create\u0027]\"",
  "keyword": "Entao "
});
formatter.step({
  "line": 10,
  "name": "preencho o campo email adress com um email com o seguinte xpath \"//input[@id\u003d\u0027email_create\u0027]\" e em seguida realizo uma acao tab do teclado",
  "keyword": "Quando "
});
formatter.step({
  "line": 11,
  "name": "realizo que esta visivel o check verde com o elemento \"//div[@class\u003d\u0027form-group form-ok\u0027]\" validando meu email e clico em Create An Account com o elemento \"//button[@id\u003d\u0027SubmitCreate\u0027]\"",
  "keyword": "Entao "
});
formatter.step({
  "line": 12,
  "name": "valido se o texto \"//h3[text()\u003d\u0027Your personal information\u0027]\" esta visivel na tela",
  "keyword": "Quando "
});
formatter.step({
  "line": 13,
  "name": "preencho todos os campos necessarios para realizar o cadastro e em seguida clico no seguinte elemento \"//button[@id\u003d\u0027submitAccount\u0027]\" para finalizar o cadastro",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginStepDefs.que_o_usuario_abre_a_url_automation_practice()"
});
formatter.result({
  "duration": 4800676000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//a[@class\u003d\u0027login\u0027]",
      "offset": 39
    }
  ],
  "location": "LoginStepDefs.clico_no_botao_Sign_in_usando_o_xpath(String)"
});
formatter.result({
  "duration": 3548838600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027email_create\u0027]",
      "offset": 75
    }
  ],
  "location": "LoginStepDefs.valido_se_o_campo_de_email_adress_do_formulario_existe_utilizando_o_xpath(String)"
});
formatter.result({
  "duration": 40679700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027email_create\u0027]",
      "offset": 65
    }
  ],
  "location": "LoginStepDefs.preencho_o_campo_email_adress_com_um_email_com_o_seguinte_xpath_e_em_seguida_realizo_uma_acao_tab_do_teclado(String)"
});
formatter.result({
  "duration": 1566478600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//div[@class\u003d\u0027form-group form-ok\u0027]",
      "offset": 55
    },
    {
      "val": "//button[@id\u003d\u0027SubmitCreate\u0027]",
      "offset": 156
    }
  ],
  "location": "LoginStepDefs.realizo_que_esta_visivel_o_check_verde_com_o_elemento_validando_meu_email_e_clico_em_Create_An_Account_com_o_elemento(String,String)"
});
formatter.result({
  "duration": 56605600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//h3[text()\u003d\u0027Your personal information\u0027]",
      "offset": 19
    }
  ],
  "location": "LoginStepDefs.valido_se_o_texto_esta_visivel_na_tela(String)"
});
formatter.result({
  "duration": 6718479700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//button[@id\u003d\u0027submitAccount\u0027]",
      "offset": 103
    }
  ],
  "location": "LoginStepDefs.preencho_todos_os_campos_necessarios_para_realizar_o_cadastro_e_em_seguida_clico_no_seguinte_elemento_para_finalizar_o_cadastro(String)"
});
formatter.result({
  "duration": 15217562300,
  "status": "passed"
});
formatter.after({
  "duration": 597187800,
  "status": "passed"
});
formatter.before({
  "duration": 1057384800,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Login com sucesso",
  "description": "",
  "id": "cadastro-de-usuario;login-com-sucesso",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 15,
      "name": "@login2"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "que o usuario abre o website automation practice",
  "keyword": "Dado "
});
formatter.step({
  "line": 18,
  "name": "clico no botao Sign in usando o elemento \"//a[@class\u003d\u0027login\u0027]\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 19,
  "name": "preencho o campo email adress com um email com o seguinte xpath \"//input[@id\u003d\u0027email\u0027]\"",
  "keyword": "Entao "
});
formatter.step({
  "line": 20,
  "name": "preencho o campo de password com uma senha valida com o xpath \"//input[@id\u003d\u0027passwd\u0027]\" e em seguida realizo uma acao enter do teclado",
  "keyword": "Entao "
});
formatter.step({
  "line": 21,
  "name": "valido se o login foi realizado com sucesso",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginSucessoStepDefs.que_o_usuario_abre_o_website_automation_practice()"
});
formatter.result({
  "duration": 5081996300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//a[@class\u003d\u0027login\u0027]",
      "offset": 42
    }
  ],
  "location": "LoginSucessoStepDefs.clico_no_botao_Sign_in_usando_o_e(String)"
});
formatter.result({
  "duration": 1681826700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027email\u0027]",
      "offset": 65
    }
  ],
  "location": "LoginSucessoStepDefs.preencho_o_campo_email_adress_com_um_email_com_o_seguinte_xpath(String)"
});
formatter.result({
  "duration": 1558183900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027passwd\u0027]",
      "offset": 63
    }
  ],
  "location": "LoginSucessoStepDefs.preencho_o_campo_de_password_com_uma_senha_valida_com_o_xpath_e_em_seguida_realizo_uma_acao_enter_do_teclado(String)"
});
formatter.result({
  "duration": 4087022300,
  "status": "passed"
});
formatter.match({
  "location": "LoginSucessoStepDefs.valido_se_o_login_foi_realizado_com_sucesso()"
});
formatter.result({
  "duration": 21322900,
  "status": "passed"
});
formatter.after({
  "duration": 592049600,
  "status": "passed"
});
formatter.before({
  "duration": 1062783300,
  "status": "passed"
});
formatter.scenario({
  "line": 24,
  "name": "Login inválido",
  "description": "",
  "id": "cadastro-de-usuario;login-inválido",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 23,
      "name": "@login3"
    }
  ]
});
formatter.step({
  "line": 25,
  "name": "que o usuario abra o site automation practice",
  "keyword": "Dado "
});
formatter.step({
  "line": 26,
  "name": "clico no botao Sign in usando o seguinte elemento \"//a[@class\u003d\u0027login\u0027]\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 27,
  "name": "preencho o campo email adress com um email invalido e com o seguinte xpath \"//input[@id\u003d\u0027email\u0027]\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 28,
  "name": "preencho o campo de password com uma senha valida e com o elemento \"//input[@id\u003d\u0027passwd\u0027]\" em seguida realizo uma acao enter do teclado",
  "keyword": "Entao "
});
formatter.step({
  "line": 29,
  "name": "valido se deu erro de autenticação ao conectar",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginInvalidoStepDefs.que_o_usuario_abra_o_site_automation_practice()"
});
formatter.result({
  "duration": 4184550100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//a[@class\u003d\u0027login\u0027]",
      "offset": 51
    }
  ],
  "location": "LoginInvalidoStepDefs.clico_no_botao_Sign_in_usando_o_seguinte_elemento(String)"
});
formatter.result({
  "duration": 2521264400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027email\u0027]",
      "offset": 76
    }
  ],
  "location": "LoginInvalidoStepDefs.preencho_o_campo_email_adress_com_um_email_invalido__e_com_o_seguinte_xpath(String)"
});
formatter.result({
  "duration": 1561300700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027passwd\u0027]",
      "offset": 68
    }
  ],
  "location": "LoginInvalidoStepDefs.preencho_o_campo_de_password_com_uma_senha_valida_e_com_o_elemento_em_seguida_realizo_uma_acao_enter_do_teclado(String)"
});
formatter.result({
  "duration": 2516991200,
  "status": "passed"
});
formatter.match({
  "location": "LoginInvalidoStepDefs.valido_se_deu_erro_de_autenticação_ao_conectar()"
});
formatter.result({
  "duration": 20726200,
  "status": "passed"
});
formatter.after({
  "duration": 609947100,
  "status": "passed"
});
formatter.before({
  "duration": 1065557200,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Login em branco",
  "description": "",
  "id": "cadastro-de-usuario;login-em-branco",
  "type": "scenario",
  "keyword": "Cenario",
  "tags": [
    {
      "line": 31,
      "name": "@login4"
    }
  ]
});
formatter.step({
  "line": 33,
  "name": "que o usuario abra a pagina automation practice",
  "keyword": "Dado "
});
formatter.step({
  "line": 34,
  "name": "clico no botao Sign in utilizando o xpath \"//a[@class\u003d\u0027login\u0027]\"",
  "keyword": "Quando "
});
formatter.step({
  "line": 35,
  "name": "preencho o campo password com uma senha utilizando o seguinte elemento \"//input[@id\u003d\u0027passwd\u0027]\" e em seguida realizo uma acao enter do teclado",
  "keyword": "Entao "
});
formatter.step({
  "line": 36,
  "name": "valido se deu erro solicitando o Email Adress",
  "keyword": "Entao "
});
formatter.match({
  "location": "LoginBrancoStepDefs.que_o_usuario_abra_a_pagina_automation_practice()"
});
formatter.result({
  "duration": 4037633400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//a[@class\u003d\u0027login\u0027]",
      "offset": 43
    }
  ],
  "location": "LoginBrancoStepDefs.clico_no_botao_Sign_in_utilizando_o_xpath(String)"
});
formatter.result({
  "duration": 2379649100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "//input[@id\u003d\u0027passwd\u0027]",
      "offset": 72
    }
  ],
  "location": "LoginBrancoStepDefs.preencho_o_campo_password_com_uma_senha_utilizando_o_seguinte_elemento_e_em_seguida_realizo_uma_acao_enter_do_teclado(String)"
});
formatter.result({
  "duration": 2998557300,
  "status": "passed"
});
formatter.match({
  "location": "LoginBrancoStepDefs.valido_se_deu_erro_solicitando_o_Email_Adress()"
});
formatter.result({
  "duration": 18597700,
  "status": "passed"
});
formatter.after({
  "duration": 1063758900,
  "status": "passed"
});
});