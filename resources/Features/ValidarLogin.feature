#language: pt
#Author: Vinicius Franca
#Version: 1.0
#Encoding: UTF-8

@validationLogin
Funcionalidade: Validar campos obrigatórios da página de login
  Eu como Analista de Testes
  Desejo validar os campos obrigatorios da página de login
  A fim de garantir a qualidade do software

  Cenario: Tentar fazer login sem preencher as credenciais
    Dado que estou na página inicial
    E clico em login
    Quando envio as credenciais sem preencher nenhum campo
    Entao devo visualizar em vermelho "Login was unsuccessful. Please correct the errors and try again."

  @emailValidation
  Cenario: Tentar fazer login sem preencher email
    Dado que estou na página inicial
    E clico em login
    Quando envio as credenciais sem email
    Entao devo visualizar em vermelho "Login was unsuccessful. Please correct the errors and try again."

  @emailValidation
  Cenario: Tentar fazer login preenchendo email inválido
    Dado que estou na página inicial
    E clico em Register
    Quando envio as credenciais com email inválido
    Entao devo visualizar em vermelho a mensagem "Please enter a valid email address."


  @passwordValidation
  Cenario: Tentar fazer login sem preencher senha
    Dado que estou na página inicial
    E clico em login
    Quando envio as credenciais sem senha
    Entao devo visualizar em vermelho "Login was unsuccessful. Please correct the errors and try again."

  Cenario: Tentar fazer login com senha inválida
    Dado que estou na página inicial
    E clico em login
    Quando envio as credenciais com senha inválida
    Entao devo visualizar em vermelho "Login was unsuccessful. Please correct the errors and try again."





