import java.util.*;
import java.io.*;

class DMar24_JavaLoops2{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            for(int s=0; s<n; s++){
                printS(a,b,s);
                
            }
            System.out.println();
             
        }
        in.close();
    }
    public static void printS(int a, int b, int s){
        int totalB = 0;
        for(int exponent = 0; exponent <= s; exponent++){
            //printing per s
            totalB += (int)Math.pow(2, exponent) * b;
            
        }
        int totalS = a + totalB;
        System.out.print(totalS+" ");
    }
}
