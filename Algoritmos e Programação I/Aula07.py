"""1) Um hospital precisa de um programa para calcular e imprimir os gastos de um paciente. A tabela
de preços do hospital é a seguinte:
Quartos:
o Particular – R$ 360,00
o Semi-particular – R$ 210,00 o Coletivo – R$ 185,00
WIFI: R$ 3,00
TV a cabo: R$ 4,00
Escreva um programa que leia: o número de dias gastos no hospital; o tipo de quarto; se usou ou não o WIFI (Sim, Não);
se usou ou não a TV a cabo (Sim, Não). Então emita um relatório.

2) Elabore um programa que calcule o que deve ser pago por um produto, considerando o preço normal de etiqueta
e a escolha da condição de pagamento. Utilize os códigos da tabela seguinte para ler qual a condição de
pagamento escolhida e efetuar o cálculo adequado.
Código Condições de pagamento
1 À vista em dinheiro ou cheque, recebe 10% de desconto
2 À vista no cartão de crédito, recebe 5% de desconto
3 Em 2 vezes, preço normal de etiqueta sem juros
4 Em 3 vezes, preço normal de etiqueta mais juros de 10%

3)Faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
a. "Telefonou para a vítima?"
b. "Esteve no local do crime?"
c. "Mora perto da vítima?"
d. "Devia para a vítima?"
e. "Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime. Se a pessoa responder
positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como
"Assassino". Caso contrário, ele será classificado como "Inocente".

4) Faça um programa que tendo como dados de entrada o código de região de localização do cliente, o nome do cliente,
o número de peças vendidas e o nome do vendedor; calcule e informe o valor do frete, a comissão do vendedor e o lucro
obtido com a venda. Sabendo-se que:
O valor do frete depende da quantidade transportada e da região; Comissão do vendedor = 6,5 % do valor total da venda;
Lucro = Valor total venda – custo total – comissão do vendedor; Custo por peça = R$ 7,00;
Custo total = custo por peça * número de peças vendidas; Valor total da venda = custo total acrescido em 50%;
Valor do Frete por Região:
Código da Região
 Nome da Região 
Valor do frete por peça (até 1.000 peças) R$ 
Valor do frete por peça
(acima de 1.000 peças) R$ 
1 2 3 4 5 6 7 8 Sul 1,00 10% Norte 1,10 8% Leste 1,15 7%
Oeste 1,20 11% Noroeste 1,25 15% Sudeste 1,30 12% Centro-Oeste 1,40 18% Nordeste 1,35 15%

5) Deseja-se fazer uma pesquisa a respeito do consumo mensal de energia elétrica em uma determinada cidade. Para isso são fornecidos os seguintes dados: o preço de KW/hora consumido; para cada consumidor a sua identificação, a quantidade de KW/hora consumida durante o mês e o tipo de consumidor (Industrial, Comercial, Residencial).
Dependendo do tipo de consumidor a conta mensal sofre um acréscimo: industrial – 15% e comercial – 5% (residencial não tem acréscimo).
O programa deverá calcular e exibir a conta mensal de cada consumidor igual a 0 (zero).

6) O BANCO IMOBILIÁRIO é um jogo em que o tabuleiro é composto por casas e quando um jogador atinge uma casa há regras específicas:
- PONTO DE PARTIDA: Cada vez que o jogador alcançar o PONTO DE PARTIDA ou por ele passar receberá do banqueiro $200 como HONORÁRIOS.
- IMPOSTO: Se cair nesta casa o jogador deve pagar 10% de seus honorários.
- TERRENO OU EMPRESA SEM DONO: Se cair num terreno ou empresa poderá comprá-las ao banqueiro,
pagando o preço indicado no tabuleiro.
- PRISÃO: Se o jogador cair no campo “VA PARA A CADEIA” irá com o seu peão para a prisão. Se, porém, alcançar a prisão em lances regulares será considerado visitante.
- TERRENO OU EMPRESA COM DONO: Se o jogador alcançar um terreno ou empresa que já tenha sido adquirido, pagará aluguel ou taxa.
Agora escreva um programa que receba o nome da casa atingida e dê a devida informação ao jogador.

7) Este jogo de dados envolve 2 jogadores (cada jogador deve jogar 3 vezes o dado).
O programa deve solicitar a jogada do dado do primeiro jogador (mostra e pede para teclar enter para continuar) e
mostra o resultado. Solicita a jogada do dado do segundo jogador (mostra e pede para teclar enter para continuar),
mostra todos os resultados e acumula os pontos. Após saber os pontos obtidos por cada jogador o programa compara os
totais. Verifica quem ganha e mostra os totais de cada jogador. Vence quem atingir 10 pontos primeiro.
Após 3 jogadas se os jogadores não atingirem 10 pontos dar mensagem “jogada inválida”

8) A Copa do Mundo de 2018 será realizada na Rússia. Bolas de futebol são muito fáceis de transportar, já que elas
saem das fábricas vazias e só são enchidas somente pelas lojas ou pelos consumidores finais.
Infelizmente o mesmo não pode ser dito das bolas de boliche. Como elas são completamente
sólidas, elas só podem ser transportadas embaladas uma a uma, em caixas separadas.
A SBC - Só Boliche Cascavel - é uma fábrica de bolas de boliche que trabalha somente através de encomendas
e envia todas as bolas por SEDEX. Como as bolas têm tamanhos diferentes, a SBC tem vários tamanhos de caixas
diferentes para transportá-las

Escreva um programa que, dado o diâmetro de uma bola e as 3 dimensões de uma caixa (altura, largura e profundidade),
diz se a bola de boliche cabe dentro da caixa ou não.

A primeira linha da entrada contém um inteiro N (1 ≤ N ≤ 10.000) que indica o diâmetro da bola de boliche. A segunda
linha da entrada contém 3 números inteiros separados por um espaço cada: a
altura A (1 ≤ A ≤ 10.000), seguida da largura L (1 ≤ L ≤ 10.000) e da profundidade P (1 ≤ P ≤ 10.000).

Seu programa deve imprimir uma única linha, contendo a letra 'S' caso a bola de boliche caiba dentro da caixa
ou 'N' caso contrário

"""
import random
#Exercício 1
numero_dias = int (input ("Digite quantos dias ficou no hospital: "))
tipo_quarto = input ("Digite o tipo do quarto: ")
wifi = input ("Usou o wifi? (Responda com sim ou não)")
tv = input ("Usou tv a cabo? (Responda com sim ou não)")

