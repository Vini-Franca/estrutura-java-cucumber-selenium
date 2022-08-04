#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@edit
Funcionalidade: Editar credenciais
  Eu como usuário cadastrado
  Desejo alterar meu email e senha

  Cenario: Alterar endereço de email e senha
    Dado que sou um usuário cadastrado
    E desejo alterar meu email e senha
    Quando cadastro um novo endereço de email
    E uma nova senha
    Entao devo realizar login com as novas credenciais




