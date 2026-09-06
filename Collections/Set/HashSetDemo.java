package Collections.Set;
import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {
        Set<Integer> set= new HashSet<>();

        set.add(23);
        set.add(67);
        set.add(18);
        set.add(34);
        set.add(23);
        System.out.println(set);

        set.remove(23);
        System.out.println(set);

        System.out.println(set.contains(18));
        System.out.println(set.contains(63));

        
    }
    
}
