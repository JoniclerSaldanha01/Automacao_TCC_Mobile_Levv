#language: pt
#enconding: UTF-8

Funcionalidade: Cadastro de usuario lojista no sistema Levv


  

  @CadastrarLojista
  Esquema do Cenário: Cadastrar novo usuario Lojista ao sistema
  Dado que o usuario esteja na tela de criacao de Cadastro
  Quando preencho o campo <Nome>
  E informo <Celular> com DDD
  E informo o <email>
  E informo a <Senha1>
  E confirmo a <Senha1>
  Quando clico em cadastrar
  E seleciono lojista
  E informo <dataNascimento>  <cpf> e <cnpj>
  Quando informo <NomeEmpresa> lojista
  E informo <NomeFantasia> lojista nome fantasia
  #Quando cadastro usuario lojista
  #E preencho a tela de cadastro de endereco
  #Entao cadastro com sucesso o endereco do Lojista

    Exemplos:
    |Nome      |Celular    |email                 |Senha1|dataNascimento|cpf        |cnpj          |NomeEmpresa             |NomeFantasia  |
    |QA67 Desenv|48984554422|67qaqateste@gmail.com|123456|24061982      |24665127000|26180358000137|5 Quality Assurence LTDA|5 Testes & cia|
