package Array;

public class ArrayBasics {
    public static void main(String[] args) {
        
        int arr[] = new int[5];

        //Default value is zero
        System.out.println("Before: Value at 0 th index : " + arr[0]);

        //Insert
        arr[0] = 1;
        System.out.println("After Inserting: Value at 0 th index : " + arr[0]);

        //Update
        arr[0] = 10;
        System.out.println("After Update: Value at 0 th index : " + arr[0]);

        //Soft Delete - placing the default value back at the value to be deleted
        arr[0] = 0;

        //insert
        arr[0] = 1;
        arr[2] = 6;
        arr[4] = 3;

        //Traverse
        int len = arr.length; //get the length of array
        System.out.println("Length of array is: " +len);

        for(int i = 0; i < len; i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }



    }
}
