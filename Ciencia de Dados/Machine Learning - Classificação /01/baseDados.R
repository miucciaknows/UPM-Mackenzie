aqvDados <- read.csv("Data/Fraudes1_numeric-10000.csv", sep = ";", header = TRUE)

head(aqvDados)
str(aqvDados)
#View(aqvDados)
#print(aqvDados)

#install.packages("rpart")
library("rpart")

modelo <- rpart(step ~ amount + oldbalanceOrg + newbalanceOrig + oldbalanceDest + newbalanceDest + type_num, method = "class", data = aqvDados, control = rpart.control(minsplit = 2), parms = list (split = "information"))

print (modelo)

modeloDois <- rpart(Fraude_Flag ~ Valor + Saldo11 + Saldo12 + Saldo21 + Saldo22 + Tipo, method = "class", data = aqvDados, control = rpart.control(minsplit = 2), parms = list (split = "information"))


print (modeloDois)