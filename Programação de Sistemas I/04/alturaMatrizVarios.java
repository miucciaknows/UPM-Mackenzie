
import java.util.Scanner;


public class alturaMatrizVarios {
    public static void main(String[] args) {
        float[][] altura = new float[5][10];
        float maiorAltura=0;
        
        Scanner entrada = new Scanner(System.in);
 
        for (int i = 0; i < 5; i++) {
            System.out.printf("Alturas da %da delegação: ", i+1);  
            System.out.println();
            for (int j = 0; j < 10; j++){
                System.out.printf("Digite a altura do %do atleta da %da delegação: ", j+1, i+1);
                altura[i][j] = entrada.nextFloat();
            }
            System.out.println();
        }
        
        System.out.println();
       
        for (int i = 0; i < 5; i++) {
            maiorAltura = 0;    
            for (int j = 0; j < 10; j++){
                if (altura[i][j] > maiorAltura)
                        maiorAltura = altura[i][j];
            }
            System.out.printf("A maior altura da %da delegação é: ", i+1);
            System.out.println(maiorAltura);
        }
        
    }
}