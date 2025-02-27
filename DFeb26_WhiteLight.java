
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
This is the problem for Oracle Graduate Program take 2a
*/
public class DFeb26_WhiteLight {
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> input = new ArrayList<>();
        
        input.add(new ArrayList<>(Arrays.asList(1,1,5)));
        input.add(new ArrayList<>(Arrays.asList(2,2,5)));
        input.add(new ArrayList<>(Arrays.asList(3,3,5)));
        
        System.out.println(input);
      
        int result = countwhite(5, 3, input);
        System.out.println("Test Result: "+result);
    }

    private static int countwhite(int n, int m, ArrayList<ArrayList<Integer>> input) {
        int whiteCount = 0, color, left, right;
        m +=1; 
        
        int[][] stage = new int[m][n];
        
        printStage(stage, m, n);
        
        for(ArrayList<Integer> row: input){
            color = row.get(0);
            left = row.get(1)-1;
            right = row.get(2);
            for(int i=0; i <= m; i ++){
                if( i >= left && i <= right)
                    stage[color][i] = color;
            }
        }
        
        printStage(stage, m, n);
        boolean isNotZero;
        ArrayList<Integer> whiteList = new ArrayList<>();
        System.out.println("m = "+m);
        System.out.println("n = "+n);
        for(int col=0; col < n; col++){
            isNotZero = true;
            for(int light=1; light < m; light++){
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

    
    
}
