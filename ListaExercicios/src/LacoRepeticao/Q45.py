#-------------------------------------------------------------------------------
'''Desenvolver um programa para verificar a nota do aluno em uma prova com 10 questÃµes, o programa deve perguntar ao
aluno a resposta de cada questÃ£o e ao final comparar com o gabarito da prova e assim calcular o total de acertos e a
nota (atribuir 1 ponto por resposta certa). ApÃ³s cada aluno utilizar o sistema deve ser feita uma pergunta se outro aluno
vai utilizar o sistema. ApÃ³s todos os alunos terem respondido informar:
a. Maior e Menor Acerto;
b. Total de Alunos que utilizaram o sistema;
A MÃ©dia das Notas da Turma.
Gabarito da Prova:
01 - A
02 - B
03 - C
04 - D
05 - E
06 - E
07 - D
08 - C
09 - B
10 - A
ApÃ³s concluir isto vocÃª poderia incrementar o programa permitindo que o professor digite o gabarito da prova
antes dos alunos usarem o programa.
'''#
# Author:      Jackson Meires
#
# Created:     12/02/2017
# Copyright:   (c) Jackson Meires 2017
# Licence:     <your licence>
#-------------------------------------------------------------------------------

#gabarito = ['A','B','C','D','E','E','D','C','B','A']
gabarito = []
respostaAluno = ['','','','','','','','','','']
acertosAluno = []
countAluno =0
acertos = 0
acertosTotal = 0
nota = 0
resp = ''
maiorAcertos = 0
menorAcertos = 99

for i in range(10):
    print( "Questão ",i+1)
    gabarito.append(input("Informe a resposta da questão"))
    # print(i+1," - ",gabarito[i])

while(resp != 'n'):
    for i, item in enumerate(respostaAluno):

        print('''Questão ''', i+1 ,'''- informe uma alternativa
                 Letra A
                 Letra B
                 Letra C
                 Letra D''')

        respostaAluno[i] =input('''Resposta: ''')

        if (gabarito[i]==respostaAluno[i]):
            acertos = acertos+1

        print ("Resposta ",i+1,": ",respostaAluno[i])


    acertosAluno.append(acertos)
    acertos = 0

    countAluno= countAluno+1
    resp = input('''Outro Aluno vai utilizar o Sistema?''')

print("Qtd Acertos por aluno")
for i, item in enumerate(acertosAluno):
    print ("Aluno: ",i+1," - ",item)
    if(item > maiorAcertos):
            maiorAcertos = item
    if(item < menorAcertos ):
            menorAcertos = item
    acertosTotal = acertosTotal+item

media = (acertosTotal / countAluno )

print ( "Total de Acertos: ",acertosTotal," Maior Acertos: ",maiorAcertos," Menor Acertos: ",menorAcertos," Média: ", media)
for i in range(len(gabarito)):
    print (i+1," - ",gabarito[i])




