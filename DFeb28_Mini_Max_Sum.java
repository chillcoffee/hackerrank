class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        int min = 0, max = 0, sum = 0;
        for(int cur = 0; cur < arr.size(); cur++){
            sum = 0;
            for(int i=0; i< arr.size(); i++){
                if(i==cur)
                    continue;
                sum += arr.get(i);
                
            }
            if(cur == 0) min = max = sum;
            else{
                if(sum < min)   min = sum;
                if(sum > max)   max = sum;
            }
            
        }
        System.out.println(min+" "+max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
