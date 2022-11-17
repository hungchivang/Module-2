package bai11.thuchanh1;

import java.util.LinkedList;

public class MyGenericStack<T> {
    private final LinkedList<T> stack = new LinkedList<>();

    public MyGenericStack() {

    }

    public void push(T element) {
        stack.addLast(element);
    }

    public T pop() {
        if (stack.size() == 0) System.out.println("EmptyStackException();");
        return stack.pop();
    }

    public int size() {
        if (stack.size() == 0) System.out.println("EmptyStackException();");
        return stack.size();
    }

    public boolean isEmpty() {
        if (stack.size() == 0) return true;
        return false;
    }

    @Override
    public String toString() {
        return "MyGenericStack{" +
                "stack=" + stack +
                '}';
    }
}
