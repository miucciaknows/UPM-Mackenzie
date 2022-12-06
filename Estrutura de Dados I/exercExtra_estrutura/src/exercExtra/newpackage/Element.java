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

public class Element {
    public int value;
    public Element next;
    
    public Element(){
        next = null;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public Element getNext() {
        return next;
    }
}
