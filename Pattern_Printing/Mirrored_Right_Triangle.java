package Pattern_Printing;

public class Mirrored_Right_Triangle {

    public static void main(String[] args) {

        for(int i = 1; i < 5; i++){

            for(int j = 1; j <= (4 - i); j++){
                System.out.print(" ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
