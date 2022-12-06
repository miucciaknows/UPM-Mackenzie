/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerc08_estrutura;

/**
 *
 * @author nath
 */
import java.util.ArrayList;
import java.util.List;

public class tadFila <E> implements tadFilaII <E>,Cloneable {

    public int capacity;
    public List<E> elements;

    public tadFila(int capacity) {
        this.capacity = capacity;
        elements = new ArrayList<E>(capacity);
    }

    @Override
    public int size() {
        int size = 10;
        size = elements.size();
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean isEmpty = true;
        return (elements.size()==0);
    }

    @Override
    public void enqueue(E e) throws ArrayIndexOutOfBoundsException {
        if (elements.size() == this.capacity){
            throw new ArrayIndexOutOfBoundsException();
        } else {
            elements.add(e);
        }
    }

   
    public void dequeue() throws EmptytadFilaException {
        if (elements.size() == 0){
            throw new EmptytadFilaException();
        } else {
            elements.remove(0);
        }
    }

    @Override
    public E front() throws EmptytadFilaException {
        E element = null;
        if (elements.size() == 0){
            throw new EmptytadFilaException();
        } else {
            element = elements.get(0);
            return element;
        }
    }

    public List<E> getArrayList(){
        return this.elements;
    }
    @Override
    public Object clone()
            throws CloneNotSupportedException { 
        return super.clone();
    }
    
    @Override
     public boolean equals(Object obj) {
        return elements.equals(((tadFila<E>) obj).getArrayList());
    }

    public int get(int i) {
        return i;
    }
}