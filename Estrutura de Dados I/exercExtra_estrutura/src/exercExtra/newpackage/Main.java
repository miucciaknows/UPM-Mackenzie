package exercExtra.newpackage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nath
 * TIA: 41714849
 */
import java.util.*;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scn = new Scanner(System.in);
        LinkedList fila = new LinkedList();
        LinkedList filaDois = new LinkedList();
        LinkedList filaTres = new LinkedList();
        Element e1 = new Element();
        e1.setValue(1);
        Element e2 = new Element();
        e2.setValue(2);
        Element e3 = new Element();
        e3.setValue(3);
        Element e4 = new Element();
        e4.setValue(4);
        Element e5 = new Element();
        e5.setValue(5);
        Element e6 = new Element();
        e6.setValue(6);
        Element e7 = new Element();
        e7.setValue(7);
        Element e8 = new Element();
        e8.setValue(8);
        Element e9 = new Element();
        e9.setValue(9);
        Element e10 = new Element();
        e10.setValue(10);
        int prioridadeUm;
        prioridadeUm = 10;
        int prioridadeDois;
        prioridadeDois = 10;
        int prioridadeTres;
        prioridadeTres = 10;
        
        while (true) {
            System.out.println("--- Menu --- ");
            System.out.println("0 - sair do programa.");
            System.out.println("1 - Verificar a quantidade de elementos total da fila: ");
            System.out.println("2 - verificar a quantidade de elementos de determinada prioridade e qual a posição do primeiro"
                    + " elemento desse grupo em relação ao primeiro da fila");
            System.out.println("3 - Inserir um novo elemento na fila (solicita o número identificador do elemento e o "
                    + "grau de prioridade).");
            System.out.println("4 - Atender o próximo elemento da fila.");
            System.out.println("5 - Imprimir a fila");
            System.out.println("Digite o número correspondente a opção escolhida: ");
            int opc = scn.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Opção escolhida -> 0");
                    System.out.print("- Até breve -");
                    break;
                case 1: 
                    System.out.println("Opção escolhida -> 1");
                    System.out.println("Qual fila deseja consultar: 1, 2, 3? ");
                    int opcMenu = scn.nextInt();
                    if (opcMenu == 1){
                        if (fila.isEmpty()){
                            System.out.println("Fila Vazia!");
                        } else{
                        for (int i= 0; i > fila.size(); i++){
                        System.out.println(i);
                        }
                        
                    }
                    }else if (opcMenu == 2){
                           if (filaDois.isEmpty()){
                            System.out.println("Fila Vazia!");
                    } else {
                            for (int i= 0; i > filaDois.size(); i++){
                            System.out.println(i);
                            }
                            }
                    }else if (opcMenu == 3){
                           if (filaTres.isEmpty()){
                            System.out.println("Fila Vazia!");
                    }
                        for (int i= 0; i > filaTres.size(); i++){
                        System.out.println(i);
                        }
                        
                    } break;
                case 2:
                    System.out.println("Opção escolhida -> 2");
                    System.out.println("");
                    int opcGrau = scn.nextInt();
                    System.out.println("Qual o grau que deseja? Digite um número de 1 a 3: ");
                    if (opcGrau == 1){
                        System.out.println(prioridadeUm);
                        if (fila.isEmpty()){
                            System.out.println("Fila vazia!");
                           
                        } else if (opcGrau == 2){
                           System.out.println(prioridadeDois);
                            if (filaDois.isEmpty()){
                                System.out.println("Fila vazia!");
                        }
                        
                    } else if (opcGrau == 3){
                        System.out.println(prioridadeTres);
                         if (filaTres.isEmpty()){
                            System.out.println("Fila vazia!");

                         } 
                    } 
                    } break;
                case 3:
                    int qtdTres = 0;
                    for (int i = 0; i > qtdTres; i++) {
                    System.out.println("Opção escolhida -> 3");
                    System.out.println("Em qual fila deseja adicionar um novo elemento? 1, 2 ou 3?");
                    int opcPrioridade = scn.nextInt();
                    if (opcPrioridade == 1){
                        prioridadeUm++;
                    } else if (opcPrioridade == 2){
                        prioridadeDois++;
                    } else if (opcPrioridade == 3){
                        prioridadeTres++;
                    }
                    System.out.println("Em qual fila deseja adicionar um novo elemento? 1, 2 ou 3?");
                    int opcFila = scn.nextInt();
                    if (opcFila == 1){
                        Element e11 = new Element();
                        e11.setValue(11);
                        fila.insertLast(e11);
                        System.out.print("Elemento adcionado no final da fila...");
                        qtdTres++;
                        

                    } else if (opcFila == 2){
                        Element e11 = new Element();
                        e11.setValue(11);
                        filaDois.insertLast(e11);
                        System.out.print("Elemento adcionado no final da fila...");
                        qtdTres++;
                       

                    }else if (opcFila == 3){
                        Element e11 = new Element();
                        e11.setValue(11);
                        filaTres.insertLast(e11);
                         qtdTres++;
                         
                    } break;
                    } 
            
                    
                case 4:
                    System.out.println("Opção escolhida -> 4");
                    System.out.println("Qual fila deseja atender? 1, 2 ou 3? ");
                    int opc_b = scn.nextInt();
                    if (opc_b == 1){
                         fila.deleteFirst(e1);
                         System.out.println("Concluido!");
                        
                    } else if (opc_b == 2){
                         filaDois.deleteFirst(e1);
                         System.out.println("Concluido!");
                        
                    } else if (opc_b == 3){
                         filaDois.deleteFirst(e1);
                         System.out.println("Concluido!");
                    }
                    break;
                case 5:
                    System.out.println("Opção escolhida -> 5");
                    for (int i =0;i < fila.size();i++){
                        System.out.print(fila.retrive(i).getValue()+" =>");
                    }
                    for (int i =0;i < filaDois.size();i++){
                        System.out.print(filaDois.retrive(i).getValue()+" =>");
                    }           
                    for (int i =0;i < filaTres.size();i++){
                        System.out.print(filaTres.retrive(i).getValue()+" =>");
                        
                    }break;
               
            }
        }
    }
    
}

