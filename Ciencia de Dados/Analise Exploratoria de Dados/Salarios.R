salarioArq <- read.csv("salarios.csv", sep = ";", header = TRUE)

head(salarioArq)
str(salarioArq)
#View(salarioArq)
#print(salarioArq)

#criar vertor prim coluna

funcionario <- salarioArq[,1]


#segun coluna
salario <- salarioArq[,2]

#terceira coluna

experiencia <- salarioArq[,3]

#quarta coluna

escolaridade <- salarioArq[,4]

## função 'cor()' faz a correlação entre duas variaveis que é o quão proxima elas estão sendo 1 muito prox ou igual e 0 muito diferentes
matriz_correl <- cor(salario,experiencia)

print(cor(salarioArq))


#normalização transformando os valores em numero na mesma faixa de valores, ou seja, criando um range para as variaveis ficarem

funcionario_norm <- funcionario/max(funcionario)
salario_norm <- salario/max(salario)
experiencia_norm <- experiencia/max(experiencia)
escolaridade_norm <- escolaridade/max(escolaridade)


print(funcionario_norm)
print(salario_norm)
print(experiencia_norm)
print(escolaridade_norm)

salario_norm = data.frame(funcionario_norm,salario_norm,experiencia_norm,escolaridade_norm)







