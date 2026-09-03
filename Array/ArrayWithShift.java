package Array;

public class ArrayWithShift {
    
    public static void main(String[] args) {
        
        ArrayWithShift obj = new ArrayWithShift();

        int arr[] = new int[4];
        arr[0] = 1;
        arr[2] = 6;
        arr[3] = 3;
        arr[1] = 9;

        //Printing the array
        for(int i = 0; i < arr.length; i++){
            System.out.println("Element at index "+i+" is "+arr[i]);
        }

        System.out.println();

        //insert an element
        obj.insertWithShift(arr, 8, 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println("After shift insert the Element at index "+i+" is "+arr[i]);
        }

        System.out.println();

        //delete an element
        obj.deleteWithShift(arr, 8, 1);
        for(int i = 0; i < arr.length; i++){
            System.out.println("After shift delete the Element at index "+i+" is "+arr[i]);
        }
    }

    //Insert with shift
    public void insertWithShift(int[] arr, int element, int index){

        if(index < 0 || index > arr.length){
            System.out.println("Index out of bound");
            return;
        }
        for(int i = arr.length - 2; i >= index; i--){
            arr[i + 1] = arr[i];
        }
        arr[index] = element;
    }


    //Delete with Shift by soft deleting 
    public void deleteWithShift(int[] arr, int element, int index){

        if(index < 0 || index > arr.length){
            System.out.println("Index out of bound");
            return;
        }
        for(int i = index + 1; i < arr.length; i++){
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0; //soft delete to avoide duplicate
    }
}
