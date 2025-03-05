package hackerrank;

import java.util.ArrayList;
import java.util.List;

public class DMar5_BreakingTheRecords {
    
    public static List<Integer> breakingRecords(List<Integer> scores) {
    // Write your code here
        List<Integer> bestWorst = new ArrayList<>() ;
        
        int high, low;
        low = high = scores.get(0);
        bestWorst.add(0);
        bestWorst.add(0);
        
        for(Integer score: scores){
            if(score < low){
                bestWorst.set(1, bestWorst.get(1)+1);
                low = score;
            }  
            if(score > high){
                bestWorst.set(0, bestWorst.get(0)+1);
                high = score;
            }
        }
    
        return bestWorst;
    }
    
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        
        String scoresString = "10 5 20 20 4 5 2 25 1"; 
        String scoresArray[] = scoresString.split(" ");
        for(String score: scoresArray){
            scores.add(Integer.valueOf(score));
        }
        System.out.println(scores);
        scores = breakingRecords(scores);
        System.out.println("\nResult:\n"+scores);
    }
}
