Base_padrão <- read.csv("Data/centroides.csv", sep = ";", header = TRUE)


str (Base_padrão)

print (Base_padrão)

k = 4

clusters = kmeans(Base_padrão[,1:2],k)

clusters$cluster 
clusters$centers

plot(clusters$cluster, Base_padrão[,1])
plot(clusters$centers)