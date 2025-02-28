
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
This is the problem for Oracle Graduate Program take 2a
*/
public class DFeb28_WhiteLight {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        
        input.add(new ArrayList<>(Arrays.asList(1,1,5)));
        input.add(new ArrayList<>(Arrays.asList(2,2,5)));
        input.add(new ArrayList<>(Arrays.asList(3,2,5)));
        input.add(new ArrayList<>(Arrays.asList(4,2,5)));
        
        System.out.println(input);
        int rows = input.size();
        System.out.println("rows = "+rows);
        int cols = input.get(0).get(input.get(0).size() -1);
        System.out.println("cols = "+cols);
        int result = countwhite(cols, rows, input);
        System.out.println("Test Result: "+result);
    }

    private static int countwhite(int cols, int rows, ArrayList<ArrayList<Integer>> input) {
        int whiteCount = 0, color, left, right;
        
        
        int[][] stage = new int[rows][cols];
        
        printArray(stage, rows, cols);
        
        for(ArrayList<Integer> row: input){
            color = row.get(0)-1; //1 = 0
            left = row.get(1)-1;  //1 = 0
            right = row.get(2)-1; //5 = 4
            for(int i=0; i < cols; i ++){
                if( i >= left && i <= right)
                    stage[color][i] = 1;
            }
        }
        
        printStage(stage, rows, cols);
        boolean isNotZero;
        ArrayList<Integer> whiteList = new ArrayList<>();

        for(int col=0; col < cols; col++){
            isNotZero = true;
            for(int light=1; light < rows; light++){
                System.out.print("stage["+light+"]["+col+"] = " +stage[light][col]+" ");
                if(stage[light][col] == 0){                
                    isNotZero = false;
                    break;
                }
            }
            if(isNotZero == true)
                whiteList.add(col);      
            System.out.println("");
        }
        System.out.println("\nwhiteList: "+whiteList);
        whiteCount = whiteList.size();
        
        return whiteCount;
    }
    
    public static void printStage(int[][] stage, int m, int n){
        System.out.println("===================================");
        for(int r=0; r < m; r++){
             for(int c=0; c < n; c++){
                 System.out.print("stage["+r+"]["+c+"] = "+stage[r][c]+ " ");
             }
             System.out.println("");
        }
        System.out.println("===================================");
           
    }
    
    public static void printArray(int[][] stage, int m, int n){
        System.out.println("===================================");
        for(int r=0; r < m; r++){
             for(int c=0; c < n; c++){
                 System.out.print(stage[r][c]+ " ");
             }
             System.out.println("");
        }
        System.out.println("===================================");
           
    }

    
    
}
