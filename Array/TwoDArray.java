package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int matrix[][] = new int[3][2];
        int rows = matrix.length;
        int cols = matrix[0].length;

        //Insert operation
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                matrix[r][c] = 10;
            }
        }

        //after insertion of element
        System.out.println("After insertion of element");
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }


        //update the specific value
        matrix[1][1] = 30;

        System.out.println("After Updation of element.");
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }


        //Soft delete
        matrix[1][1] = 0;
        System.out.println("After Delete of element.");
        for(int r = 0; r < rows; r++){
            for(int c = 0; c < cols; c++){
                System.out.print(matrix[r][c] + " ");
            }
            System.out.println();
        }

        System.out.println("Printing a row from 2D array");
        int subarray[] = matrix[1];
        for(int i = 0; i < subarray.length; i++){
            System.out.print(subarray[i] + " ");
        }
    }
}
