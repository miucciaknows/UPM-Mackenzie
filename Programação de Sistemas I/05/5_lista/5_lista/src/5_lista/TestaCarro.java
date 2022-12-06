package 5_lista;

import java.util.Scanner;
/**
 *
 * @author 41714849
 */
public class TestaCarro {
    public static void main(String[] args) {
        Carro fusca = new Carro();
        
        fusca.ligar();
        fusca.buzinar();
        
        fusca.velocidadeAtual = 40.0;
        fusca.velocidadeMaxima = 60.0;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Quanto você quer acelerar?");
        Double valor = scan.nextDouble();
        
        int test = fusca.acelerar(valor);
        System.out.println("A velocidade atual é " + fusca.velocidadeAtual + "km/h");
        if (test == -1)
            System.out.println("A velocidade atual é maior ou igual à velocidade máxima");
        
        test = fusca.pegarMarcha();
        if (test == -1)
            System.out.println("Carro parado");
        else if (test == 1)
                System.out.println("1a marcha");
        else if (test == 2)
                System.out.println("2a marcha");
        else if (test == 3)
                System.out.println("3a marcha");
        else if (test == 4)
                System.out.println("4a marcha");
        else
            System.out.println("5a marcha");
    }
    
}
