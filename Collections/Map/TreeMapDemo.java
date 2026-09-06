package Collections.Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {
        
        Map<Integer, String> map = new TreeMap<>();

        map.put(1, "Shashwat");
        map.put(2, "Arnav");
        map.put(3, "Ashnir");
        map.put(4, "Rupa");

        for(Map.Entry<Integer, String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }


        //Print using keys
        for(Integer key: map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }

        for(String name : map.values()){
            System.out.println(name);
        }

        System.out.println(map.containsKey(6));
        System.out.println(map.containsKey(2));

        System.out.println(map.containsValue("Shashwat"));

        map.put(3, map.get(3) + " pandit");
        System.out.println(map);

        map.put(6, map.getOrDefault(6 , "Rahul") + " pandit");
        System.out.println(map);
    }
    
}
