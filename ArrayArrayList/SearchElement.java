
package ArrayArrayList;
import java.util.Arrays;

public class SearchElement {
    
    // Your Linear Search method
    public int search(int arr[], int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i; // Return the index if found
            }
        }
        return -1; // Return -1 if not found
    }

    public static void main(String[] args) {
        // 1. Create instance
        SearchElement obj = new SearchElement();

        // 2. Setup test data
        int[] numbers = {10, 25, 45, 30, 90};
        int target = 30;

        // 3. Call method
        int result = obj.search(numbers, target);

        // 4. Print results
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("Searching for: " + target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
