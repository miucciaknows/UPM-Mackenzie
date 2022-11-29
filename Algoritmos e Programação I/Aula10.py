"""
1) Escreva um programa que apresente todos os ímpares de 1 até 99.

2)Escreva um programa que apresente os primeiros termos da seguinte sequência: 1, 4, 9, 16, 25, ...

3) Escreva um programa que calcule e apresente a soma da seguinte série:
S = 1/N + 2/N - 1 + 3/N-2 

4) Faça um programa que calcule e apresente o fatorial de um número inteiro e natural fornecido pelo usuário.
Exemplo:5! = 5 x 4 x 3 x 2 x 1=120.
Pordefinição 0! = 1.

5) Calcular soma de dígitos de um número

6) A conversão de graus Fahrenheit para Celsius 

"""

#Ex 01
vetor = []

for i in range(1, 101):
    vetor.append(i)

print (vetor)

for j in range (1, 100):
    if vetor[j] % 2 != 0:
        print (vetor[j])

#Ex 02
for i in range (0, 100):
    a = (i+1)**2
    print (a)

#Ex 03
n = int(input("Digite o valor de n: "))

soma = 0

i = 1

while i <= n:
    soma = soma + i
    i = i + 1

 
print("A soma do numero {} é {}".format(n, soma))

#Ex 04
numero = int(input("Digite um numero: ") )

count = 1
resultado_final = 1

while count <= numero:
    resultado_final *= count
    count += 1

print(resultado_final)

#Ex 05
numero = int(input(" Numero: "))
    
while numero < 0:
    numero = int(input(" Numero: "))
    
if numero > 0:
    soma = 0
    while numero != 0:
        resto = numero % 10
        numero = (numero - resto) // 10
        soma = soma + resto

    print("Soma: {}".format(soma))

#Ex 06
C = int (input ("Numero de C para F: "))
F = int (input ("Numero de F para C: "))

Faren = (C*9/5) + 32

Cel = (F-32)*5/9

print ("F:", Faren)
print ("C: ", Cel)


