#Aula 01

#Exercício 1
def soma(a,b):
    return a+b

numero_um = int (input ("Digite o primeiro número: "))
numero_dois = int (input ("Digite o segundo número: "))

print ("A soma é {}".format(soma(numero_um, numero_dois)))

#Exercício 2
numero = int (input ("Digite um número: "))

def resultados(numero):
    d = numero ** 2
    t = numero ** 3
    q = numero ** 4
    return d, t, q

print (resultados(numero))

#Exercício 3
v = []

for i in range (4):
    v.append (int (input ("Digite a nota: ")))
    
resultado_2 = v[0]+v[1]+v[2]+v[3]
resultado_3 = resultado_2/4

print (resultado_3)

#Exercício 4
metros = float (input ("Digite a altura p/ ser convertida: "))

def converter(metros):
    r = metros*1000
    return r

print (converter(metros))

#Exercício 5
lado = float(input("Digite a altura do quadrado: "))

area = lado ** 2

print("A área do quadrado é de {}".format(area))
