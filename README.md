# Pre-requisitos e Tecnologias utilizadas 
- <a href="https://java.com/en/download/manual.jsp" target="_blank">Java</a>
- <a href="https://maven.apache.org/download.cgi" target="_blank">Maven</a>
- <a href="https://www.eclipse.org/downloads/" target="_blank">Eclipse</a>
- Eclipse Plugins
  - <a href="http://download.eclipse.org/technology/m2e/releases/1.4" target="_blank">Maven</a> 
  - <a href="https://cucumber.io/" target="_blank">Cucumber</a>
- <a href="https://github.com/trivago/cluecumber-report-plugin" target="_blank">Clue Cucumber Report</a>
  
# Iniciando com o cucumber
- Instalar o Java e setar o path.
- Instalar o Maven e setar o path.
- Instalar o Eclipse.
- E adicionar Eclipse o plugin.

# Importando o projeto no Eclipse
- Clone o repositorio “https://github.com/Kruster112/mercado_eletronico.git” ou realize o download do arquivo zip.
- Importe o projeto pelo eclipse.

Executando o Script
--------------
- Execute pela classe TestRunne via IDE.
- Caso queira executar via prompt, utilizar o comando "mvn test"

Gerando o Relatório
--------------

- Basta realizar o click duplo no arquivo "Generate Report", ele irá executar o seguinte comando: mvn cluecumber-report:reporting e em seguida o próprio bat abrirá o HTML Report gerado na pasta do seguinte diretório "target\generated-report"

![image](https://user-images.githubusercontent.com/17464795/110352238-7543a200-8014-11eb-94e1-bcc2bd2abb6d.png)
