package exerc07_estrutura;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nath
 */
public class Lista implements ILista {

    public int[] elementos;
    public int indice = 0;
    private int capacidade;
    

    public Lista(int capacidade) {
        this.capacidade = capacidade;
        elementos = new int[capacidade];
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public int size() {
        return indice;
    }

    @Override
    public void delete(int posicao) {
        if (posicao <= capacidade-1) {
            for (int i = posicao; i < capacidade - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
        }  
        else {
            System.out.println("Posição não existe!");
        }
    }

    @Override
    public void insertFirst(int elemento) {

    }

    @Override
    public void insertLast(int elemento) {
        elementos[indice] = elemento;
        indice++;
    }

    @Override
    public void insertAfter(int posicao, int elemento) {

    }

    @Override
    public void insertBefore(int posicao, int elemento) {

    }

    @Override
    public int retrieve(int posicao) {
        return elementos[posicao];
    }

    @Override
    public void set(int posicao, int elemento) {
        elementos[posicao] = elemento;
    }
   
    public int get(int i) {
        return i;
    }
    
     

    }

