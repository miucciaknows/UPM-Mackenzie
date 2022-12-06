import java.util.Scanner;

public class Compra {
    public static void main(String[] args) {
        float valor, valorReal = 0;
        int tpMoeda;
        String moeda = "";
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor da compra internacional: ");
        valor = entrada.nextFloat();
        
        System.out.print("Digite o tipo da moeda: 1 - dolar, 2 - euro ou 3 - libra esterlina: ");
        tpMoeda = entrada.nextInt();
              
        switch (tpMoeda) {
            case 1:
                moeda  = "dolar americano";
                valorReal = (float) (3.71 * valor);
                break;
            case 2:
                moeda = "euro";
                valorReal = (float) (4.31 * valor);
                break;
            case 3:
                moeda = "libra esterlina";
                valorReal = (float) (4.81 * valor);
                break;
            default: 
                System.out.println();
                System.out.println("Tipo de moeda inválido");
                System.out.println();
                break;                   
        }
        if ((tpMoeda == 1) || (tpMoeda == 2) || (tpMoeda == 3)){
            System.out.println();
            System.out.println("Tipo de moeda: " + moeda);
            System.out.println("Valor em R$ foi de: " + valorReal);
        }
      }
}
