import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] solve(int[] grades){
        for(int i = 0; i < grades.length; i++){
            if(grades[i] <= 37) continue; // if the grade is less than or equal to 37, don't round it as it is a failing grade.

            // since we know that we can only round up if the grade is 2 or 1 less than the rounded grade, we can
            // get the mod of the grade and add appropriately to it.
            if(grades[i] % 5 == 3){
                grades[i] += 2;
            }
            else if(grades[i] % 5 == 4){
                grades[i] += 1;
            }
        }
        return  grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


    }
}
