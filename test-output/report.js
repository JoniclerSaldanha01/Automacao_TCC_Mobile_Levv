$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Lojista.feature");
formatter.feature({
  "name": "Cadastro de usuario lojista no sistema Levv",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar novo usuario Lojista ao sistema",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@CadastrarLojista"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que o usuario esteja na tela de criacao de Cadastro",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.LojistaSteps.queOUsuarioEstejaNaTelaDeCriacaoDeCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho o campo Nome",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LojistaSteps.preencho_o_campo_Nome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo Celular com DDD",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.informo_Celular_com_DDD()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo o email",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.informo_o_email()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo a Senha",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.informo_a_Senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "confirmo a Senha",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.confirmo_a_Senha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em cadastrar",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LojistaSteps.clico_em_cadastrar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono lojista",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.seleciono_lojista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo dataNascimento  cpf e cnpj",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.informo_dataNascimento_cpf_e_cnpj()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo NomeEmpresa lojista",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LojistaSteps.informo__lojista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo NomeFantasia lojista nome fantasia",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.informo_NomeFantasia_lojista_nome_fantasia()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cadastro usuario lojista",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LojistaSteps.cadastro_usuario_lojista()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho a tela de cadastro de endereco",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.preencho_a_tela_de_cadastro_de_endereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "cadastro com sucesso o endereco",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LojistaSteps.cadastro_com_sucesso_o_endereco()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: Can\u0027t locate an element by this strategy: By.chained({By.id: com.example.levv:id/btnEntregarProduto})\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:126)\r\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:59)\r\n\tat io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$b598166c.isDisplayed(\u003cgenerated\u003e)\r\n\tat page.LojistaPage.botaoCadastrarEndereco(LojistaPage.java:125)\r\n\tat steps.LojistaSteps.cadastro_com_sucesso_o_endereco(LojistaSteps.java:113)\r\n\tat ✽.cadastro com sucesso o endereco(file:///C:/Users/Administrador/Desktop/Desenvolvimento%20TCC2/Automacao_TCC_Mobile_Levv/src/main/resources/features/Lojista.feature:24)\r\nCaused by: org.openqa.selenium.TimeoutException: Expected condition failed: waiting for io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction@12477988 (tried for 1 second(s) with 500 milliseconds interval)\r\n\tat org.openqa.selenium.support.ui.FluentWait.timeoutException(FluentWait.java:304)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:272)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.waitFor(AppiumElementLocator.java:99)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.findElement(AppiumElementLocator.java:119)\r\n\tat io.appium.java_client.pagefactory.interceptors.InterceptorOfASingleElement.intercept(InterceptorOfASingleElement.java:59)\r\n\tat io.appium.java_client.android.AndroidElement$$EnhancerByCGLIB$$b598166c.isDisplayed(\u003cgenerated\u003e)\r\n\tat page.LojistaPage.botaoCadastrarEndereco(LojistaPage.java:125)\r\n\tat steps.LojistaSteps.cadastro_com_sucesso_o_endereco(LojistaSteps.java:113)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(Unknown Source)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(Unknown Source)\r\n\tat java.lang.reflect.Method.invoke(Unknown Source)\r\n\tat io.cucumber.java.Invoker.invoke(Invoker.java:27)\r\n\tat io.cucumber.java.JavaStepDefinition.execute(JavaStepDefinition.java:27)\r\n\tat io.cucumber.core.runner.PickleStepDefinitionMatch.runStep(PickleStepDefinitionMatch.java:63)\r\n\tat io.cucumber.core.runner.TestStep.executeStep(TestStep.java:64)\r\n\tat io.cucumber.core.runner.TestStep.run(TestStep.java:49)\r\n\tat io.cucumber.core.runner.PickleStepTestStep.run(PickleStepTestStep.java:46)\r\n\tat io.cucumber.core.runner.TestCase.run(TestCase.java:51)\r\n\tat io.cucumber.core.runner.Runner.runPickle(Runner.java:67)\r\n\tat io.cucumber.junit.PickleRunners$NoStepDescriptions.run(PickleRunners.java:149)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:83)\r\n\tat io.cucumber.junit.FeatureRunner.runChild(FeatureRunner.java:24)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:185)\r\n\tat io.cucumber.junit.Cucumber.runChild(Cucumber.java:83)\r\n\tat org.junit.runners.ParentRunner$4.run(ParentRunner.java:331)\r\n\tat org.junit.runners.ParentRunner$1.schedule(ParentRunner.java:79)\r\n\tat org.junit.runners.ParentRunner.runChildren(ParentRunner.java:329)\r\n\tat org.junit.runners.ParentRunner.access$100(ParentRunner.java:66)\r\n\tat org.junit.runners.ParentRunner$2.evaluate(ParentRunner.java:293)\r\n\tat io.cucumber.junit.Cucumber$RunCucumber.evaluate(Cucumber.java:219)\r\n\tat org.junit.runners.ParentRunner$3.evaluate(ParentRunner.java:306)\r\n\tat org.junit.runners.ParentRunner.run(ParentRunner.java:413)\r\n\tat org.eclipse.jdt.internal.junit4.runner.JUnit4TestReference.run(JUnit4TestReference.java:93)\r\n\tat org.eclipse.jdt.internal.junit.runner.TestExecution.run(TestExecution.java:40)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:529)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.runTests(RemoteTestRunner.java:756)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.run(RemoteTestRunner.java:452)\r\n\tat org.eclipse.jdt.internal.junit.runner.RemoteTestRunner.main(RemoteTestRunner.java:210)\r\nCaused by: org.openqa.selenium.NoSuchElementException: Cannot locate an element using By.chained({By.id: com.example.levv:id/btnEntregarProduto})\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027DESKTOP-VSSVHOR\u0027, ip: \u002710.153.10.238\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_331\u0027\nDriver info: driver.version: AppiumDriver\r\n\tat io.appium.java_client.pagefactory.bys.builder.ByChained.findElement(ByChained.java:74)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.pagefactory.bys.ContentMappedBy.findElement(ContentMappedBy.java:50)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat io.appium.java_client.DefaultGenericMobileDriver.findElement(DefaultGenericMobileDriver.java:57)\r\n\tat io.appium.java_client.AppiumDriver.findElement(AppiumDriver.java:1)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator.lambda$0(AppiumElementLocator.java:120)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:172)\r\n\tat io.appium.java_client.pagefactory.AppiumElementLocator$WaitingFunction.apply(AppiumElementLocator.java:1)\r\n\tat org.openqa.selenium.support.ui.FluentWait.until(FluentWait.java:249)\r\n\t... 44 more\r\n",
  "status": "failed"
});
formatter.write("Caso de Teste finalizado com Falha!!!");
formatter.after({
  "error_message": "java.lang.NullPointerException\r\n\tat steps.Hooks.tearDown(Hooks.java:39)\r\n",
  "status": "failed"
});
});