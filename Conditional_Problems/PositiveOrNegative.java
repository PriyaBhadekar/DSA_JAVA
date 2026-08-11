package Conditional_Problems;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {  
    
    Scanner in = new Scanner(System.in);

    System.out.print("Enter a Number: ");
    int i = in.nextInt();

    if(i > 0){
        System.out.println("The number is Positive");
    }else if(i < 0){
        System.out.println("The number is Negative");
    }else{
        System.out.println("The number is zero");
    }
}

}
