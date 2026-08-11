package Conditional_Problems;

import java.util.Scanner;

public class DivisibleByFive {
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = in.nextInt();

        if(num % 5 == 0){
            System.out.println("The given number is divisible by 5");
        }else{
            System.out.println("The given number is not divisible by 5");
        }
    }
}
