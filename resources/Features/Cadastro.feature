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
    Entao devo visualizar "teste003@teste.com" no cabeçalho da página

  @logout
  Cenario: Fazer o loggout do usuario
    Dado que estou na página inicial
    E faço o login com minhas credenciais
    Quando clico em Log out
    Entao devo ser redirecionado a página inicial

  @cadastroNewsletter
  Cenario: Assinar newsletter
    Dado que possuo um cadastro válido
    E estou na home
    Quando insiro meu email para assinar a newsletter
    E clico em Subscribe
    Entao devo visualizar um texto com a confirmação




