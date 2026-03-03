//package Array-arrayList;

import java.util.Arrays;

public class reverseArray {

    public void reverseArr(int[] arr){
        int n = arr.length;
        for(int i=0; i< n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-1-i];
            arr[n-1-i]=temp;
        }
        System.out.println("" + Arrays.toString(arr));

    }
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        reverseArray  obj= new reverseArray();

        obj.reverseArr(arr);
        
        
    }
    
}
