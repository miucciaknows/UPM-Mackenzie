print(iris)

#Amostragem
N<-dim(iris)[1]
pastas<-5
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

#Agora, separa-se os conjuntos de Treinamento e de Teste da Base IRIS em 2 partes: Atributos Descritivos e
#Atributo Classificatorio (Este sera o Atributo usado para classificar os Exemplares)
#No caso da base IRIS sera usado o Atributo 5 = "Species", que define a "Espécie" de Flor
#O K-NN devera considerar este Atributo 5 para montar a Classificacao dos Exemplares de Flores

#SEPARAÇÃO EM 2 BLOCOS - CONJUNTO DE DADOS DE TREINAMENTO
X_treino<-iris[i_treino,1:4]
Y_treino<-iris[i_treino,5]
X_treino
Y_treino

#SEPARAÇÃO EM 2 BLOCOS - CONJUNTO DE DADOS DE TESTE
#Nos dados de Teste, o Bloco 2 sera usado apos a Classificação
X_teste<-iris[i_teste,1:4]
Y_teste<-iris[i_teste,5]
X_teste
Y_teste

iris

library("class")
k<-1
Y_estimado <- knn(X_treino,X_teste,Y_treino,k)
Y_estimado #


#Parametros K-NN
#X_treino: Matriz com Dados de Treinamento
#X_teste : Matriz com Dados de Teste, sem o "Rotulo'
#Y_treino: Atributo (Rotulo) do conjunto de Treinamento, que identifies os casos "Verdadeiros" (True Cases)
#k No. de Vizinhos a considerar na classificacao


#MONTAGEM da MATRIZ de CONFUSÃO

#Compare Valores Estimados pelo KNN com os Valores Reais
matriz_de_confusao <- table(Y_estimado,Y_teste)
matriz_de_confusao

#Calculo da Acuracia 
acuracia_knn <- (sum(diag(matriz_de_confusao)) / sum(matriz_de_confusao))*100

#Impressão Concatenada da Acuracia
print(paste("Acuracia da Classificacao kNN:",acuracia_knn,"%"))

print("Acuracia da Classificacao kNN:")
acuracia_knn
print("%")
