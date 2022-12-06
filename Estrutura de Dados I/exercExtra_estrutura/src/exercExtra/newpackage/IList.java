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

public interface IList {
    public boolean isEmpty();
    public int size();
    public void delete(int position);
    public void insertFirst(Element element);
    public void insertLast(Element element);
    public void insertAfter(int position,Element element);
    public Element retrive(int position);
    public void set(int position,Element element);
}