"""
1) Um cinema possui capacidade de 100 lugares e está sempre com ocupação total. Certo dia, cada espectador
respondeu a um questionário, no qual constava:
- sua idade (superior ou igual a 14 anos)
- sua opinião em relação ao filme, segundo as seguintes notas:
Nota Significado
A - Ótimo B - Bom  C - Regular D - Ruim E - Péssimo
Escreva um programa que, lendo esses dados, calcule e apresente: a) a quantidade de respostas Ótimo; b) a média de idade das pessoas
que responderam Ruim; c) a porcentagem de respostas Péssimo; d) a maior idade entre as pessoas que responderam Bom;
e) a diferença entre a menor idade que respondeu Regular e a menor idade que respondeu
Ruim.

2) Leia um conjunto de dados contendo a altura (de 1,00 m a 2,30 m) e o sexo (F ou M) de n (1 <= n <= 50) pessoas. Calcule e apresente:
a) a maior e a menor altura do grupo;
b) a média de altura das mulheres;
c) o número de homens.

3) Uma pesquisa de opinião realizada em São Paulo teve três perguntas: Pergunta 1: Qual seu time do coração? 1 - São Paulo
2 - Corinthians 3 - Santos 4 - Outros Pergunta 2: Onde você mora? 1 - São Paulo 2 - Litoral 3 - Interior Pergunta 3: Qual o seu salário?
a) Faça um programa Java que realize esta pesquisa com 15 pessoas.
b) Quando a pesquisa terminar, mostre o seguinte menu de opções:
1. Número de torcedores por clube
2. Média salarial dos torcedores do São Paulo
3. Número de pessoas moradoras de São Paulo, torcedoras do Corinthians 4. Número de pessoas do Litoral torcedoras do Santos
5. Sair.

4) Faça um programa que leia um número não determinado de pares de valores [m,n], todos inteiros e positivos, um par de cada vez,
e que calcule e mostre a soma de todos os números inteiros entre m e n.

5) Desenvolva um gerador de tabuadas, capaz de gerar a tabuada de qualquer número inteiro de valor_inicial até valor_final.
O usuário deve informar o valor_inicial e o valor_final.

6) Faça um programa que peça um número inteiro e positivo e determine se ele é ou não um número primo.
Um número primo é aquele que é divisível somente por ele mesmo e por 1.

7) Faça um programa que calcule o fatorial de um número inteiro e natural fornecido pelo usuário.

"""
#Ex 01
a = 0
b = 0
c = 0
d = 0
e = 0

respostas_r = 0
idade_d = 0
rodando = True
idade_b = 0
idade_c = []
idade_d2 = []
#idade_e = 0
while rodando:
    respostas_r+=1
    idade = int (input ("Digite sua idade: "))
    while idade < 14:
        idade = int (input ("Digite sua idade: "))
    op = str (input ("A - Ótimo, B - Bom,  C - Regular, D - Ruim ou E - Péssimo? Digite apenas a letra: "))
    if op == "A":
        a+=1
    if op == "D":
        d+=1
        idade_d+=idade
        idade_d2.append(idade)
    if op == "E":
        e+=1
    if op == "B":
        b+=1
        idade_b.append(idade)
    if op == "C":
        c+=1
        idade_c.append(idade)
    op2 = str (input("Deseja parar? Digite S para sim ou N para não"))
    if op2 == "S":
        rodando = False
        

print ("Quantidade de respostas Ótimo:{} ".format(a))

if b == 0:
    resposta_d = 0
else:
    resposta_d = idade_d/d

print ("Média de idade das pessoas que responderam ruim: {} ".format(resposta_d))

if e == 0:
    resposta_e = 0
else:
    resposta_e = e/respostas_r
print ("Porcentagem das pessoas que responderam péssimo {} %".format(resposta_e))

if b >= 1:
    resposta_b = max(idade_b)
elif b == 0:
    resposta_b = 0

print ("A maior idade entre as pessoas que responderam Bom: ", resposta_b)

if c > 0 and d > 0:
    resposta_c2 = min(idade_c)
    resposta_d = min(idade_d2)
    resposta_final = resposta_c2 - resposta_d
else:
    resposta_final = "Não há dados suficientes para se fazer esse calculo"
    
print ("A diferença entre a menor idade que respondeu Regular e a menor idade que respondeu Ruim: {}".format(resposta_final))

