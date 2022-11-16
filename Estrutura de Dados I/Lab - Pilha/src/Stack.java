
import java.util.ArrayList;
import java.util.List;

public class Stack<E> implements IStack<E>,Cloneable {

    private int top;	// topo da pilha (índice do último elemento inserido)
    private int capacity;
    private int size;
    private List<E> arrayList;

    public Stack(int capacity) {
        // Cria uma pilha com uma certa capacidade inicial (capacity)
        this.capacity = capacity;
        top = -1;
        size = 0;
        arrayList = new ArrayList<E>(capacity);
    }

    public int size() {
        // Devolve o número de elementos da pilha
        return size;
    }

    public boolean isEmpty() {
        // Verifica se a pilha está vazia
        return size == 0;
    }

    public void push(E e) throws ArrayIndexOutOfBoundsException {
        // Empilha, caso a pilha não esteja cheia, o element E
        if (size == capacity){
            throw new ArrayIndexOutOfBoundsException();
        }else{
            arrayList.add(e);
            top ++;
            size++;
    }
    }
    public void pop() throws EmptyStackException {
        // Desempilha, caso a pilha não esteja vazia, o elemento do topo
        if (size == 0){
            throw new EmptyStackException();
        }else{
            arrayList.remove(top);
            size --;
        }
    }

    public E top() throws EmptyStackException {
        // Devolve, sem desempilhar, o elemento do topo caso a pilha não esteja vazia
        if (isEmpty()){
            throw new EmptyStackException();
        }else{
            return arrayList.get(top);
        }
    }

    protected Object clone()
            throws CloneNotSupportedException {
        // Devolve ref da cópia do objeto    
        return super.clone();
    }
    
    public List<E> getArrayList(){
        return arrayList;
    }

    public boolean equals(Object obj) {
        // Overriding do método equals, para testar se dois Stacks são iguais
        return arrayList.equals(((Stack<E>) obj).getArrayList());
    }
}
