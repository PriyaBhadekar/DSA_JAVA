package Collections;

import java.util.*;


class Student{

    int rollno;
    String name;

    Student(int rollno , String name){
        this.rollno = rollno;
        this.name = name;
    }

    @Override
    public String toString(){
        return "["+ this.name +" , " + this.rollno + "]";
    }
    
    @Override
    public boolean equals(Object obj){
        if(obj instanceof Student s){
            return this.rollno == s.rollno && this.name.equals(s.name);
        }
        return false;
    }
}

public class ArrayListDemo {
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>(); //ArrayList Declaration
        
        //Autoboxing -> Integer.valueOf(7) 
        list.add(7);
        list.add(4);
        System.out.println(list); //Prints orderd list

        list.add(1, 6); //adds 6 at 1st index and shifts element 4
        System.out.println(list);

        list.set(1, 9); //updates the element at specified index
        System.out.println(list);

        list.addFirst(10); //Adds the element at the 0th index i.e first
        System.out.println(list);

        list.addLast(1); //adds the element at the last index (add and addLast both work same)
        System.out.println(list);

        Collections.sort(list); //Sort the list 
        System.out.println(list);

        

        list.remove(2);  //removes element based on index
        System.out.println(list);

        list.remove(Integer.valueOf(1)); //removes the value itself with requiring the index
        System.out.println(list);

        System.out.println(list.size());




        //Creating List of type Student
        List<Student> list2 = new ArrayList<>();
        list2.add(new Student(1, "Priya"));
        list2.add(new Student(2, "Anjali"));
        System.out.println(list2);


        //List Iterator to iterate the list
        ListIterator<Student> listIterator = list2.listIterator();

        //forward move
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        //Backward Move
         while(listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

        list2.remove(new Student(2, "Anjali")); //removing the element using the override equal method
        System.out.println(list2);


    }
    
}
