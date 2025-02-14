
package hackerrank;

import java.io.IOException;
import java.util.*;
import static java.util.stream.Collectors.toList;
import java.util.stream.IntStream;
import java.util.stream.Stream;


public class D2_FlippingMatrix {
    
    public static void main(String[] args) throws IOException{
        Scanner scan = new Scanner(System.in);
        List<List<Integer>> matrix = new ArrayList<>();
        List<Integer> row;
        String[] row_values;
        int arr_size = Integer.parseInt(scan.nextLine().trim());
        int n = Integer.parseInt(scan.nextLine().trim());

        for(int i =0; i < arr_size; i++){
            row = new ArrayList<>();
            row_values = scan.nextLine().split(" ");
            for(String value: row_values){
                row.add(Integer.valueOf(value));
            }
            matrix.add(row);
        }
       
        int result = flippinMatrix(matrix, n);
        System.out.println(""+result);
        
    }

    private static int flippinMatrix(List<List<Integer>> matrix, int n) {
        int sum = 0;
        List<Integer> temp = new ArrayList<>();
        for(List<Integer> row: matrix){
            temp.add(row.get(n));
        }
        int put_index = temp.size()-1;
        for(List<Integer> row: matrix){
            row.set(n, temp.get(put_index--));
        }
        //printMatrix(matrix);
        List<Integer> row = new ArrayList<>();
        row = matrix.get(0);
        put_index = row.size()-1; 
        for(Integer value: row){
            temp.set(put_index, value);
            put_index--;
        }
        matrix.set(0, temp);
        //printMatrix(matrix);
        
        for(int j=0; j < n; j++){
            List<Integer> r = matrix.get(j);
            for(int i=0; i < n; i++){
                sum += r.get(i);
            }
            
        }
        printMatrix(matrix);
        
        return sum;

    }

    private static void printMatrix(List<List<Integer>> matrix) {
        System.out.println("Output: ");
        for(List<Integer> r: matrix){
            for(Integer v: r){
                System.out.print(v+" ");
            }
            System.out.println("");
        }
    }
    
   
    
}
