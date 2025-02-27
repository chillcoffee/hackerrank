
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
This is the problem for Oracle Graduate Program take 2a
*/
public class DFeb26_Duplicate {
    
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();
        ArrayList<Integer> price = new ArrayList<>();
        ArrayList<Integer> weight = new ArrayList<>();
        int weights[] = {1,2,1,1,3};
        String names[] = {"ball","box","ball","ball","box"};
        for(int i = 0; i<5; i++){
            price.add(2);
            weight.add(weights[i]);
        }
        name.addAll(Arrays.asList(names));        
        System.out.println(name);
        System.out.println(price);
        System.out.println(weight);
        
        int result = countDuplicate(name, price, weight);
        System.out.println("Test Result: "+result);
    }

    private static int countDuplicate(List<String> name, List<Integer> price, List<Integer> weight) {
        int duplicate = 0;
        ArrayList<String> duplicates = new ArrayList<>();
        String curName;
        int curPrice, curWeight;
        
        int i=0;
            curName = name.get(i);
            curPrice = price.get(i);
            curWeight = weight.get(i);
            
            for(int ni = 1; ni < name.size(); ni++){
                if(curName.equalsIgnoreCase(name.get(ni))
                        && curPrice == price.get(ni)
                        && curWeight == weight.get(ni)){
                    duplicates.add(name.get(ni));
                }
            }
        System.out.println(duplicates);
        
        duplicate = duplicates.size();
        
        return duplicate;
    }

    
    
}
