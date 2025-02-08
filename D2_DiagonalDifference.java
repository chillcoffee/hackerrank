
package hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class D2_DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
    // Write your code here
    // 00 11 22 left to right
    // 02 11 20 right to left
    //    3
    //11 2 4
    //4 5 6
    //10 8 -12
        int difference = 0;
        int LtoR_sum = 0, RtoL_sum = 0;
        int[][] a = new int[arr.size()][arr.size()];
        List<Integer> inner;
        for(int i=0; i<arr.size(); i++){
            inner = arr.get(i);
            for(int j=0; j < inner.size(); j++){
                if( i == j ) LtoR_sum += inner.get(j);
                a[i][j] = inner.get(j);
            }           
        }
        int c = arr.size()-1;
        for(int r=0; r<arr.size(); r++){
            
            RtoL_sum += a[r][c];
            c--;
        }
        difference = Math.abs(LtoR_sum - RtoL_sum);
        return difference;
    }
    public static void main(String[] args) throws IOException {
        
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = diagonalDifference(arr);

        
        System.out.println("Difference: "+ result);
    }
    
}