custo_add = 0
custo_add_2 = 0

if tipo_quarto == "particular":
    valor_quarto = 360*numero_dias
elif tipo_quarto == "semi-particular":
    valor_quarto = 210*numero_dias
elif tipo_quarto == "coletivo":
    valor_quarto = 185*numero_dias
    
if wifi == "sim":
    custo_add+=3
else:
    custo_add = 0
if tv == "sim":
    custo_add_2+=4
else:
    custo_add_2 = 0
    
    
print ("Número de dias no hospital: {}".format(numero_dias))
print ("Tipo de quarto: {}".format(tipo_quarto))
print ("Diarias... {}".format (valor_quarto))
print ("Wifi... {}".format(custo_add))
print ("Tv... {}".format(custo_add_2))
print ("Total: {}".format(valor_quarto+custo_add+custo_add_2))

#Exercício 2
preco = float (input ("Digite o preço do produto escolhido: "))

forma_p = int (input ("Digite o código do pagamento: "))

if forma_p == 1:
    print ("valor para pagar: ", preco-preco*0.10)
elif forma_p == 2:
    print ("valor para pagar: ", preco-preco*0.05)
elif forma_p == 3:
    print ("valor para pagar: ", preco)
else:
    print ("valor para pagar: ", preco*0.10+preco)

#Exercício 3
a = str (input ("Telefonou para a vítima? "))
b = str (input ("Esteve no local do crime? "))
c = str (input ("Mora perto da vítima? "))
d = str (input ("Devia para a vítima? "))
e = str (input ("Já trabalhou com a vítima? "))

nivel_c = 0

if a == "sim":
    nivel_c +=1
else:
    nivel_c +=0
    
if b == "sim":
    nivel_c +=1
else:
    nivel_c +=0
if c == "sim":
    nivel_c +=1
else:
    nivel_c +=0

if d == "sim":
    nivel_c +=1
else:
    nivel_c +=0

if e == "sim":
    nivel_c +=1
else:
    nivel_c +=0
    
if nivel_c == 2:
    print ("Suspeito")
elif nivel_c == 3 or nivel_c == 4:
    print ("Cúmplice")
elif nivel_c == 5:
    print ("Assassino")
else:
    print ("Inocente")

#Exercício 4
c_regiao = int (input ("Código de região de localização do cliente: "))
nome = str (input ("Nome do Cliente: "))
n_pecas = int(input("Numero de peças: "))
vendedor = str (input ("Nome do Vendedor: "))

if c_regiao == 1:
    if n_pecas <= 1000:
        frete = 1.00
    else:
        frete = 1.00*0.10+1.00
if c_regiao == 2:
    if n_pecas <= 1000:
        frete = 1.10
    else:
        frete = 1.10*0.08+1.10
if c_regiao == 3:
    if n_pecas <= 1000:
        frete = 1.15
    else:
        frete = 1.15*0.07+1.15
if c_regiao == 4:
    if n_pecas <= 1000:
        frete = 1.20
    else:
        frete = 1.20*0.11+1.20
if c_regiao == 5:
    if n_pecas <= 1000:
        frete = 1.25
    else:
        frete = 1.25*0.15+1.25
