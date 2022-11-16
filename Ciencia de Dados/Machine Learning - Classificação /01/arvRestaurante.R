aqvRestaurante <- read.csv("Data/restaurante.csv", sep = ";", header = TRUE)

head(aqvRestaurante)
str(aqvRestaurante)
#View(aqvRestaurante)
#print(aqvRestaurante)

#install.packages("rpart")
library("rpart")

modelo <- rpart(R ~ EP + QR + LE, method = "class", data = aqvRestaurante, control = rpart.control(minsplit = 1), parms = list (split = "information"))

print (modelo)


#rpart (aqvRestaurante)
