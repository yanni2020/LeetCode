package Array;
import java.util.ArrayList;
/**
 * #118. Pascal's Triangle
 */
import java.util.List;


public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal = new ArrayList<>();
        List<Integer> row;
        
        for(int i=0; i<numRows; i++){
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
                    row.add(pascal.get(i-1).get(j-1) + pascal.get(i-1).get(j));
                }
                row.add(1);
            }
            pascal.add(row);
        }
        return pascal;
    }


    public static void main(String[] args) {
        List<List<Integer>> pascal = generate(10);
        for(List<Integer> pal : pascal) {
            for(int i : pal){
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}