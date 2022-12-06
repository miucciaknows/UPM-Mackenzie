import java.util.Scanner;

public class Operacoes {
    public static void main(String[] args) {
     
        int num1, num2, opcao, diferenca, produto;
        float media, divisao;
                
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o valor do 1o número: ");
        num1 = entrada.nextInt();
        
        System.out.print("Digite o valor do 2o número: ");
        num2 = entrada.nextInt();
        System.out.println();
                       
        while (true){
            System.out.print("Digite a operação desejada: 1 - media, 2 - multiplicação, 3 - diferença , 4 Sair: ");
            opcao = entrada.nextInt();
            
            if (opcao == 1){
                media = (float) (num1+num2)/2;
                System.out.println("Média: " + media);
                System.out.println();
            }
            else if (opcao == 2){
                produto = (num1 * num2);
                System.out.println("Produto: " + produto);
                System.out.println();
            }
            else if (opcao == 3){
                if (num1 > num2)
                    diferenca = num1 - num2;
                else 
                    diferenca = num2 - num1;
                System.out.println("Diferença: " + diferenca);
                System.out.println();
                
            }
            else 
                break;       
        }
    }
}
