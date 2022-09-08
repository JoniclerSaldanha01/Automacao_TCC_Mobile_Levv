#language: pt
#enconding: UTF-8

Funcionalidade: Cadastro de usuario Cliente no sistema Levv




  @CadastrarCliente
  Esquema do Cenário: Cadastrar novo usuario Cliente ao sistema
    Dado que o usuario esteja na tela de criacao de Cadastro
    Quando preencho o campo <Nome>
    E informo <Celular> com DDD
    E informo o <email>
    E informo a <Senha1>
    E confirmo a <Senha1>
    Quando clico em cadastrar
    E seleciono cliente
    E informo <dataNascimento>  <cpf>
    Quando clico em cadastrar Cliente
    #Quando informo <NomeEmpresa> lojista
    #E informo <NomeFantasia> lojista nome fantasia
    #Quando cadastro usuario lojista
    #E preencho a tela de cadastro de endereco
    #Entao cadastro com sucesso o endereco

    Exemplos:
      |Nome         |Celular    |email                    |Senha1|dataNascimento|cpf        |cnpj          |NomeEmpresa             |NomeFantasia  |
      |QA008 Cliente|48999664328|004qaqa.cliente@gmail.com|123456|24061940      |24665127000|26180358000137|5 Quality Assurence LTDA|5 Testes & cia|
