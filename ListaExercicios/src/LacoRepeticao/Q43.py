#-------------------------------------------------------------------------------
# Name:        O cardápio de uma lanchonete é o seguinte:
'''Especificação Código Preço
Cachorro Quente 100 R$ 1,20
Bauru Simples 101 R$ 1,30
Bauru com ovo 102 R$ 1,50
Hambúrguer 103 R$ 1,20
Cheeseburguer 104 R$ 1,30
Refrigerante 105 R$ 1,00
Faça um programa que leia o código dos itens pedidos e as quantidades desejadas. Calcule e mostre o valor a
ser pago por item (preço * quantidade) e o total geral do pedido. Considere que o cliente deve informar quando o
pedido deve ser encerrado.
'''# Purpose:
#
# Author:      Jackson Meires
#
# Created:     11/02/2017
# Copyright:   (c) Jackson Meires 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------

cod = -1
soma = 0
print ("Cachorro Quente 100 R$ 1,20\nBauru Simples 101 R$ 1,30\nBauru com ovo 102 R$ 1,50\nHambúrguer 103 R$ 1,20\nCheeseburguer 104 R$ 1,30\nRefrigerante 105 R$ 1,00")
while cod != 0:
    cod = int(input('Informe o codigo do seu pedido'))
    if(cod!=0):
        qtd = int(input('Informe a quantidade do pedido'))
        if(cod == 100):
            soma += (qtd * 1.2)
            print(qtd,'Cachorro Quentes R$',(qtd * 1.2))

        if(cod == 101):
            soma += (qtd * 1.3)
            print(qtd,'Bauru Simples R$',(qtd * 1.3))

        if(cod == 102):
            soma += (qtd * 1.5)
            print(qtd,'Hambúrguer R$',(qtd * 1.5))

        if(cod == 103):
            soma += (qtd * 1.2)
            print(qtd,'Hambúrguer R$',(qtd * 1.2))

        if(cod == 104):
            soma += (qtd * 1.3)
            print(qtd,'Cheeseburguer R$',(qtd * 1.3))

        if(cod == 105):
            soma += (qtd * 1)
            print(qtd,'Refrigerante R$',(qtd * 1))
print("O total geral foi :",soma)