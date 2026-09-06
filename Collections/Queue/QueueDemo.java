package Collections.Queue;
import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(46);
        queue.offer(56);
        queue.offer(12);
        System.out.println(queue);

        queue.poll();
        System.out.println(queue);

        
        System.out.println(queue.peek());

    }
    
}
