#language: pt
#enconding: UTF-8

@Test
Funcionalidade: Cadastro de usuario lojista no sistema Levv

 

  @CT01_CadastrarLojista
  Cenario: Cadastrar novo usuario Lojista ao sistema
  Dado que o usuario esteja na tela de criacao de Cadastro
  Quando preencho o campo Nome
  E informo Celular com DDD
  E informo o email
  E informo a Senha
  E confirmo a Senha
  Quando clico em cadastrar
  E seleciono lojista
  E informo dataNascimento  cpf e cnpj
  Quando informo Nome Empresa lojista
  E informo Nome Fantasia lojista nome fantasia
  Quando cadastro usuario lojista
  E preencho a tela de cadastro de endereco
  Entao cadastro com sucesso o endereco

   
    
    
    
  @CT02_EnviarProduto
  Cenario: enviar produto para entrega
  Dado que acesse o sistema com usuario cadastrado
  E acesso enviar produto
  Quando preencho os campos enviar produto
  E clico em enviar pedido
  Entao valido pedido em Pendentes
  
