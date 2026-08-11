package Conditional_Problems;
import java.util.*;

public class EvenOdd {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();

        if(num % 2 == 0){
            System.out.println("The given number is Even");
        }else{
            System.out.println("The given number is Odd");
        }
    }
}
