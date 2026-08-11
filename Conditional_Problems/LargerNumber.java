package Conditional_Problems;

import java.util.Scanner;

public class LargerNumber {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First number:");
        int num1 = in.nextInt();
        System.out.print("Enter Second number:");
        int num2 = in.nextInt();

        if(num1 > num2){
            System.out.println("First number is greater");
        }else{
            System.out.println("Second number is greater");
        }
    }
}
