package aula03;

import java.util.Scanner;


/**
 *
 * @author Nath
 */
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
    // para metodos nao estaticos.
    //==========================================================================

    public static void main(String[] args) {
        Pilha p = new Pilha();
       
    }
    //--------------------------------------------------------------------------

    public void main2(boolean temp) {
        //= cria o vetor "pilha"
        pilha = new int[tamanhoMaximo];
        //= objeto de leitura do teclado
        Scanner scn = new Scanner(System.in);

        //= opcao do menu digitada no teclado
        String opc;
        while (true) {
            limpaTela();
            printTela("\n0 - sair");
            printTela("\n1 - incluir um elemento");
            printTela("\n2 - remover um elemento");
            printTela("\n3 - verificar tamanho da pilha");
            printTela("\n4 - verificar se um elemento está na pilha");
            printTela("\n5 - imprimir o elemento de posicao 'n', sendo que o topo é o primeiro");
            printTela("\n6 - imprimir o elemento de posicao 'n', sendo que o primeiro é o que está no fundo");
            printTela("\n9 - imprimir a pilha");
            printTela("\n\nDigite sua opcao: ");
            opc = scn.nextLine();
            //= opcao 0
            if ("0".equals(opc)) {
                break;
            } //
            //= opcao 1
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
            //= opcao 2

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
            
            //= opcao 3
            
            else if ("3".equals(opc)){
                printTela("\n\n--- Tamanho da pilha"+ getSize(pilha));


            }
            
            //= opcao 4  
            else if ("4".equals(opc)){
                printTela("\n\n--- informe o valor do elemento a ser consultado na pilha: ");
                opc = scn.nextLine();

            
                }


          //= opcao 5
            else if ("5".equals(opc)){  
                printTela("Digite o número: ");
                opc = scn.nextLine();
                printTela("Imprimir o elemento de posicao 'n', sendo que o topo é o primeiro");
                int n = Integer.parseInt(opc);
                System.out.println(topo + n);
                
            
            }
         //= opcao 6
            else if ("6".equals(opc)){
            printTela("Digite o número: ");
            opc = scn.nextLine();
            printTela("imprimir o elemento de posicao 'n', sendo que o primeiro é o que está no fundo");

            
            }

             //
            // opcao 9
            else if ("9".equals(opc)) {
                print();
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
    

//= tamanho da pilha
   public int[] getSize(int[] pilha1) { 
        int[] size = pilha;
        return size; 
}
    

    
    //= verifica se está vazia

    public boolean empty() {
        return topo == -1;
    }
    //= verifica se a pilha está cheia (lotação maxima)

    public boolean full() {
        return topo == tamanhoMaximo - 1;
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

