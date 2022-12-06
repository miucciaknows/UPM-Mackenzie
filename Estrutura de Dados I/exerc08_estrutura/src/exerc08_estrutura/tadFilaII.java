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

public interface tadFilaII <E>{
     public int size();
     public boolean isEmpty();
     public void enqueue(E e) throws ArrayIndexOutOfBoundsException;
     public void dequeue() throws EmptytadFilaException;
     public E front() throws EmptytadFilaException;
}