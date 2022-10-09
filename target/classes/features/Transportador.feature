#language: pt
#enconding: UTF-8

Funcionalidade: Cadastro de usuario Transportador no sistema Levv

  

  @CadastrarTransportador
  Cenario: Cadastrar novo usuario Transportador ao sistema
  Dado que o usuario esteja na tela de criacao de Cadastro
  Quando preencho o campo Nome Transportador
  E informo Celular com DDD Transportador
  E informo o email Transportador
  E informo a Senha1 Transportador
  E confirmo a Senha1 Transportador
  Quando clico em cadastrar
  E seleciono transportador
  E preencho a dataNascimento e cpf do transportador
  E preencho o Documento do transportador
  E envio uma foto do IDT
  E seleciono o veiculo
  Quando preencho demais campos obrigatorios
  E envio foto CRLV
  Quando efetuo o cadastro do transportador
  E preencho a tela de cadastro de endereco
  Entao cadastro com sucesso o endereco

    
