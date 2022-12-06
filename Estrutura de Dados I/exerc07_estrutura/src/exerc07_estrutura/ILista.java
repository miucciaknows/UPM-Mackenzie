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
public interface ILista {
    public boolean isEmpty();
    public int size();
    public void delete(int posicao);
    public void insertFirst(int elemento);
    public void insertLast(int elemento);
    public void insertAfter(int posicao,int elemento);
    public void insertBefore(int posicao,int elemento);
    public int retrieve(int posicao);
    public void set(int posicao, int elemento);
}

