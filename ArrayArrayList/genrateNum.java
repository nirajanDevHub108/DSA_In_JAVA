package ArrayArrayList;

import java.util.ArrayList;
import java.util.List;

public class genrateNum {
    
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> traingle = new ArrayList<>();

        for(int i =0; i < numRows;i++) {
            List<Integer> rows = new ArrayList<>();
            for(int j =0 ; j<= i ; j++){
                if(j == 0 || j == i){
                    rows.add(1);
                }
                else {
                    int val = traingle.get(i -1).get(j-1)+
                              traingle.get(i-1).get(j);
                    rows.add(val);
                }
            }
            traingle.add(rows);
        } 
        return traingle; 
    }
    public static void main(String[] args) {
        genrateNum sol = new genrateNum();
        int numRows = 5;
        List<List<Integer>> result = sol.generate(numRows);

        System.out.println(result);
    }
    
}
