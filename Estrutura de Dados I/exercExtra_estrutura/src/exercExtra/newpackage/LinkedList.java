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

public class LinkedList implements IList {

    public Element tail;
    public Element head;
    public int size;
    
    public LinkedList(){
        tail = null;
        head = null;
        size = 0;
    }
    
    @Override
    public boolean isEmpty() {
        return (size == 0);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void delete(int position) {
        
    }
    
    public void deleteFirst(Element element){
         head = head.next;
        
    }

    @Override
    public void insertFirst(Element element) {
        element.setNext(head);
        head = element;
        if (isEmpty()){
            tail = element;
        }
        size++;
    }

    @Override
    public void insertLast(Element element) {
        tail.setNext(element);
        tail = element;
        if (isEmpty()){
            head = element;
        }
        size++;
    }

    @Override
    public void insertAfter(int position, Element element) {
        Element cursor;
        cursor = head;
        int index = 0;
        while (cursor != tail && index < position) {
            cursor = cursor.getNext();
            index++;
        }
        if (cursor != tail) {
            element.setNext(cursor.getNext());
            cursor.setNext(element);
        }
        size++;
    }

    @Override
    

  
    public Element retrive(int position) {
        Element cursor = head;
        if (position >= size) {
            return null;
        } else {
            for (int i = 0;i < position;i++){
                cursor = cursor.getNext();
            }
        }
        return cursor;
    }

    @Override
    public void set(int position, Element element) {
        
    }
    
}

