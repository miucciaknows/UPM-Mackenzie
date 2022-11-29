"""
1) Esse é o jogo dos dados, muito usado em Las Vegas nos cassinos, aposte em um número que seja o resultado
da soma deles e ganhe o seu dinheiro. Crie duas variáveis para representar os dados e uma para sua aposta, crie uma
para armazenar o resultado e faça a verificação.
2) O Jogo do par ou ímpar é usado onde duas pessoas jogam geralmente para decidir um impasse, cada um escolhe entre
par ou ímpar e mostra o seu número, a soma entre eles resulta em um número par ou ímpar e assim é decidido o vencedor.
Aqui faremos com a máquina, ela escolherá um número randômico entre 0 e 10 e você escolherá o seu. Vamos ver quem
é o vencedor!!!!
3) Um dos jogos sugeridos para crianças acima de 6 anos é o PEDRA, PAPEL E TESOURA
"""
import random

#Exercício 1
aposta = int (input ("Digite sua aposta "))

dado1 = random.randint(0, 100)
print ("primeiro dado: {}".format(dado1))
dado2 = random.randint (0, 100)
print ("segundo dado: {}".format(dado2))
soma_dado = dado1+dado2



if aposta == soma_dado:
    print ("você ganhou!")
else:
    print ("você perdeu!")

#Exercício 2
seu_num = int (input ("Digite um número: "))
numero_random = random.randint(0, 100)
print ("A maquina escolheu {}".format(numero_random))

soma = numero_random + seu_num

if soma % 2 == 0:
    print ("Quem escolheu par ganhou!")
else:
    print ("Quem escolheu ímpar ganhou!")

#Exercício 3
um = input ("Pedra, papel ou tesoura: ")
dois = input ("Pedra, papel ou tesoura: ")

if um == "pedra" and dois == "tesoura":
    print ("pedra ‘quebra’ a tesoura")
elif dois == "pedra" and um == "tesoura":
    print ("pedra ‘quebra’ a tesoura")
elif um == "tesoura" and dois == "papel":
    print ("tesoura ‘corta’ o papel")
elif dois == "tesoura" and um == "papel":
    print ("tesoura ‘corta’ o papel")
elif um == "papel" and dois == "pedra":
    print ("papel ‘embrulha’ a pedra")
elif dois == "papel" and um == "pedra":
    print ("papel ‘embrulha’ a pedra")
else:
    print ("Empate!")

    
    