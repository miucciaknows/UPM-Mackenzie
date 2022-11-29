""" Sabe-se que o valor de cada 1000 litros de água corresponde a 2% do salário mínimo.
Elabore um programa que receba o valor do salário mínimo e a quantidade de água consumida
em uma residência por mês. Calcule e mostre:
a) O valor da conta de água.
b) O valor a ser pago com desconto de 15%."""

#Exercício 
salario = int (input ("Digite o salário: "))
qtd_agua = int (input ("Digite a quantidade de água consumida: "))

consumo = (qtd_agua/1000) * 0.02
conta = consumo * salario

print ("o valor da conta é de: {}".format (conta))
print ("o valor da conta com desconto é de: {}".format (conta * 0.85))
 
