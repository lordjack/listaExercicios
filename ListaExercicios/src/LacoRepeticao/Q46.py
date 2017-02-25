#-------------------------------------------------------------------------------
# Name:        module1
# Purpose:
#
# Author:      Jackson Meires
#
# Created:     25/02/2017
# Copyright:   (c) Jackson Meires 2017
# Licence:     <your licence>
'''
Em uma competição de salto em distância cada atleta tem direito a cinco saltos. No final da série de saltos de cada
atleta, o melhor e o pior resultados são eliminados. O seu resultado fica sendo a média dos três valores restantes. Você
deve fazer um programa que receba o nome e as cinco distâncias alcançadas pelo atleta em seus saltos e depois
informe a média dos saltos conforme a descrição acima informada (retirar o melhor e o pior salto e depois calcular a
média). Faça uso de uma lista para armazenar os saltos. Os saltos são informados na ordem da execução, portanto não
são ordenados. O programa deve ser encerrado quando não for informado o nome do atleta. A saída do programa deve
ser conforme o exemplo abaixo:
Atleta: Rodrigo Curvêllo
Primeiro Salto: 6.5 m
Segundo Salto: 6.1 m
Terceiro Salto: 6.2 m
Quarto Salto: 5.4 m
Quinto Salto: 5.3 m
Melhor salto: 6.5 m
Pior salto: 5.3 m
Média dos demais saltos: 5.9 m
Resultado final:
Rodrigo Curvêllo: 5.9 m
'''
#-------------------------------------------------------------------------------
saltosAtleta = [['',0.0,0.0,0.0,0.0,0.0,0.0,0.0,0.0]]
countAtletas =0
resp = ''
count=0
while(resp != '0'):
    count+=1
    saltosAtleta.append(count)
    for i, item in enumerate(saltosAtleta):
        print('''QuestÃ£o ''', i+1 ,'''- informe uma alternativa
                 Letra A
                 Letra B
                 Letra C
                 Letra D''')