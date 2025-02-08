import java.io.*;
import java.util.*;

import java.util.stream.*;

import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {
        int lonelyNum = 0, currentHold = 0, compareTo = 0;
        int[] count =new int[a.size()];
        
        for(int i=0; i < a.size(); i++){
            currentHold = a.get(i);
            count[i] = 1;
            for(int j=0; j < a.size(); j++){
                if(i != j)
                {
                    compareTo = a.get(j);
                    if(currentHold == compareTo)
                        count[i] += 1;
                }
            }
        }
        for(int i=0; i < count.length; i++){
            if(count[i] == 1){
                lonelyNum = a.get(i);
                break;
            }
        }
        
        return lonelyNum;
    }

}

public class D2_LonelyInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.lonelyinteger(a);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
