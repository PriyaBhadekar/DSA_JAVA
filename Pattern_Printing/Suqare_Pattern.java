package Pattern_Printing;


class Square_Pattern{

    public static void main(String[] args) {
        
        for(int i = 0; i < 4; i++){         // Outer Loop for Rows
            for(int j = 0; j < 5; j++){     // Inner Loop for Columns
                System.out.print(" * ");
            }
            System.out.println();           //To print stars on new line
        }
    }
}