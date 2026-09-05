package Collections;
import java.util.*;


public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(4);
        stack.push(6);
        stack.push(9);
        stack.push(2);
        System.out.println(stack);

        stack.pop();
        System.out.println(stack);

    }
    
}
