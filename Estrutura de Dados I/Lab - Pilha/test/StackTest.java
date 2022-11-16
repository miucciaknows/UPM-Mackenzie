
import org.junit.Test;
import org.junit.Assert;

public class StackTest {

    @Test
    public void emptyTest() {
        // Testa axioma size(empty)=0
        Stack<Integer> stack = new Stack<Integer>(10);
        Assert.assertEquals(stack.size(), 0); // Compara se size de stack é zero.    
    }

    @Test
    public void isEmpty() {
        //Testa axioma isEmpty(empty)=true
        Stack<Integer> stack = new Stack<Integer>(10);
        Assert.assertTrue(stack.isEmpty());
    }

    @Test
    public void isEmpty2() {
        //Testa axioma isEmpty(push(S,E))=false
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(123);
        Assert.assertFalse(stack.isEmpty());
    }

    @Test
    public void sizeTest() {
        //Testa axioma size(push(S,E))=size(S)+1
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(123);
        int size = stack.size();
        stack.push(456);
        Assert.assertEquals(stack.size(), size + 1);
    }

    @Test
    public void popTest() throws EmptyStackException {
        //Testa axioma size(pop(S))=size(S)-1
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(123);
        stack.push(456);
        int size = stack.size();
        stack.pop();
        Assert.assertEquals(stack.size(), size - 1);
    }

    @Test
    public void topTest() throws EmptyStackException {
        //Testa axioma top(push(S,E))=E
        Stack<Integer> stack = new Stack<Integer>(10);
        Integer e = new Integer(123);
        stack.push(e);
        Assert.assertEquals(stack.top(), e);
    }

    @Test
    public void popTest2() throws CloneNotSupportedException, EmptyStackException {
        //Testa axioma pop(push(S,E))=S
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.push(12);
        Stack s = (Stack<Integer>) stack.clone();
        stack.push(34);
        stack.pop();
        Assert.assertEquals(stack, s);
    }

    @Test(expected = EmptyStackException.class)
    public void popEmptyTest() throws EmptyStackException {
        //Testa axioma pop(empty)=ERROR
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.pop();
    }

    @Test(expected = EmptyStackException.class)
    public void TopEmptyTest() throws EmptyStackException {
        //Testa axioma Top(empty)=ERROR
        Stack<Integer> stack = new Stack<Integer>(10);
        stack.top();
    }

}
