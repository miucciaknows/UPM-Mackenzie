/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula_04;

/**
 *
 * @author nath
 */

import java.util.*;

public class Pilha {
    int tamanhoMax = 10;
    int topo = 1;
    int [] pilha;
    
 public static void main(String[] args) {
        Pilha um = new Pilha();
        Pilha dois = new Pilha();
        Pilha tres = new Pilha(); 

 }
 
 public void main2(){
     pilha = new int [tamanhoMax];
     Scanner scn = new Scanner(System.in);
     String opc;
     while (true) {
     System.out.println("Escolha Uma opção do Menu abaixo: ");
     System.out.println("0 para Sair do Jogo");
     System.out.println("1 para Movimentar");
     opc = scn.nextLine();
      if ("0".equals(opc)) {
                break;
            }
      else if ("1".equals(opc)){
          System.out.println("Qual Pilha deseja sofrer push? 1, 2 ou 3? ");
          opc = scn.nextLine();
          if ("1".equals(opc)){
              System.out.println("\n\n--- informe o valor do novo elemento: ");
              opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (push(n)) {
                        System.out.println("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
              
          }
          else if ("2".equals(opc)){
              if ("1".equals(opc)){
              System.out.println("\n\n--- informe o valor do novo elemento: ");
              opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (push(n)) {
                        System.out.println("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
              
          }
              
          }
          else if ("3".equals(opc)){
              if ("1".equals(opc)){
              System.out.println("\n\n--- informe o valor do novo elemento: ");
              opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (push(n)) {
                        System.out.println("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
              
          }
              
          }
          System.out.println("Qual Pilha deseja sofrer pop? 1, 2 ou 3? ");
          opc = scn.nextLine();
           if ("1".equals(opc)){
               System.out.println("\n\n--- informe o valor do elemento a ser removido: ");
                opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (pop (n)){
                        System.out.println("\nExcluido " + n);
                    }
                opc = scn.nextLine();
                }
                catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");

                }
              
          }
          else if ("2".equals(opc)){
               System.out.println("\n\n--- informe o valor do elemento a ser removido: ");
                opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (pop (n)){
                        System.out.println("\nExcluido " + n);
                    }
                opc = scn.nextLine();
                }
                catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");

                }
              
          }
          else if ("3".equals(opc)){
               System.out.println("\n\n--- informe o valor do elemento a ser removido: ");
                opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (pop (n)){
                        System.out.println("\nExcluido " + n);
                    }
                opc = scn.nextLine();
                }
                catch (NumberFormatException ex) {
                    System.out.println("Valor invalido!! (press. tecla)");

                }
          }
      }
     }
 }

  
     
    public boolean full() {
        return topo == tamanhoMax - 1;
    }

    public boolean empty() {
        return topo == -1;
    }
       
    public boolean push(int n) {
        if (full()) {
            System.out.println("\nNão pode incluir. A pilha está cheia.");
            return false;
    }   else {
            topo++;
            pilha[topo] = n;
            return true;
        }
    }

    public boolean pop(int n) {
        if (empty()) {
        System.out.println("\nNão pode excluir. A pilha está  vazia.");
        return false;
         } 
        else {
            topo--;
            pilha[topo] = n;
            return true;
        }
    }




}






     
     