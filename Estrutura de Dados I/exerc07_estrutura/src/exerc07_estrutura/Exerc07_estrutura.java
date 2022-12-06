/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc07_estrutura;

/**
 *
 * @author nath
 */

import java.util.*; 

public class Exerc07_estrutura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Lista lista = new Lista(100);
        Scanner scn = new Scanner(System.in);
        while (true) {
            System.out.println("0 - Sair.");
            System.out.println("1 -  Inserir um elemento no início");
            System.out.println("2 - Inserir um elemento no final");
            System.out.println("3 - Remover o elemento do início");
            System.out.println("4 - Remover o elemento do final");
            System.out.println("5 - Inserir um elemento na posição n a partir do inicio");
            System.out.println("6 - Inserir um elemento na posição n a partir do fim");
            System.out.println("7 - Remover o elemento da posição n a partir do fim");
            System.out.println("8 - imprimir a lista no sentido início -> fim");
            System.out.println("9 - Imprimir a lista no sentido fim -> início");
            System.out.print("Qual a sua opcao -> ");
            int opc = scn.nextInt();
            int num;
            System.out.println("Sua opção foi: " + opc);
           
            
            if (opc == 0){
                break;
            }
            
            else if (opc == 1){
                System.out.println("Digite o elemento que deseja inserir no inicio: ");
                num = scn.nextInt();
                lista.insertFirst(num);
                
            } else if (opc == 2){
                System.out.println("Digite o elemento que deseja inserir no final: ");
                num = scn.nextInt();
                if (lista.isEmpty()){
                    lista.insertFirst(num);
                } else {
                lista.insertLast(num);
                }
        
        } else if (opc == 3){
            System.out.println("Digite a posição do elemento que deseja remover: ");
            num = scn.nextInt();
            lista.delete(num);
            System.out.println("Remoção Concluida!");
                } 
        else if (opc == 4){
            System.out.println("Digite a posição do elemento que deseja remover: ");
            num = scn.nextInt();
            lista.delete(num);
            System.out.println("Remoção Feita!");
                }
        else if (opc == 5){
            System.out.println("Digite o elemento que deseja inserir");
            num = scn.nextInt();
            if (lista.isEmpty()) {
                lista.insertFirst(num);
                
            } else {
                lista.insertBefore(1, num);
                
            } 
            
        } else if (opc == 6){
            System.out.println("Digite o elemento que deseja inserir: ");
            num = scn.nextInt();
            if (lista.isEmpty()) {
                lista.insertFirst(num);
            } else {
                lista.insertLast(num);
            
        }
        }
            else if (opc == 7){
                System.out.println("Digite a posição do elemento que deseja remover: ");
                num = scn.nextInt();
                lista.delete(num);
                System.out.println("Remoção Feita!");

        }

        else if (opc == 8){
            System.out.println("-- Lista ---");
            for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
            
            
        } else if (opc == 9){
            System.out.println("-- Lista -- ");
            Collections.reverse((List<?>) lista);
            System.out.println(lista);
        }
            

        }
        
    }
}
            

    


