import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        
        double[] peso = new double[10];
        double[] altura = new double[10];
        double[] imc = new double[10];
        
        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("\nDigite o peso %da pessoa: ", i+1);
            peso[i] = entrada.nextDouble();
                       
            System.out.printf("Digite o altura da %da pessoa: ", i+1);
            altura[i] = entrada.nextDouble();
            
            imc[i] = (double) (peso[i] / (altura[i]*altura[i]));
            
            System.out.printf("Valor do imc: %.2f ", imc[i]);
            
            System.out.println();
        }

        /* imprimindo toda a array
        for (double x : peso) {
            System.out.println(x);
        }
        */
    }  
}
