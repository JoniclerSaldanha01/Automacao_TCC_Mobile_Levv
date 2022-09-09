#language: pt
#enconding: UTF-8

Funcionalidade: Cadastro de usuario Transportador no sistema Levv


  

  @CadastrarTransportador
  Esquema do Cenario: Cadastrar novo usuario Transportador ao sistema
  Dado que o usuario esteja na tela de criacao de Cadastro
  Quando preencho o campo <Nome>
  E informo <Celular> com DDD
  E informo o <email>
  E informo a <Senha1>
  E confirmo a <Senha1>
  Quando clico em cadastrar
  E seleciono transportador
  E preencho a <dataNascimento> e <cpf> do transportador
  E preencho o <Documento> do transportador
  E envio uma foto do IDT
  E seleciono o veiculo
  Quando preencho demais campos obrigatorios
  E envio foto CRLV
  Quando efetuo o cadastro do transportador
  E preencho a tela de cadastro de endereco
  Entao cadastro com sucesso o endereco

    Exemplos:
    |Nome        |Celular    |email                  |Senha1|dataNascimento|cpf        |Documento  |
    |TRA43 Transp|48984554422|43transpteste@gmail.com|123456|24061982      |24665127000|12786588931|
