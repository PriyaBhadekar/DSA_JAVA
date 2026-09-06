package Collections.List;

import java.util.*;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        
        list.add(4);
        list.add(7);
        list.add(2);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        list.addFirst(1);
        list.addLast(9);
        System.out.println(list);

        System.out.println(list.get(3));


    }
    
}
