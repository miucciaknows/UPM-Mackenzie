/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula03;

/**
 *
 * @author nath
 */
import java.util.Scanner;

public class Pilha {
    //==========================================================================
    // CONSTANTES E VARIAVEIS
    //==========================================================================

    int tamanhoMaximo = 10;
    int topo = -1;
    int[] pilha;
    //--------------------------------------------------------------------------
    //==========================================================================
    // METODO INICIALIZADOR DO PROGRAMA
    // instancia um objeto da propria classe e transfere o controle
    // para metodos não estaticos.
    //==========================================================================

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.main2();
    }
    //--------------------------------------------------------------------------

    public void main2() {
        //= cria o vetor "pilha"
        pilha = new int[tamanhoMaximo];
        //= objeto de leitura do teclado
        Scanner scn = new Scanner(System.in);

        //= opção do menu digitada no teclado
        String opc;
        while (true) {
            limpaTela();
            printTela("\n0 - sair");
            printTela("\n1 - incluir um elemento");
            printTela("\n2 - remover um elemento");
            printTela("\n3 - verificar tamanho da pilha");
            printTela("\n4 - verificar se um elemento está na pilha");
            printTela("\n5 - imprimir o elemento de posição 'n', sendo que o topo é o primeiro");
            printTela("\n6 - imprimir o ele mento de posição 'n', sendo que o primeiro é o que está no fundo");
            printTela("\n9 - imprimir a pilha");
            printTela("\n\nDigite sua opção: ");
            opc = scn.nextLine();
            //= opção 0
            if ("0".equals(opc)) {
                break;
            } //
            //= opção 1
            else if ("1".equals(opc)) {
                printTela("\n\n--- informe o valor do novo elemento: ");
                opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (push(n)) {
                        printTela("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    printTela("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
            }
            
            //
            //= opção 2
            else if ("2".equals(opc)) {
                printTela("\n\n--- informe o valor do elemento a ser removido: ");
                opc = scn.nextLine();
                try {
                    int n = Integer.parseInt(opc);
                    if (pop (n)){
                        printTela("\nExcluido " + n);
                    }
                opc = scn.nextLine();
                }
                catch (NumberFormatException ex) {
                    printTela("Valor invalido!! (press. tecla)");

                }

                }
            //
            //= opção 3
            
            else if ("3".equals(opc)){
                printTela("\n\n--- Tamanho da pilha"+ getSize(pilha));
            }
            
            //= opção 4
            else if ("4".equals(opc)){
                printTela("\n\n--- informe o valor do elemento a ser consultado na pilha: ");
                int [] vetor = new int [tamanhoMaximo];
                opc = scn.nextLine();
                int n = Integer.parseInt(opc);
                try {
                    for (int count = 0; count <= vetor.length; count++){
                        if (n == vetor [count]){
                            System.out.println("Valor encontrado: "+ n);
                            break;
                        }
                    }
                }
                    catch (Exception Ex){
                            System.out.println("Valor não encontrado: " + n);
                            }
  
            }
        

            
        //            
        //= opção 5
        else if ("5".equals(opc)){
            printTela("Digite o número: ");
            opc = scn.nextLine();
            printTela("Imprimir o elemento de posicao 'n', sendo que o topo é o primeiro");
            int n = Integer.parseInt(opc);
            try {
                    if (push(n)) {
                        printTela("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    printTela("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
            System.out.println(n + topo);
        
        }
        
        //            
        //= opção 6
        else if ("6".equals(opc)){
            printTela("Digite o número: ");
            opc = scn.nextLine();
            printTela("imprimir o elemento de posição 'n', sendo que o primeiro é o que está no fundo");
            int n = Integer.parseInt(opc);
             try {
                    if (push(n)) {
                        printTela("\nIncluido " + n);
                    }
                    opc = scn.nextLine();
                } catch (NumberFormatException ex) {
                    printTela("Valor invalido!! (press. tecla)");
                    opc = scn.nextLine();
                }
            System.out.println(pilha[0]+n);
      


        }
        
        
    //================================================================================
    // Professor, o Menu realmente pulou do 6 para o 9 de acordo com o link no moodle.
    //================================================================================
 
         //
        // opcão 9
        else if ("9".equals(opc)) {
            print();
            System.out.println(tamanhoMaximo);
            printTela("\n\n(press. tecla)");
            opc = scn.nextLine();
            }
        }
        limpaTela();
        printTela("Obrigado e até breve.\n\n\n");
    }
    //= insere um elemento na pilha

    public boolean push(int n) {
        if (full()) {
            printTela("\nNão pode incluir. A pilha está cheia.");
            return false;
        } else {
            topo++;
            pilha[topo] = n;
            return true;
        }
    }
    
     //= exclui um elemento na pilha
    public boolean pop(int n) {
         if (empty()) {
            printTela("\nNão pode excluir. A pilha está  vazia.");
            return false;
         } 
         else {
            topo--;
            pilha[topo] = n;
            return true;
        }
    }
    //= imprime a pilha

    public void print() {
        printTela("[ ");
        if (!empty()) {
            for (int i = 0; i <= topo; i++) {
                printTela(String.valueOf(pilha[i]) + " ");
            }
        }

        printTela("]");
    }
    //= verifica se está vazia

    public boolean empty() {
        return topo == -1;
    }
    

    //= verifica se a pilha está cheia (lotação maxima)

    public boolean full() {
        return topo == tamanhoMaximo - 1;
    }
    
    //= tamanho da pilha
   public int[] getSize(int[] pilha1) { 
        int[] size = pilha;
        return size; 
}
    //==========================================================================
    // METODOS AUXILIARES
    //==========================================================================
    //
    //= IMPRIME UMA MENSAGEM NA TELA
    // (encurtar um pouco o comando padrao)

    public void printTela(String str) {
        System.out.print(str);
    }
    //= LIMPA A TELA
    // (empurra o texto anterior para cima)

    public void limpaTela() {
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
    //--------------------------------------------------------------------------
}
