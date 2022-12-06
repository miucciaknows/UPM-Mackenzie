import java.util.Scanner;

public class Pessoas {
    public static void main(String[] args) {
        int i, idade, peso, peso90=0, totalIdade=0;
        float media;
        Scanner entrada = new Scanner(System.in);
    
        for (i=0; i<=4; i++){
            System.out.printf("Digite a idade da %da pessoa: ", i+1);
            idade = entrada.nextInt();
                       
            System.out.printf("Digite o peso da %da pessoa: ", i+1);
            peso = entrada.nextInt();
            System.out.println();
                      
            totalIdade = totalIdade + idade;
            
            if (peso > 90)
                 peso90 = peso90 + 1;
        }
        
        media = (totalIdade/5);
        System.out.println("Média de idade: " + media);
        System.out.println("Total de pessoas com mais de 90 quilos: " + peso90);        
    }
}
