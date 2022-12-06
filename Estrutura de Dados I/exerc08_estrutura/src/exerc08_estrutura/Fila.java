package exerc08_estrutura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nath
 */

import java.util.*;
import java.util.Arrays;

public class Fila {
    public static void main(String[] args) throws EmptytadFilaException {
        Scanner scn = new Scanner(System.in);
        tadFila fila = new tadFila(10);
        while (true) {
            System.out.println("- - - TAD Fila - - -");
            System.out.println("Sair do Programa -> 0");
            System.out.println("Verificar quantidade de elementos na fila -> 1");
            System.out.println("Inserir um novo elemento na fila -> 2");
            System.out.println("Atender o próximo elemento a fila -> 3");
            System.out.println("Verificar se um determinado elemento está na fila -> 4");
            System.out.println("Imprimir a fila -> 5");
            System.out.println("Digitr a opção desejada: ");
            int opc = scn.nextInt();
            
            if (opc == 0) {
                break;
            
            }
            
            else if (opc == 1){
                System.out.println("1 - Verificar quantidade de elementos da Fila");
                System.out.println(fila.size());
            }
            
            else if (opc == 2){
                System.out.println("2 - Digite o número que deseja adcionar na fila: ");
                int num = scn.nextInt();
                fila.enqueue(num);
                System.out.println("Elemento Adicionado na fila... " + num);
                
            }
            
            else if (opc == 3){
                System.out.print("3 - Atender o próximo elemento da fila ");
                fila.dequeue();
                System.out.println("Concluido!");
            }
            
            
            
            else if (opc == 4){
                System.out.println("Digite o número que deseja verificar se está na fila: ");
                int num = scn.nextInt();
                System.out.println(fila.equals(num));
               
               
            }
            
            
            else if (opc == 5){
                System.out.println("-- Fila ---");
                for (int i = 0; i < fila.size(); i++) {
                    System.out.println(fila.get(i));
		}
            

        }
        }
    }
}

    
    

