
package hackerrank;

import java.util.*;


public class DApr5_ServiceLane {
    public static void main(String[] args) {
        int n = 8, t = 5;
        int width[] = {2, 3, 1, 2, 3, 2, 3, 3};
        int cases[][] = {{0, 3}, {4, 6}, {6, 7}, {3, 5}, {0, 7}};
        List<Integer> smallest_width = new ArrayList<>();
        for(int row[]: cases){
            int start = row[0];
            int end = row[1];
            
            //System.out.println(start +" "+end);
            int min = width[start];
            for(int i=start; i<=end; i++){
                if(width[i]< min)
                    min = width[i];
            }
            smallest_width.add(min);
        }
        for(int s_width: smallest_width){
            System.out.println(s_width);
        }
            
    }
}
