public interface IStack<E> {
     public int size();
     public boolean isEmpty();
     public void push(E e) throws ArrayIndexOutOfBoundsException;
     public void pop() throws EmptyStackException;
     public E top() throws EmptyStackException;
}

