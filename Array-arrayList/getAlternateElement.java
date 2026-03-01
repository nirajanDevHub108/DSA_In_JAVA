import java.util.ArrayList;

// Class name MUST match the filename: getAlternateElement.java
public class getAlternateElement {
    
    public ArrayList<Integer> getAlternates(int arr[]) {
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i < arr.length; i += 2) {
            al.add(arr[i]);
        }
        return al;
    }

    public static void main(String[] args) {
        getAlternateElement sol = new getAlternateElement();
        
        int[] input = {1, 2, 3, 4, 5, 6};
        ArrayList<Integer> result = sol.getAlternates(input);
        
        System.out.println("Input: [1, 2, 3, 4, 5, 6]");
        System.out.println("Output: " + result);
    }
}
