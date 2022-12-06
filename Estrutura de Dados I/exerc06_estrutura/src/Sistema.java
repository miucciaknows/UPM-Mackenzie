
/**
 *
 * @author nath
 */
import java.util.Scanner;

public class Sistema {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TadListaLigada lista = new TadListaLigada();
        Scanner scn = new Scanner(System.in);
        Scanner scnS = new Scanner(System.in);
        int contador = 0;

        while (true) {

            System.out.println("\n\n\n==========================================");
            System.out.println("TAD Lista Ligada");
            System.out.println("==========================================");
            System.out.println("");
            System.out.println("0 - sair");
            System.out.println("1 - inserir um elemento no inicio da lista");
            System.out.println("2 - inserir um elemento no final da lista");
            System.out.println("3 - alterar o valor do elemento de posição n na lista");
            System.out.println("4 - inserir um elemento na posição n da lista (o atual n irá para n+1)");
            System.out.println("5 - excluir um elemento da posição n da lista");
            System.out.println("6 - contar os elementos da lista");
            System.out.println("7 - imprimir elementos da lista");
            System.out.println("\n");
            System.out.print("Digite sua escolha: ");
            int opc = scn.nextInt();
            int num;
            if (opc == 0) {
                break;
            } else if (opc == 1) {
                System.out.println("Informe o valor do novo elemento a ser inserido no inicio: ");
                num = scn.nextInt();
                Elemento e = new Elemento(num);
                lista.insereInicio(e);
                contador++;
            } 
            
            
            else if (opc == 2) {
                System.out.println("Informe o valor do novo elemento a ser inserido no final: ");
                num = scn.nextInt();
                Elemento e = new Elemento(num);
                if (lista.vazia()) {
                    lista.insereInicio(e);
                    contador++;
                } else {
                    lista.insereFinal(e);
                    contador++;
                }
            } 
            
            
            else if (opc == 3) {
                if (lista.vazia()) {
                    System.out.println ("Não há elemento para ser alterado");
                } else {
                      System.out.println ("Digite a posição do elemento que deseja alterar ");
                      opc = scn.nextInt();
                      if (opc == 1){
                          System.out.println("Digite o número pelo qual deseja substituir: ");
                          num = scn.nextInt();
                          Elemento y = new Elemento (num);
                          lista.insereInicio(y);
                          contador++;
                      }
                      else {
                          System.out.println("Digite o número pelo qual deseja substituir: ");
                          num = scn.nextInt();
                          Elemento y = new Elemento (num);
                          lista.insereFinal(y);
                          contador++;
                          
                      }

   
                        }
    
            }
        

            else if (opc == 4){
                System.out.println("Digite a posição que deseja adicionar um elemento 1 para começo 2 para final: ");
                opc = scn.nextInt();
                if (opc == 1){
                    System.out.println("Digite o número que deseja inserir: ");
                    num = scn.nextInt();
                    Elemento e = new Elemento(num);
                    lista.insereInicio(e);
                    contador++;
                } else {
                    System.out.println("Digite o número que deseja inserir: ");
                    num = scn.nextInt();
                    Elemento e = new Elemento(num);
                    lista.insereFinal(e);
                    contador++;
                   
                }
           
                
            }
            

            
            else if (opc == 5){
                System.out.println("Digite a posição do número que deseja excluir da lista: ");
                opc = scn.nextInt();
                if (opc == 1){
                    System.out.println("Digite novamente a posição do número que deseja excluir da lista: ");
                    num = scn.nextInt();
                    Elemento e = new Elemento(num);
                    lista.removeInicio(e);
                    contador--;
                    System.out.println("Remoção Feita");
            }
                else if (opc == 2){
                    System.out.println("Digite novamente a posição do número que deseja excluir da lista: ");
                    num = scn.nextInt();
                    Elemento e = new Elemento(num);
                    lista.removeFim(e);
                    contador--;
                    System.out.println("Remoção Feita");
                    
                        
                        
                       
                        
            
                        }
            }

          
         else if (opc == 6){
             System.out.println("Quantidade de elementos na lista: "+ contador);
             
         }
            
            
            
            
            else if (opc == 7) {
                System.out.println(lista.imprime());
            }

            System.out.println("\n\n(press. ENTER)");
            String s = scnS.nextLine();

        }

        System.out.println("\n--------------------------------------------------");
        System.out.println("*** Obrigado e até breve ***");

    }

}