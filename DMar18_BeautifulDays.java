package hackerrank;
import java.util.ArrayList;


public class DMar18_BeautifulDays {
    
    public static int beautifulDays(int startDay, int endDay, int divisor) {
    // Write your code here
        ArrayList<String> digits = new ArrayList<>();
        int count = 0, n;
        for(int i=startDay; i <= endDay; i++){
                digits.clear();
                n = i;
                while ( n > 0) {
                    digits.add(String.valueOf(n%10));
                    n /= 10;
                }   
                System.out.println(digits);
                String reverse = "";
                for(String d: digits){
                    reverse += d;
                }
                int reversed = Integer.parseInt(reverse);
                int difference = i - reversed;
                if(difference % divisor == 0)
                    count++;
        }
        return count;
    }
    
    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23, 6));
    }
    
}
