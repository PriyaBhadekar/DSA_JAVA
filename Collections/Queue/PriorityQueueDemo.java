package Collections.Queue;

import java.util.*;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        
        //By default it is min priority queue
        Queue<Integer> queue = new PriorityQueue<>();
        queue.offer(34);
        queue.offer(5);
        queue.offer(78);

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);

        //max based priority queue
        Queue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());
        maxpq.offer(67);
        maxpq.offer(23);
        maxpq.offer(98);

        System.out.println(maxpq.peek());

    }
    
}
