"""1) Calcule e apresente o volume de uma lata de óleo. 𝑣= 𝜋.𝑟2.𝑎𝑙𝑡𝑢𝑟𝑎
2) Escreva um programa que receba três números quaisquer e apresente:
a) a soma dos quadrados dos três números;
b) o quadrado da soma dos três números.
3) Escreva um programa que receba uma data no formato aaaammdd e a exiba no formato dd/mm/aaaa.
4) Faça um programa que receba o custo de um espetáculo teatral e o preço do convite desse espetáculo. Esse programa deve calcular e mostrar:
a) A quantidade de convites que devem ser vendidos para que pelo menos o custo do
espetáculo seja alcançado.
b) A quantidade de convites que devem ser vendidos para que se tenha um lucro de 23%.
"""
import math
#Exercício 1

altura = float (input ("Digite a altura da lata de óleo: "))
r = float (input (" : "))

resultado = math.pi * r ** 2 * altura

print (resultado)

#Exercício 2

n1 = int (input (" : "))
n2 = int (input (" : "))
n3 = int (input (" : "))

soma_q = n1**2 + n2**2 + n3**2
soma_q_r = soma_q ** 2
print ("A soma dos quadrados dos três números que você digitou {}".format(soma_q))
print ("O quadrado da soma dos três números que você digitou {}".format(soma_q_r))

#Exercício 3
data = input ("Digite uma data no formato aaaammdd: ")

print (data[6],data[7], "/", data[4], data[5], "/", data[0], data[1], data[2], data[3])


#Exercício 4
custo = float (input ("Digite o custo do espétaculo: "))
convite = float (input ("Digite o valor do ingresso: "))

r = custo/convite
lucro = (custo+custo*0.23)/convite

print ("A quantidade de ingressos a ser ventida para cobrir os custos é de {}".format(r))
print ("A quantidade de ingressos a ser ventida para se obter lucro de 23% é de {}".format(lucro))




