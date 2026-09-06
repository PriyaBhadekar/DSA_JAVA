package Collections.Queue;

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offer(1);
        deque.offer(2);
        deque.offerFirst(10);
        deque.offerFirst(5);
        deque.offerLast(45);
        System.out.println(deque);

        deque.poll();
        deque.pollFirst();
        deque.pollLast();
        System.out.println(deque);

        deque.offer(11);
        deque.offer(78);
        deque.offerFirst(105);
        deque.offerFirst(98);   
        
        System.out.println(deque.peek());
        System.out.println(deque.peekFirst());
        System.out.println(deque.peekLast());

    }
}
