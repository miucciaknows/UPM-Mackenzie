"""1) Escreva um programa que lê dois valores inteiros e exibe o resultado do primeiro número dividido pelo
segundo número, com exatamente duas casas decimais.
2) Escreva um programa que lê dois valores inteiros e exibe o resultado do primeiro número dividido pelo segundo
número, com exatamente seis casas decimais.
3) Escreva um programa que lê dois valores em ponto flutuante e exibe o resultado do primeiro dividido pelo segundo,
com exatamente seis dígitos depois da vírgula.
4) Elabore um programa que calcular sua idade aproximada em segundos. 
"""
#Exercício 1
n = int (input ("Digite um numero: "))
n_2 = int (input ("Digite um numero: "))
resultado = n/n_2
print (format(resultado, ".2f"))
        

#Exercício 2
n = int (input ("Digite um numero: "))
n_2 = int (input ("Digite um numero: "))
resultado = n/n_2
print (format(resultado, ".6f"))
        

#Exercício 3
n = float (input ("Digite um numero: "))
n_2 = float (input ("Digite um numero: "))
resultado = n/n_2
print (format(resultado, ".6f"))
        

#Exercício 4
resultado = (((1996*365) * 24 ) * 60) * 60
print (resultado)
