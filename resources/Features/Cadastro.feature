#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@usuario
Funcionalidade: Cadastrar e logar usuário
  Eu como usuário não cadastrado
  Desejo me cadastrar
  A fim de me tornar um cliente

  @cadastro
  Cenario: Criar novo usuário
    Dado que estou na página inicial
    E preencho o formulário de cadastro
    Quando envio o formulário
    Entao devo visualizar a mensagem "Your registration completed"

  @login
  Cenario: Logar usuario
    Dado que estou na página inicial
    E clico em login
    Quando preencho e envio minhas credenciais
    Entao devo visualizar "viola.davis@teste.com" no cabeçalho da página



