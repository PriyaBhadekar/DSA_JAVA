package Collections.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new LinkedHashSet<>();

        set.add(23);
        set.add(67);
        set.add(18);
        set.add(34);
        set.add(23);
        System.out.println(set);

        // set.remove(23);
        // System.out.println(set);

        System.out.println(set.contains(18));
        System.out.println(set.contains(63));

        
    }
    
}
