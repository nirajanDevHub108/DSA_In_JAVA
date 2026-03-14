package ArrayArrayList;

import java.util.ArrayList;
import java.util.List;

public class pascaltraingleII {

    public List<Integer> getRow(int rowIndex){
        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 0; i < rowIndex; i++) {

            List<Integer> newRow = new ArrayList<>();
            newRow.add(1);

            for (int j = 1; j < row.size(); j++) {
                newRow.add(row.get(j-1) + row.get(j));
            }

            newRow.add(1);
            row = newRow;
        }

        return row;
    }

    public static void main(String[] args) {

        pascaltraingleII sol = new pascaltraingleII();

        int rowIndex = 4;

        List<Integer> result = sol.getRow(rowIndex);

        System.out.println("Pascal Row " + rowIndex + ": " + result);
    }
}