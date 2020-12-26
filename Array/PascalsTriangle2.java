package Array;

import java.util.ArrayList;
import java.util.List;

/**
 * #119. Pascal's Triangle II
 */

public class PascalsTriangle2 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> lastrow = new ArrayList<>();
        List<Integer> row = new ArrayList<>();


        for(int i=0; i<=rowIndex; i++){
            row = new ArrayList<>();
            if(i==0){
                row.add(1);
            }
            else if(i==1){
                row.add(1);
                row.add(1);
            }
            else{
                row.add(1);
                for(int j=1; j<i; j++){
                    row.add(lastrow.get(j-1) + lastrow.get(j));
                }
                row.add(1);
            }
            lastrow = row;
        }
        return row;
    }


    public static void main(String[] args) {
        List<Integer> row = getRow(0);
        for(int i:row){
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
