#language: pt
#Author: Vinicius Franca
#Version: 1.0
#Encoding: UTF-8

@checkout
Funcionalidade: Adicionar produtos no carrinho e finalizar compra

  Eu como usuário cadastrado
  Desejo incluir produtos no carrinho
  A fim de validar a funcionalidade dos métodos de pagamento

  @add
  Cenario: Adicionar um produto ao carrinho
    Dado que estou logado
    E adiciono um computador ao carrinho
    Quando clico em add to cart
    Entao devo receber a mensagem "The product has been added to your shopping cart"

  @checkoutCash
  Cenario: Finalizar compra com pagamento em dinheiro
    Dado que estou logado
    E tenho um produto no carrinho
    E aceito os termos de uso
    Quando clico em checkout
    E preencho o formulário
    Entao recebo a mensagem "Your order has been successfully processed!"

  @checkoutCredit
  Cenario: Finalizar compra com pagamento em cartão de crédito
    Dado que estou logado
    E tenho um produto no carrinho
    E aceito os termos de uso
    Quando clico em checkout
    E preencho o formulário selecionando a opção crédito
    Entao recebo a mensagem "Your order has been successfully processed!"

  @checkoutCheck
  Cenario: Finalizar compra com pagamento em cheque / ordem de pagamento
    Dado que estou logado
    E tenho um produto no carrinho
    E aceito os termos de uso
    Quando clico em checkout
    E preencho o formulário selecionando a opção cheque ou ordem de pagamento
    Entao recebo a mensagem "Your order has been successfully processed!"

  @checkoutPO
  Cenario: Finalizar compra com pagamento por ordem de compra
    Dado que estou logado
    E tenho um produto no carrinho
    E aceito os termos de uso
    Quando clico em checkout
    E preencho o formulário selecionando a opção ordem de compra
    Entao recebo a mensagem "Your order has been successfully processed!"






