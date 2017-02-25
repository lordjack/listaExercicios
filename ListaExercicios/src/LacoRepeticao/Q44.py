#-------------------------------------------------------------------------------
'''Em uma eleição presidencial existem quatro candidatos. Os votos são informados por meio de código. Os códigos
utilizados são:
1 , 2, 3, 4 - Votos para os respectivos candidatos
(você deve montar a tabela ex: 1 - Jose/ 2- João/etc)
5 - Voto Nulo
6 - Voto em Branco
Faça um programa que calcule e mostre:
O total de votos para cada candidato;
O total de votos nulos;
O total de votos em branco;
A percentagem de votos nulos sobre o total de votos;
A percentagem de votos em branco sobre o total de votos. Para finalizar o conjunto de votos tem-se o valor zero.
'''
#
# Author:      Jackson Meires
#
# Created:     11/02/2017
# Copyright:   (c) Jackson Meires 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------
cand = ['Jose','João','Maria','Damião','Voto Nulo','Voto em Branco']
voto = [0,0,0,0,0,0]
somatotal = 0
cod =-1
while(cod != 0):
    cod = int(input('''Informe o Código do candidato
    1 - Jose
    2 - João
    3 - Maria
    4 - Damião
    5 - Voto Nulo
    6 - Voto em Branco
    '''))
    if(cod == 1):
         voto[0]= voto[0]+1
         print (voto[0]," voto(s) para Jose")
    if(cod == 2):
         voto[1]= voto[1]+1
         print (voto[1]," voto(s) para João")
    if(cod == 3):
         voto[2]= voto[2]+1
         print (voto[2]," voto(s) para Maria")
    if(cod == 4):
         voto[3]= voto[3]+1
         print (voto[3]," voto(s) para Damião")
    if(cod >= 5 and cod != 6):
         voto[4]= voto[4]+1
         print (voto[4]," voto(s) Nulos")
    if(cod == 6):
         voto[5]= voto[5]+1
         print (voto[5]," voto(s) em Branco")
    if(cod !=0):
        somatotal = somatotal +1

for i, item in enumerate(voto):
    if(i == 0):
        print ('Total de votos para Jose', item)
    if(i == 1):
        print ('Total de votos para João', item)
    if(i == 2):
        print ('Total de votos para Maria', item)
    if(i == 3):
        print ('Total de votos para Damião',item)
    if(i == 4):
        print ('Total de votos Nulos', item)
    if(i == 5):
        print ('Total de votos em Branco', item)
print("Total Geral de Votos ",somatotal)