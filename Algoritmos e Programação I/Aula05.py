"""1) Faça um programa que leia um número e mostre uma mensagem indicando se este número é positivo ou negativo.
2) Faça um programa que apresenta o maior de dois números lidos do usuário.
3) Faça um programa que coloque dois nomes em ordem alfabética.
4) Faça um programa que apresente se o número que o usuário digitou é divisível por 3 e por 5 ao mesmo tempo.
5) Faça um programa que receba um ano (quatro dígitos) e informe se é um ano bissexto ou não. Pesquise quais as regras para o número
ser bissexto.
6) Elabore um programa que leia do teclado o sexo de uma pessoa. Se o sexo digitado for “M” ou “m” ou “F” ou “f”, escrever na tela
“Sexo válido!”. Caso contrário, exibir “Sexo inválido!”.
7) Num determinado Estado, para transferências de veículos, o DETRAN cobra uma taxa de 2,5% para carros fabricados antes de 2010
e uma taxa de 3,5% para os fabricados de 2010 em diante, taxa esta incidindo sobre o valor de tabela do carro. Escreva um programa
lê o ano e o preço do carro e a seguir calcula e imprime a taxa a ser paga.
"""

#Exercício 1
def num(n):
    if (n < 0):
        print ("este número é negativo")
    else:
        print ("este número é positivo")

n = int (input ("Digite um número: "))

num(n)

#Exercício 2
def maiormenor (n1, n2):
    if (n1 > n2):
        print (n1)
    elif (n2 > n2):
        print (n2)
    else:
        print ("os números são iguais")

n1 = int (input ("Digite um número: "))
n2 = int (input ("Digite um número: "))
maiormenor (n1, n2)

#Exercício 3
nome1 = str (input ("Digite um nome: "))
nome2 = str (input ("Digite outro nome: "))

if nome1 > nome2:
    print (nome2, nome1)
elif nome1 < nome2:
    print (nome1, nome2)

#Exercício 4
def divisivel (n):
    if n % 3 == 0 and n % 5 == 0:
        print ("Este número é divisivel por 3 e 5")
    else:
        print ("Este número não é divisivel por 3 e 5")
        

n = int (input ("Digite um numero: "))

divisivel (n)

#Exercício 5
ano = int (input ("Digite um ano: "))
if ano % 4 == 0:
    print ("este ano é bissexto")
else:
    print ("este ano não é bissexto")

#Exercício 6
print ("Digite o sexo do cidadão. Apenas com F ou f para feminino e M ou m para masculino")
sexo = input ("Digite o sexo do cidadão: ")

if sexo == "f" or sexo == "F" or sexo == "M" or sexo == "m":
    print ("Sexo válido!")
else:
    print ("Sexo inválido!")
    
#Exercício 7
ano_fabricado = int (input ("Digite o ano em que o carro foi fabricado: "))
valor_tabela = float (input ("Digite o valor do carro na tabela, apenas com números"))

if ano_fabricado <= 2010:
    taxa = valor_tabela*0.25
    print ("Taxa a pagar: {}".format(taxa))
elif ano_fabricado > 2010:
    taxa = valor_tabela*0.35
    print ("Taxa a pagar: {}".format(taxa))

    
