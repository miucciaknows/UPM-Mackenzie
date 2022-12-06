import java.util.Scanner;

public class precoMedio {
        
    public static void main(String[] args) {
        float[] preco = new float[10];
        float mediaPreco = 0;
        float total = 0;
        int numLojas = 0;
        
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o preço do produto na %da loja: ", i+1);
            preco[i] = entrada.nextFloat();
            total = total + preco[i];
        }
        
        mediaPreco = total/10;
        System.out.println("Média de preco: " + mediaPreco);  
                       
        for (int i = 0; i < 10; i++) {
            if (preco[i] > mediaPreco)
                numLojas = numLojas +1;
        }
        System.out.println("Número de lojas com preço acima da média: " + numLojas);  
    }
}
