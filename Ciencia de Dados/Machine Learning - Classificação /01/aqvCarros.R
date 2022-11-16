aqvCarros <- read.csv("Data/carro.csv", sep = ";", header = TRUE)

head(aqvCarros)
str(aqvCarros)
#View(aqvCarros)
print(aqvCarros)

#install.packages("rpart")
library("rpart")

modelo = rpart(ID ~ G.nero + Tipo.de.Carro + Tamanho.da.Camisa + Classe.Social, method = "class", data = aqvCarros, control = rpart.control(minsplit = 1), parms = list (split = "information"))

print (modelo)

#rpart (aqvCarros)



