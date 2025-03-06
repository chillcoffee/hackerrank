package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DMar6_SalesByMatch {
    
    public static int sockMerchant(int n, List<Integer> ar) {
    // Write your code here
        int pair = 0;
        int socks[] = new int[101];
        for(Integer a: ar){
            socks[a] = socks[a]+1;
        }
        for(int sock: socks){
            pair += sock / 2;
        }
        return pair;
    }
    
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        
        String inputString = "44 55 11 15 4 72 26 91 80 14 43 78 70 75 36 83 78 91 17 17 54 65 60 21 58 98 87 45 75 97 81 18 51 43 84 54 66 10 44 45 23 38 22 44 65 9 78 42 100 94 58 5 11 69 26 20 19 64 64 93 60 96 10 10 39 94 15 4 3 10 1 77 48 74 20 12 83 97 5 82 43 15 86 5 35 63 24 53 27 87 45 38 34 7 48 24 100 14 80 54"; 
        String inputArray[] = inputString.split(" ");
        for(String input: inputArray){
            inputList.add(Integer.valueOf(input));
        }
        System.out.println("\nResult:\n"+sockMerchant(inputList.size(), inputList));
    }
    
}
