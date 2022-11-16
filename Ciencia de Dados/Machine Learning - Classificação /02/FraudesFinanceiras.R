fraudesFinanceiras <- read.csv(file = 'fraudes.csv')
print(fraudesFinanceiras)

#Fase 1 - Amostragem
N<-dim(fraudesFinanceiras)[1]
pastas<-12
N
pastas

library("cvTools")
folds <- cvFolds(N, K = pastas, type = c("random"))
folds

#Define conjuntos de Dados de Treinamento e de Testes
i_treino<-folds$subsets[which(folds$which != 1)]
i_teste<- folds$subsets[which(folds$which == 1)]

i_treino
i_teste

#Agora, separa-se os conjuntos de Treinamento e de Teste da Base fraudesFinanceiras em 2 partes:
#Atributos Descritivos e Atributo Classificatorio (Este sera o Atributo usado para classificar os Exemplares)
#No caso da base fraudesFinanceiras sera usado o Atributo 5 = "Species", que define a "Especie" de Flor
#O K-NN devera considerar este Atributo 5 para montar a Classificacao dos Exemplares de Flores

#Separação em 2 Blocos - CONJUNTO DE DADOS DE TREINAMENTO
X_treino<- fraudesFinanceiras[i_treino,1:11]
Y_treino<- fraudesFinanceiras[i_treino,12]
X_treino
Y_treino

#Separaçãp em 2 Blocos - CONJUNTO DE DADOS DE TESTE
#Nos dados de Teste, o Bloco 2 sera usado apos a Classificação
X_teste<-fraudesFinanceiras[i_teste,1:11]
Y_teste<-fraudesFinanceiras[i_teste,12]
X_teste
Y_teste

fraudesFinanceiras

#KNN
library("class")
k<-1
Y_estimado <- knn(X_treino,X_teste,Y_treino,k)
Y_estimado 

#Parametros K-NN
#X_treino: Matriz com Dados de Treinamento
#X_teste : Matriz com Dados de Teste, sem o "Rotulo'
#Y_treino: Atributo (Rotulo) do conjunto de Treinamento, que identifies os casos "Verdadeiros" (True Cases)
#k No. de Vizinhos a considerar na classificacao


#MONTAGEM da MATRIZ de CONFUSÃO

#Compare Valores Estimados pelo Kâ NN com os Valores Reais (aqui
matriz_de_confusao <- table(Y_estimado,Y_teste)
matriz_de_confusao

#Calculo da Acuracia 
acuracia_knn <- (sum(diag(matriz_de_confusao)) / sum(matriz_de_confusao))*100

# Impressão do Calculo
print(paste("Classificacao kNN:",acuracia_knn,"%"))

print("Classificacao kNN:")
acuracia_knn
print("%")
