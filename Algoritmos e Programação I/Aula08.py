"""1) Escreva um programa para escrever os 10 primeiros múltiplos de 3.

2) Dado a quantidade de alunos de uma turma, calcular a média semestral de cada aluno e mostrar uma mensagem
para os alunos aprovados.

3) Dado a quantidade de alunos de uma turma, calcular a média semestral de cada aluno, a média geral da turma
e mostrar uma mensagem para os alunos aprovados.

4) Escreva um programa que lê dois números inteiros e calcula a multiplicação entre os números dados.
Porém, sem o uso do operador *, mas sim pela soma sucessiva de um deles.
Exemplo: 3 x 4 = 3 + 3 + 3 + 3 = 4 + 4 + 4 = 12

5) Escreva um programa que lê dois números inteiros e calcula o quociente da divisão entre os números dados,
bem como o resto da divisão. Porém, sem o uso do operador / ou %.

6) Faça um programa que, dado x inteiro e n natural, calcular xn sem utilizar o operador **.

7) Escreva um algoritmo que calcule o MMC (mínimo múltiplo comum) entre dois números naturais.

8) Escreva um algoritmo que calcule o MDC (máximo divisor comum) entre dois números naturais.

9) Escreva um algoritmo que leia um número inteiro e positivo e converta para binário

10) Faça um programa que mostre um menu para o usuário escolher uma operação ou sair do
programa. Por exemplo:
Soma .................... +
Subtração ............. -
Multiplicação......... *
Divisão................... /
Sair ....................... 0
O programa deve reconhecer a opção escolhida pelo usuário e solicitar a entrada de dois números
caso a opção escolhida seja uma das operações. Depois de fazer a operação e mostrar o resultado o
programa deve continuar em execução para que o usuário faça selecione operação e outros números.
O programa só terminará caso o usuário digite 0.


"""

import math
#Exercício 1
n = 0
m = 0

while n < 11:
    multi = 3*m
    print (multi)
    n+=1
    m+=1

#Exercício 2
qtd = int (input ("Qual a quantidade de alunos? "))
aux = 0
while aux < qtd:
    aux+=1
    n1 = int (input ("nota 1: "))
    n2 = int (input ("nota 2: "))
    media = (n1+n2)/2
    if media >= 7.5:
        print ("aluno aprovado!")
    else:
        print ("aluno não aprovado!")

#Exercício 3
qtd = int (input ("Qual a quantidade de alunos? "))
aux = 0
aux_2 = 0
while aux < qtd:
    aux+=1
    n1 = int (input ("nota 1: "))
    n2 = int (input ("nota 2: "))
    media = (n1+n2)/2
    aux_2+=media
    if media >= 7.5:
        print ("aluno aprovado!")
    else:
        print ("aluno não aprovado!")

print ("A média geral da turma é: ", aux_2/qtd)

#Exercício 4
n1 = int (input ("Digite um número: "))
n2 = int (input ("Digite outro número: "))

aux = 0
aux2 = 0

while aux < n2:
    multiplicar = n1 + aux2
    aux2 = multiplicar + n2
    aux+=1
print (multiplicar)

#Exercício 5
d = int (input ("Dividendo: "))
divisor = int(input("Divisor: "))
x = d
quociente = 0

while x >= divisor:
    x = x - divisor
    quociente = quociente + 1
resto = x

print("O resto de {} / {} é {}".format(d, divisor, resto))

#Exercício 6
x = int (input (" : "))
n = int (input (" : "))

r = math.pow(x, n)

print (r)

#Exercício 7 e 8
def mdc(a, b):
    if b == 0:
        return a
    return mdc(b, a % b)


def mmc(a, b):
    return abs(a*b) / mdc(a, b)

n1 = int (input ("Digite um numero: " ))
n2 = int (input ("Digite um numero: " ))

print("MMC: ", mmc(n1, n2))
print ("MDC: ", mdc(n1, n2))

#Exercício 9
x = int (input ("Entre com um número: "))

binario = bin(x)
octa = oct(x)
hexa = hex(x)

print (binario[2::])
print (octa[2::])
print (hexa[2::])


#Exercício 10
rodando = True

while rodando:
    print ("Menu")
    print ("1 - Soma +")
    print ("2 - Subtração -")
    print ("3 - Multiplicação *")
    print ("4 - Divisão /")
    print ("5 - Sair 0")
    op = int (input ("Digite a opção: "))
    if op == 1:
        print (" * Soma")
        n1 = int (input ("Digite um número: "))
        n2 = int (input ("Digite um número: "))
        print (" : ", n1+n2)
    elif op == 2:
        print (" * Subtração")
        n1 = int (input ("Digite um número: "))
        n2 = int (input ("Digite um número: "))
        print (" : ", n1-n2)
    elif op == 3:
        print (" * Multiplicação")
        n1 = int (input ("Digite um número: "))
        n2 = int (input ("Digite um número: "))
        print (" : ", n1*n2)
    elif op == 4:
        print (" * Divsão")
        n1 = int (input ("Digite um número: "))
        n2 = int (input ("Digite um número: "))
        print (" : ", n1/n2)
    elif op == 0:
            rodando = False
        
        
    
    
    
    
