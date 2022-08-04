#language: pt
#Author: Vinicius Franca
#Version: 1.0
#Encoding: UTF-8

@validation
Funcionalidade: Validar campos obrigatórios
  Eu como Analista de Testes
  Desejo validar os campos obrigatorios
  A fim de garantir a qualidade do software

  @firstName
  Cenario: Tentar cadastrar usuário sem first name
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário sem first name
    Entao devo visualizar a mensagem de erro "First name is required."

  @lastName
  Cenario: Tentar cadastrar usuário sem last name
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário sem last name
    Entao devo visualizar a mensagem com erro "Last name is required."

  @withoutEmail
  Cenario: Tentar cadastrar usuário sem preencher email
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário sem email
    Entao devo visualizar a mensagem erro "Last name is required."

  @wrongEmail
  Cenario: Tentar cadastrar usuário com email inválido
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário com email inválido
    Entao devo visualizar a mensagem erro "Wrong email."

  @withoutPassword
  Cenario: Tentar cadastrar usuário sem password
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário com sem preencher os campos password
    Entao devo visualizar mensagem de erro "Password is required."

  @wrongPassword
  Cenario: Tentar cadastrar usuário com password invalido
    Dado que estou na página inicial
    E clico em Register
    Quando envio o formulário com passwords divergentes
    Entao devo visualizar mensagem de erro "The password and confirmation password do not match."