if c_regiao == 6:
    if n_pecas <= 1000:
        frete = 1.30
    else:
        frete = 1.30*0.12+1.30
if c_regiao == 7:
    if n_pecas <= 1000:
        frete = 1.40
    else:
        frete = 1.40*0.18+1.40
if c_regiao == 8:
    if n_pecas <= 1000:
        frete = 1.35
    else:
        frete = 1.35*0.15+1.35
custo_total = 7*n_pecas
valor_total_v = custo_total*0.50+ custo_total
comissao = valor_total_v * 0.065 
lucro = valor_total_v - custo_total - comissao

print ("o valor do frete é de {}".format(frete))
print ("a comissão do vendedor {} é de {}".format(vendedor, comissao))
print ("o lucro {}".format(lucro))

#Exercício 5
preco_kh = float (input ("Digite o preço do kw/hora consumido: "))
qtd_c = float (input ("Digite a quantidade consumida: "))
ind = str (input ("Nome consumidor: "))
tipo_c = str (input  ("Tipo do consumidor: "))


p_parcial = qtd_c * preco_kh

if tipo_c == "indistrial":
    p_total = p_parcial * 0.15 + p_parcial
elif tipo_c == "comerical":
    p_total = p_parcial * 0.05 + p_parcial
else:
    p_total = p_parcial
    
print ("Consumidor {} do tipo {}, sua conta é de {}".format(ind, tipo_c, p_total))
    
#Exercício 6
import random

andar = input ("Digite ok para sortear a casa")

dado1 = "Ponto de Partida"
dado2 = "Imposto"
dado3 = "Terreno ou Empresa sem dono"
dado4 = "Prisão"
dado5 = "Terreno ou Empresa com dono"


#casa_atual = random.randint(1, 5)
casa_atual = 3

valor_disponivel = 200
n_prisao = 0

if casa_atual == 1:
    print ("Ponto de Partida")
    valor_disponivel+= 200
    print (valor_disponivel)
elif casa_atual == 2:
    print ("Imposto")
    valor_disponivel= valor_disponivel - valor_disponivel * 0.10
    print (valor_disponivel)
elif casa_atual == 3:
    print ("Terreno ou Empresa sem dono ")
    op = str (input ("Deseja comprar o terreno/empresa? "))
    if op == "sim":
        preco = float (input ("Qual o preço do terreno? "))
        if preco <= valor_disponivel:
            print ("Parabéns você possui o terreno agora!")
            valor_disponivel = valor_disponivel - preco
            print ("Seu saldo agora é de {}".format (valor_disponivel))
        else:
            print ("Você não tem saldo suficiente para comprar este terreno!")
elif casa_atual == 4:
    print ("Prisão ")
    n_prisao+=1
    print ("Vá para cadeia")
    if n_prisao > 2:
        print ("Você é um visitante da prisão!")
elif casa_atual == 5:
    print ("Terreno ou Empresa com dono")
    print ("Você terá que pagar aluguel!")
    aluguel = 10
    valor_disponivel-=10
    print ("Seu saldo atual é de {}".format(valor_disponivel))

#Exercício 7
print (" *** JOGADOR 1 ***")
j1 = input ("ENTER para continuar")
dado1_1 = random.randint(0, 5)
print ("Jogador 1, tirou: ", dado1_1)
dado1_2 = random.randint(0, 5)
print ("Jogador 1, tirou: ", dado1_2)
dado1_3 = random.randint(0, 5)
print ("Jogador 1, tirou: ", dado1_3)

print (" *** JOGADOR 2 ***")
j2 = input ("ENTER para continuar")
dado2_1 = random.randint(0, 5)
print ("Jogador 2, tirou: ", dado2_1)
dado2_2 = random.randint(0, 5)
print ("Jogador 2, tirou: ", dado2_2)
dado2_3 = random.randint(0, 5)
print ("Jogador 2, tirou: ", dado2_3)

soma_j1 = dado1_1+dado1_2+dado1_3
soma_j2 = dado2_1+dado2_2+dado2_3

if soma_j1 >= 10:
    print ("Jogador 1 ganhou!")
    print ("Jogador 2 jogue novamente")
elif soma_j2 >= 10:
    print ("Jogador 2 ganhou!")
    print ("Jogador 1 jogue novamente")
elif soma_j1 and soma_j2 < 10:
    print ("Jogada inválida, joguem novamente!")
elif soma_j1 and soma_j2 >= 10:
    print ("Empate!!!")

#Exercício 8
diametro =int(input("Digite o diâmetro inteiro da bola: "))

altura = int (input ("Digite a altura: "))

largura = int (input ("Digite a largura: "))

profundidade = int ( input("Digite a profundidade: "))


if diametro <= altura and diametro <= largura and diametro <= profundidade:
    print ("S")
else:
    print("N")