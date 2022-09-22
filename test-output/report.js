$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/features/Lojista.feature");
formatter.feature({
  "name": "Cadastro de usuario lojista no sistema Levv",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "enviar produto para entrega",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@EnviarProduto"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que acesse o sistema com usuario cadastrado",
  "keyword": "Dado "
});
formatter.match({
  "location": "steps.LojistaSteps.que_acesse_o_sistema_com_usuario_cadastrado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "acesso enviar produto",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.acesso_enviar_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "preencho os campos enviar produto",
  "keyword": "Quando "
});
formatter.match({
  "location": "steps.LojistaSteps.preencho_os_campos_enviar_produto()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em enviar pedido",
  "keyword": "E "
});
formatter.match({
  "location": "steps.LojistaSteps.clico_em_enviar_pedido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido pedido em Pendentes",
  "keyword": "Entao "
});
formatter.match({
  "location": "steps.LojistaSteps.valido_pedido_em_Pendentes()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});