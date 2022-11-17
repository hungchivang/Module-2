import java.util.Stack;

public class DaoNguocMang {
    public static void main(String[] args) {

        // dao nguoc mang int
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(-1);
        stack.push(2);
        stack.push(10);
        stack.push(7);

        System.out.println(stack);

        for (int i = stack.size() - 1; i >= 0; i--) {
            System.out.println(stack.get(i));
        }

    }






}
