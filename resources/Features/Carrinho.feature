#language: pt
#Author: Rafael Lima
#Version: 1.0
#Encoding: UTF-8

@carrinho
Funcionalidade: Incluir produtos disponíveis ao carrinho
  Eu como usuário cadastrado
  Desejo incluir produtos disponíveis ao carrinho

  @addPC
  Cenario: Adicionar um computador ao carrinho
    Dado que ja estou logado
    E escolho um pc para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addBook
  Cenario: Adicionar um livro ao carrinho
    Dado que ja estou logado
    E escolho um livro para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addPhone
  Cenario: Adicionar um celular ao carrinho
    Dado que ja estou logado
    E escolho um celular para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addApparel
  Cenario: Adicionar vestuario ao carrinho
    Dado que ja estou logado
    E escolho itens de vestuario para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addDigital
  Cenario: Adicionar download digitais ao carrinho
    Dado que ja estou logado
    E escolho itens de download digital para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addJewelry
  Cenario: Adicionar joias ao carrinho
    Dado que ja estou logado
    E escolho joias para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"

  @addGift
  Cenario: Adicionar gift cards ao carrinho
    Dado que ja estou logado
    E escolho um gift card para comprar
    Quando clico add to cart
    Entao devo visualizar uma mensagem "The product has been added to your shopping cart"



