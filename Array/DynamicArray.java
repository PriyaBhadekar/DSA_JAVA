package Array;

import java.util.ArrayList;

public class DynamicArray {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> arrayList = new ArrayList<>();

        //Inserting elements
        arrayList.add(5);
        arrayList.add(10);
        
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("after insert element at " + i + " index is " + arrayList.get(i));
        }

        System.out.println();

        //update
        arrayList.set(1, 20);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("after update element at " + i + " index is " + arrayList.get(i));
        }


        System.out.println();

        //delete
        arrayList.remove(0);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("after deletion element at " + i + " index is " + arrayList.get(i));
        }

        System.out.println();

        //insert with shift
        arrayList.add(0, 100);
        for(int i = 0; i < arrayList.size(); i++){
            System.out.println("after shift insert  element at " + i + " index is " + arrayList.get(i));
        }
    }
}
