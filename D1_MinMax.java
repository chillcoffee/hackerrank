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

class Result {

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        long max=0, min = 0;
        long[] sum = new long[5];
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.size(); j++){
                if(j == i) continue;              
                sum[i] += arr.get(j);
            }
            
        }
        min = sum[0];
        for(int i =0; i<sum.length; i++){
            if(sum[i] < min)
                min = sum[i];
        }
        
        max = sum[0];
        for(int i =0; i<sum.length; i++){
            if(sum[i] > max)
                max = sum[i];
        }
        System.out.print(min+" "+max);
    }

}

public class D1_MinMax {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
