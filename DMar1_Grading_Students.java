
package hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DMar1_Grading_Students {
    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> rounded = new ArrayList<>();
        int rem = 0;
        for(Integer grade: grades){
            rem = grade % 10;
            if(grade < 38){
                rounded.add(grade);
            }else if(grade >= 38){
                if(rem==3 ||rem == 8){
                    grade = grade + 2;
                }else if(rem==4 ||rem==9){
                    grade = grade + 1;
                }
                rounded.add(grade);
            }
            
                
        }
        return rounded;
    }
    
    public static void main(String[] args) {
        List<Integer> grades = new ArrayList<>(Arrays.asList(73,67,38,33));
        System.out.print("\nActual Grades: "+grades+"\nRounded Grades: ");
        List<Integer> output = gradingStudents(grades);
        for(Integer gr: output){
            System.out.print(gr+" ");
        }
    }
    
}


