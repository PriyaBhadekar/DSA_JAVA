package Pattern_Printing;

public class Character_Triangle {
    
    public static void main(String[] args) {
        
         for(int i = 0; i < 4; i++){
            for(int j = 0; j <= i; j++){

                System.out.print((char)(65+j));
            }
            System.out.println();
         }
    }
}
