install.packages("RSNNNS")
library(RSNNS)

d <- read.csv2(file = 'Fraudes1_numeric-10000.csv')

d <- read.csv2(file.choose())
str(d)
head(d)
View(d)


#Armazena em X as colunas 2 e 3 dos Dados

X <- d[2:3]
X

#Converte a Coluna 4, "Classe" em duas colunas (Matriz binária = 0 ou 1)
#Classe = Rótulo que define a Satisfação do Cliente
#A função < dcodeClassLabels() faz essa conversão
#Satisfeito = SAT ou Insatisfeito = INS
#Ao invés de uma unica Coluna, agora passase-se a ter duas duas

Y <- decodeClassLabels(d[,4])

#Exemplo de uso da função decodeClassLabels
#decodeClassLabels(c(1,3,2,3))
#decodeClassLabels(c("r", "b", "b", "r", "g", "g"))

#Separa a base de dados de Treinamento e de Teste
#O parametro "ratop" define o % que será usado para teste
#Inclui na Separação a Variavel X (cols. 2 e 3) e a variavel Y (col 4 = rotulo)
d_separado <- splitForTraingAndTest(X, Y, ratio = 0.15)
d_separado

#Normaliza a Base de Dados que será usada na RNA
d_normalizado <- normTrainingAndTestSet(d_separado, dontNormTargets = TRUE, type="0_1")

# ------ Roda o Modelo de RNA... -------
#Será usada a RNA MLP - Multilayer Perceptron... Função < mlp ()) >


modelo_mlp <- mlp(d_separado$inputsTrain, d_separado$targetsTrain, size=c(3), maxit=5000,initFunc="Randomize_Weights", learnFuncParams= c(0.1), hiddenActFunc="Act_Logistic", shufflePatters= TRUE,linOut= TRUE, InputsTest = d_separados$InputsTest,getsTest= d_separado$targetsTest)

modelo_mlp
d_separado$inputsTest #Dados de Entrada para teste do modelo
d_separado$targetsTest #Rotulos dos Dados de entrada

# *** Resultados do modelo ***

#Resultados para os dados de Treinamento
#Usar parametro "$fitted.values"
#"$fitted.values" apresenta a probalidade do exemplo estar em cada classe
modelo_mlp$fitted.values

#-- Resultados para os Dados de teste
#no "$fittenTestValues" valores mais altos indicam os rotulos previstos

modelo_mlp$fittedTestValues
modelo_mlp$nInputs #no. d exemplares de entradas para teste
modelo_mlp$nOutputs #no. d exemplares de saida para teste

#Impressão dos graficos mostrando os rótulos reais vs previstos

#Grafico da coluna 1
plotRegressionErros(predict[,1], d_separado$targetsTest[,1])
legend(.05,.95, c("Target", "Fit"), lty=c(1,1), col=c(2,1))

#Pontos usados no grafico. Target = Rotulos Reais; fit = Previstos
d_separado$targetTest[,1]
predictions[,1]

#Grafico de Coluna 2(SAT)
plotRegressionError(predictions[,2], d_separado$targetsTest[,2])
legend(.05,.95, c("Target", "Fit"), lty = c(1,1), col=c(2,1))
#Pontos usados no grafico. Target = Rotulos Reais; fit = Previstos
d_separado$targetTest[,2]
predictions[,2]

#Outra forma de ver os resultados
#Curva de previsões do treinamento
plot(modelo_mlp$fitted.values, main= "Treino", xlab = "%[,1], INS", ylab = "%[,2], SAT", cex.lab=1.5, ylim = c(-5.1))

#Pontos do grafico... Probalidade de INS vs SAT
modelo_mlp$fitted.values

#Curva de previsões de teste
plot(modelo_mlp$fittedTestValues= main= "Teste", xlab= "[1]:INS", ylab="[2]:SAT", cex.lab=1.5, ylim=c(-2,2))

#Pontos de grafico... índices para INS vs SAT... 2 pontos usados para teste
modelo_mlp$fittedTestValues

#Curva dos resultados do teste
lines(modelo_mlp$fittedTestValues, col="2", lwd="3")
#Curva dos resultados do treinamento
lines(modelo_mlp$fitted.values, col="3", lwd="3", cex=2)
#Imrpime legenda no grafico
legend(1.0, 1.8, c("Treinamento", "Teste"), lty=c(1,1), col=c(3,2))

#Resultados tecnicos do Modelo
summary(modelo_mlp) #resumo geral do modelo
weightMatriz(modelo_mlp) #tabela de pesos sinapticos
extractNetInfo(modelo_mlp) #similar ao summary

#Impressão curva de Aprendizado

#curva de erro do treinamento... curva de aprendizado
plot(modelo_mlp$IterativeFitError, type="1", main="Curva de Aprentizado", xlab="Interação", ylab="Erro medio quadratico", cex.lab=1, ylim=c(0,8))

#Curva de erro do treinamento
lines(modelo_mlp$IterativeFitError, col="3", lwd="3",cex="2")
#Curva de erro do teste
lines(modelo_mlp$IterativeFitError, col="2", lwd="3")

#Imprime legenda no grafico
legend(2900, 7.9, c("Treinamento", "teste"), lty= c(1,1), col=c(3,2))

#Avaliação... Matriz de Confusão
confusionMatrix(d_separado$targetsTrain, fitted.values(modelo_mlp))
confusionMatrix(d_separado$targetsTest, predictions)
                
       
                    


