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

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String[] times = s.split(":");

        int hour = Integer.parseInt(times[0]);
        if(times[2].toUpperCase().contains("PM")){
            if(hour!=12){
                hour += 12;
            }
        }else if (times[2].toUpperCase().contains("AM")){
            if(hour == 12){
                hour = 0;
            }
        }
        String militaryTime = "";
        if(hour < 10){
            militaryTime += "0"+hour;
        }else{
            militaryTime += hour;
        }
        militaryTime +=":";
        int min = Integer.parseInt(times[1]);
        if (min < 10)
            militaryTime += "0"+min;
        else
            militaryTime += min;
        int sec = Integer.parseInt(times[2].replace("AM", "").replace("PM", ""));
        militaryTime +=":";
        if (sec < 10)
            militaryTime += "0"+sec;
        else
            militaryTime += sec;
        
        return militaryTime;
    }

}

public class D1_TimeConversion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter time in 12 hour format.");
        String s = scan.nextLine();

        String result = Result.timeConversion(s);

        System.out.println(result);
        
    }
}