#Ex 02
rodando = True
altura_2 = []
count = 0
sexo_masc = 0
altura_mulheres = 0
num_mulheres = 0
while rodando:
    altura = float (input ("Altura: (> 1.00m até 2.30)"))
    while altura < 1.00 or altura > 2.30:
        altura = float (input ("Altura: (> 1.00m até 2.30)"))
    altura_2.append(altura)
    sexo = str (input ("Digite o sexo, APENAS F OU M: "))
    while sexo != "F" and sexo != "M":
        sexo = str (input ("Digite o sexo, APENAS F OU M: "))
    if sexo == "M":
        sexo_masc+=1
    if sexo == "F":
        num_mulheres+=1
        altura_mulheres+=altura
    op = str (input ("Deseja parar? Digite S para Sim ou N para Não "))
    if op == "S":
        rodando = False

print ("A maior e a menor altura do grupo: ", max(altura_2), min(altura_2))
print("A média de altura das mulheresa média de altura das mulheres: ", altura_mulheres/num_mulheres )
print ("Número de homens: {}".format(sexo_masc))

#Ex 03
SP = 0
Corin = 0
Santos = 0
Outros = 0
Salario_SP = 0
resultado_Corin_SP = 0
resultado_S_L = 0

for i in range (1, 16):
    time = int (input ("1 - São Paulo 2 - Corinthians 3 - Santos 4 - Outros"))
    while time < 0 and time > 4:
        time = int (input ("1 - São Paulo 2 - Corinthians 3 - Santos 4 - Outros"))
    loc = int (input ("Onde você mora? 1 - São Paulo 2 - Litoral 3 - Interior"))
    while loc < 0 and loc > 3:
        loc = int (input ("Onde você mora? 1 - São Paulo 2 - Litoral 3 - Interior"))
    if time == 1:
        SP+=1
        salario_SP+=salario
    elif time == 2:
        Corin+1
    elif time == 3:
        Santos+=1
    elif time == 4:
        Outros+=1
    if time == 1 and loc == 1:
        resultado_Corin_SP+=1
    if time == 3 and loc == 2:
        resultado_S_L+=1
    salario = float (input ("Qual seu salário? "))

rodando = True

while rodando:
    print ("1. Número de torcedores por clube, 2. Media salarial torcedores SP, 3. Numero de pessoas que moram em SP e torcem pro Corinthias. 4. Número de pessoas do Litoral torcedoras do Santos 5. Sair. ")
    op = int (input ("Digite o numero da opção: "))
    while op < 1 and op > 5:
        print ("1. Número de torcedores por clube, 2. Media salarial torcedores SP, 3. Numero de pessoas que moram em SP e torcem pro Corinthias. 4. Número de pessoas do Litoral torcedoras do Santos 5. Sair. ")
    op = int (input ("Digite o numero da opção: "))
    
    if op == 1:
        print ("Opção 1: ", SP, Corin, Santos, Outros)
    elif op == 2:
        if SP > 1:
            salario_total_SP = salario_SP/15
        elif SP < 0:
            salario_total_SP = "Não há dados!"
        print ("Opção 2: ", salario_total_SP)
    elif op == 3:
        print ("Opção 3: ", resultado_Corin_SP)
    elif op == 4:
        print ("Opção 4: ", resultado_S_L)
    elif op == 5:
        rodando = False

#Ex 04
rodando = True
total = []
for i in range (1, 2):
    m = int (input (": "))
    n = int (input (": "))
    total.append(m)
    total.append(n)
    for j in range (1):
        r = total[j]+total[j+1]
        print (r)

#Ex 05
numero = int(input("Digite um numero de 1 a 10: "))
inicial = int (input ("Tamanho inicial: "))
final = int (input ("Tamanho final: "))

for i in range(inicial, final+1):
    tab = numero*i
    print("{} X {} = {}".format(numero, i, tab))

#Ex 06
num = int(input("Numero: "))
div = 0

for i in range(1, num+1):
    if num % i == 0: 
        div += 1
if div == 2: 
    print("Primo")
else: 
    print("Não primo")

#Ex 07
numero = int(input("Numero: ") )

resultado = 1
count = 1

while count <= numero:
    resultado *= count
    count += 1

print("Fatoral de {} é {}".format(numero, resultado))


