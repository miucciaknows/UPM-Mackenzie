agua = read.csv("agua.csv", sep = ";", header = TRUE)

#head(agua)
#str(agua)
#View(agua)
#print(agua)

#criar vertor prim coluna

periodo <- agua[,1]


#segun coluna

dta <- agua[,2]

#terceira coluna

medidor <- agua[,3]
medidor <- as.numeric(medidor)

#mostra as posições com ruim
medidor_Out <- (medidor < 6)
#mostra somente as posições com ruido
posRuido <- which(medidor_Out)
#print(posRuido)

medidor_semRuido <- as.data.frame(medidor[-posRuido])

#print(medidor_semRuido)

boxplot(medidor_semRuido)


#tramento dos valores NA

medidor_Na <- is.na(medidor)
posNa <- which(medidor_Na)
medidor_SemNa <- as.data.frame(medidor[-posRuido])

print(medidor_SemNa)

write.table(medidor_SemNa, file="aguaSemRuidoNa.csv", sep=",")
