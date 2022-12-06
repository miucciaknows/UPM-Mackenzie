/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exer02_estrutura;

/**
 *
 * @author nath
 */
public class TadVetor {
 /**
 * Metodo construtor padrao. No nosso caso nada está sendo inicializado,
 * sendo desnecessaria a sua presenca no codigo.
 */
    public TadVetor() {
 }
 /**
 * Metodo construtor alternativo com inicializacao do vetor.
 *
 * @param tamanho
 */
    public TadVetor(int tamanho) {
    this.numeros = new int[tamanho];
 }
 /**
 * Vetor de numeros inteiros.
 */
    int[] numeros;
 /**
 * Metodo para imprimir o vetor.
 */
 public void imprimir() {
    System.out.print("\n[ ");
    for (int i = 0; i < numeros.length; i++) {
        System.out.print(numeros[i] + " ");
 }
    System.out.println("]");
 }
 /**
 * Metodo para incluir um elemento no vetor. A posição tem que estar vaga
 * (valor do elemento igual a zero). O novo elemento tem que ser maior que
 * zero.
 
* @param indice - indice do elemento que será incluido.
 * @param valor - valor do elemento a ser incluido.
 * @return
 */
 public String incluir(int indice, int valor) {
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
        return "ERRO: posição ocupada.";
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
 * posição estava vazia; se retornar -1 é porque o indice é invalido.
 */
 public int excluir(int indice) {
    return 0;
 }
}
