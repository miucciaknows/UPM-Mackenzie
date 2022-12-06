
import java.util.Scanner;

public class precoMedioMetodo {
      
    public static float media (float vet[]){
        float total = 0;
        
        for (int i = 0; i < 10; i++) {
            total = total + vet[i];                       
        }
        return (total/10);
    }
    
    
    public static void main(String[] args) {
        float[] preco = new float[10];
        float mediaPreco = 0;
        
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o preço do produto na %da loja: ", i+1);
            preco[i] = entrada.nextFloat();
        }
        System.out.println();
        mediaPreco = media(preco);
        System.out.println("Média de preco: " + mediaPreco);       
    }
}
