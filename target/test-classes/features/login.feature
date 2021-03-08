#language: pt
@login
Funcionalidade: Cadastro de Usuario

  @login1
  Cenario: Criacao de Login com Sucesso
    Dado que o usuario abre a url automation practice
    Quando clico no botao Sign in usando o xpath "//a[@class='login']"
    Entao valido se o campo de email adress do formulario existe utilizando o xpath "//input[@id='email_create']"
    Quando preencho o campo email adress com um email com o seguinte xpath "//input[@id='email_create']" e em seguida realizo uma acao tab do teclado
    Entao realizo que esta visivel o check verde com o elemento "//div[@class='form-group form-ok']" validando meu email e clico em Create An Account com o elemento "//button[@id='SubmitCreate']"
    Quando valido se o texto "//h3[text()='Your personal information']" esta visivel na tela
    Entao preencho todos os campos necessarios para realizar o cadastro e em seguida clico no seguinte elemento "//button[@id='submitAccount']" para finalizar o cadastro

  @login2
  Cenario: Login com sucesso
    Dado que o usuario abre o website automation practice
    Quando clico no botao Sign in usando o elemento "//a[@class='login']"
    Entao preencho o campo email adress com um email com o seguinte xpath "//input[@id='email']"
    Entao preencho o campo de password com uma senha valida com o xpath "//input[@id='passwd']" e em seguida realizo uma acao enter do teclado
    Entao valido se o login foi realizado com sucesso

  @login3
  Cenario: Login inválido
    Dado que o usuario abra o site automation practice
    Quando clico no botao Sign in usando o seguinte elemento "//a[@class='login']"
    Quando preencho o campo email adress com um email invalido e com o seguinte xpath "//input[@id='email']"
    Entao preencho o campo de password com uma senha valida e com o elemento "//input[@id='passwd']" em seguida realizo uma acao enter do teclado
    Entao valido se deu erro de autenticação ao conectar

  @login4
  Cenario: Login em branco
    Dado que o usuario abra a pagina automation practice
    Quando clico no botao Sign in utilizando o xpath "//a[@class='login']"
    Entao preencho o campo password com uma senha utilizando o seguinte elemento "//input[@id='passwd']" e em seguida realizo uma acao enter do teclado
    Entao valido se deu erro solicitando o Email Adress
