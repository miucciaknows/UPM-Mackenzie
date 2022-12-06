package teste_excecao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Meses_exception {
    public static void main(String[] a){
 
        String meses[] = {"Janeiro", "Fevereiro", "Março", "Abril",
                          "Maio", "Junho", "Julho", "Agosto","Setembro",
                          "Outubro", "Novembro", "Dezembro"};
        try {
            int mes = 1;
            Scanner num = new Scanner(System.in);
        
            while (mes != -1){
                System.out.print ("Qual número do mês (entre 1 e 12) (-1 para finalizar): ");
                mes = num.nextInt();
                
                System.out.println ("Nome do mês = " + meses[mes-1]);
            }
        }
        catch (ArrayIndexOutOfBoundsException e1){
            System.out.println("Posição do vetor inválida");
        }
        catch(InputMismatchException e2) {
                System.out.println("Tipo de dado tem que ser inteiro entre 1 e 12");
        }
        System.out.println("# fim do programa #");
    }
}
