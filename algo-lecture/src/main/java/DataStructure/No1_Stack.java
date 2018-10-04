package DataStructure;

import java.util.NoSuchElementException;

public class No1_Stack {
    private static class StackNode {
        private T data;
        private StackNode next;
        
        public StackNode(T data) {
            this.data = data;
        }
    }
    
    private StackNode top;
    
    public T pop() {
        if (top == null) throw new NoSuchElementException();
        T item = top.data;
        top = top.next;
        
        return item;
    }
    
    public void push(T item) {
        StackNode t = new StackNode(item);
        t.next = top;
        top = t;
    }
    
    public T peek() {
        if (top == null) throw new NoSuchElementException();
        return top.data;
    }
    
    public boolean isEmpty() {
        return top == null;
    }
}
