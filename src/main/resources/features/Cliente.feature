#language: pt
#enconding: UTF-8

Funcionalidade: Cadastro de usuario Cliente no sistema Levv


  @CT01_CadastrarCliente
   Cenario: Cadastrar novo usuario Cliente ao sistema
    Dado que o usuario esteja na tela de criacao de Cadastro
    Quando preencho o campo Nome Cliente Cliente
    E informo Celular com DDD Cliente
    E informo o email Cliente
    E informo a Senha1 Cliente
    E confirmo a Senha Cliente
    Quando clico em cadastrar
    E seleciono cliente
    E preencho data Nascimento e cpf Cliente
    Quando clico em cadastrar Cliente 
    E preencho a tela de cadastro de endereco cliente
    Entao cadastro com sucesso o endereco

