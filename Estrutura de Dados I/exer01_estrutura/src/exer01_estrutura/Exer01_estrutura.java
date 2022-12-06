package exer01_estrutura;
/**
 *
 * @author nath
 */
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class Exer01_estrutura {
    static int[] numeros;
    public static void main(String[] args) {
        numeros = new int[5];
        Scanner scn = new Scanner(System.in);
        Scanner scn2 = new Scanner(System.in);
        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n");
            System.out.println("\n----------------------------------------------");
            System.out.println(" RELEMBRANDO VETORES");
            System.out.println("----------------------------------------------");
            System.out.println("0 - sair.");
            System.out.println("1 - imprimir o vetor.");
            System.out.println("2 - inserir um elemento (maior que zero e a posicao no vetor tem que estar livre (=0)).");
            System.out.println("3 - excluir um elemento.");
            System.out.println("4 - trocar dois elementos de lugar entre si.");
            System.out.println("5 - localizar o maior e o menor elementos do vetor");
            System.out.println("6 - ordenar os elementos do vetor em ordem crescente");
            System.out.println("7 - ordenar os elementos do vetor em ordem decrescente");
            System.out.println("8 - ordenar os elementos do vetor em um segundo vetor (o metodo cria o novo vetor, copia os dados e retorna o vetor ordenado)");
            System.out.println("---------------------");
            System.out.print("Qual a sua opcao -> ");
            int opc = scn.nextInt();

            if (opc == 0) {
                break;
        }
        else if (opc == 1) {
            imprimir();
            cn.nextLine();
 } 
        else if (opc == 2) {
 //= precisa pedir os dados: posicao no vetor (indice) e valor do elemento.
 
            System.out.print("Indice do novo elemento: ");
            int idx = scn.nextInt();
 
            System.out.print("Valor do novo elemento: ");
            int val = scn.nextInt();
 
            System.out.println(incluir(idx, val));
 }
        else if (opc == 3) {
            System.out.print("Indice do elemento a ser removido: ");
            int idx = scn.nextInt();
            int val = excluir(idx);
 
        if (val == 0) {
            System.out.println("Nao há elemento na posição " + idx);
 } 
        else if (val == -1) {
            System.out.println("ERRO: o indice está fora dos limites do vetor.");
 } 
        else {
            System.out.println("Valor excluido da posicao " + idx + ": " + val);
 }
 } 
        else if (opc == 4) {
            int[] vetor = numeros;
            Scanner leiaNum = new Scanner(System.in);
            for (int i = 0; i < 2; i++) {
                System.out.print("Digite o número " + (i + 1) + ": ");
                vetor[i] = leiaNum.nextInt();
    }    
   
            for (int i = 0; i < 2; i += 2) {
                int aux = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = aux;
    }
   
            for (int i = 0; i < 2; i++){
                System.out.print(vetor[i] + "   ");
            
        }
        
        }
        
    
         else if (opc == 5) {
            System.out.print("Localizar o maior e o menor: ");
            Arrays.sort(numeros);
            int maior=numeros[0]; 
            int menor=numeros[4];
            System.out.println("Maior: "+maior);
            System.out.println("Menor: "+menor);
    }
            
        

        else if (opc == 6) {
            System.out.print("Ordenar os elementos do vetor em ordem crescente");
            Arrays.sort(numeros);
            for (int j = 1; j < numeros.length; j++) {
	       	  System.out.print(numeros[j]+ "  "); 
 } 
        }
               
            
        else if (opc == 7) {
            System.out.print("Ordenar os elementos do vetor em ordem decrescente");
             Arrays.sort(numeros);
            for (int j = 0; j < numeros.length; j++) {
	       	  System.out.print(numeros[j]+ "  "); 
 
            
 } 
                }
            
        
        else if (opc == 8) {
            System.out.print("Ordenar os elementos do vetor em um segundo vetor o metodo cria o novo vetor, copia os dado e retorna o vetor ordenado)");
            int [] b = new int[numeros.length];                
            System.arraycopy(numeros, 0, b, 0, numeros.length);
            Arrays.sort(b);
            for (int i=0; i < numeros.length; i++) {
            System.out.println(i + "=" + b[i]);
             
 }
        


        System.out.println("\n\nPressione ENTER para prosseguir.");
        scn2.nextLine();
 }
        System.out.println("-------------------------------------------------");
        System.out.println("\n\nObrigado e até a proxima vez.");
 }
    }
           
       
 /**
 * Metodo para imprimir o vetor.
 */

    static void imprimir() {
    System.out.print("\n[ ");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
 }
    }
   
 /**
 * Metodo para incluir um elemento no vetor. A posicao tem que estar vaga
 * (valor do elemento igual a zero). O novo elemento tem que ser maior que
 * zero.
 *
 * @param indice - indice do elemento que sera´ incluido.
 * @param valor - valor do elemento a ser incluido.
 * @return
 */
 
           
static String incluir(int indice, int valor) {
 // verifica se o valor é maior que zero
    if (valor < 0) {
        return "ERRO: o valor tem que ser maior que zero.";
 }
 // verifica se o indice é valido
     if (indice < 0 || indice > numeros.length - 1) {
        return "ERRO: o indice está fora dos limites do vetor.";
 }
 // verifica se a posicao já está ocupada.
    if (numeros[indice] > 0) {
        return "ERRO: posicao ocupada.";
 }
 // passou por todas as verificacoes: inserir
 numeros[indice] = valor;
 return "Inclusao bem sucedida.";
 }
 /**
 * Excluir um elemento do vetor. Atribui zero à posicao e retorna o
 * elemento (valor).
 *
 * @param indice - indice do elemento que será excluido.
 * @return - valor do elemento excluido. Se retornar zero é porque a
 * posicao estava vazia; se retornar -1 e´ porque o indice é invalido.
 */
 static int excluir(int indice) {
 // verifica se o indice é valido
    if (indice < 0 || indice > numeros.length - 1) {
    return -1;
 }
 int numero = numeros[indice];
 numeros[indice] = 0;
 return numero;
 }
 
  
  }



    
 
 
 
 
 
 
 
       
     
 
 


 



         
   