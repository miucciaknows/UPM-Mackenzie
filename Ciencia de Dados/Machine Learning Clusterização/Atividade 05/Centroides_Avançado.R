#Leitura da Base de Dados

Pontos_geog <- read.csv("/Users/Miuccia/atv/centroides.csv", sep = ";", header = TRUE)

str (Pontos_geog)



#-------- Agrupamento com K-Médias -------- 

k <- 5 #Montagem com 5 Clusters
Mod_clusters = kmeans(Pontos_geog[,2:3],k) #colunas 2 e 3 em uso

#Mostra todos os Resultados
Mod_clusters

#Mostra todos os resultados dos componentes individuais

Mod_clusters$cluster #ACESSO ao Número do Cluster de cada ponto
Mod_clusters$centers #ACESSO aos centroides dos clusters
Mod_clusters$totss #ACESSO à Soma de Quadrados
Mod_clusters$withnss #ACESSO às Somas dos Quadrados das Variações internas dos clusters
Mod_clusters$betweenss #ACESSO às Somas dos Quadrados das Variações entre os clusters
Mod_clusters$size #ACESSO ao tamanho dos Clusters 
Mod_clusters$iter #ACESSO ao no. de interações desenvolvidas até os resultados
Mod_clusters$ifault


#Cria novo campo na base de pontos
Pontos_geog$cluster <- Mod_clusters$cluster

str(Pontos_geog) #Estrutura da Base de Dados
dim(Pontos_geog) #Dimensão da Base de Dados
View(Pontos_geog)

#Grava em arquivo nova Base de Dados, com o no. do Cluster
write.csv(Pontos_geog, "/Users/Miuccia/atv/101pontos_c.csv")
#lê arquivo
Pontos_geog_C <-read.csv("/Users/Miuccia/atv/101pontos_c.csv", sep=";", header= TRUE)
str (Pontos_geog_C) #Foi criada uma coluna com um ID a mais, porém sem uso
head(Pontos_geog_C)
View(Pontos_geog_C)

#plota os pontos com cores diferentes
#Parametro col = color... muda cor, conforme o no. de clusters
plot(Pontos_geog_C[,2:3], col=Pontos_geog_C[,6],xlab="--- X ---",ylab="--- Y---")

#plota os centroides
plot(Mod_clusters$centers)

#plota os pontos de cada cluster
plot(Pontos_geog_C[,6], Pontos_geog_C[,2],xlab = "--- 3 do Cluster ---", ylab = "--- Ponto ---")

#Determinação do No."Ideal" de Clusters (Valor de K)
# --- Valor ideal de K é baseado em WSS
#WSS - Soma dos quadrados das variações internas nos clusters

#Grafico de Cotovelo

MeusDados <- Pontos_geog

#Soma das varianciais das Colunas
WSS<- (nrow(MeusDados)-1)*sum(appy(MeusDados,2, var))

#WSS

#Detalhamento do Cálculo de WSS
nrow(MeusDados)-1 #numero de linhas do dataset menos 1 (n-1)

appy(MeusDados,2, var) #1 indica linha, 2 coluna

sum(appy(MeusDados,2, var)) #soma das variancias das colunas

???apply
?var

#roda k-means com k=1.. Kmax e guarda "withinss"
Kmax = 20
for (i in 2: Kmax) WSS[i] <- sum(kmeans(MeusDados, centers=i)$withinss)

#Apresenta o grafico do WSS x No de Clusters
#O No. "ideal" de clusters se situa no ponto em que a curva começa a se estabilizar

plot (1: Kmax, WSS, type = "b", xlab= "---# Clusters --- ", ylab = "--- WSS ---")
