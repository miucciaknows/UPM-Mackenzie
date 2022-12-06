package LabEDI;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nath
 * 41714849
 */
public class NewMaini {

    private static Noi atuali;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArvoreAvli ai = new ArvoreAvli();
        Scanner entradai = new Scanner(System.in);
        while (true){
            System.out.println("- Menu - ");
            System.out.println("Sair -> 0 ");
            System.out.println("Incluir um elemento na árvore -> 1");
            System.out.println("Localizar um elemento na árvore e dizer qual a sua profundidade -> 2");
            System.out.println("Excluir um elemento da árvore -> 3");
            System.out.println("Localizar e imprimir o(s) nó(s) com a maior profundidade na árvore e dizer qual é a profundidade -> 4");
            System.out.println("Localizar todos os nós -> 5");
            System.out.println("Localizar todos os nós folhas (ou nós externos) e a profundidade de cada um deles -> 6");
            System.out.println("Imprimir o percurso em ordem -> 7 ");
            System.out.println("Imprimir o percurso em pré ordem -> 8 ");
            System.out.println("Imprimir o percurso em pós ordem -> 9");
            System.out.println("Digite o número da opção do menu: ");
            int opci = entradai.nextInt();

            if (opci == 0){
                System.out.println("Até breve!");
                break;

            } else if (opci == 1){
                System.out.println("Opção escolhida -> 1");
                System.out.print("Incluir elemento na árvore");
                ai.inseriri(12);
                ai.inseriri(122);
                ai.inseriri(10);
                ai.inseriri(132);
                ai.inseriri(3);
                ai.inseriri(1);

            } else if (opci == 2){
                System.out.println("Opção escolhida -> 2");
                ai.verificarBalanceamentoi(atuali);

            } else if (opci == 3){
                System.out.println("Opção escolhida -> 3");
                ai.removeri(12);

            } else if (opci == 4) {
                System.out.println("Opção escolhida -> 4");
                Noi atuali = null;
                ai.alturai(atuali);

            } else if (opci == 5 || opci == 6) {
                ai.printAvli();

            } else if (opci == 7){
                System.out.println("Opção escolhida -> 7");
                System.out.println("Em ordem...");
                ai.inorderi();

            } else if (opci == 8  || opci == 9){
                ai.printAvli(atuali);
                ai.printAvli();

            }

    }
    }
}
    

