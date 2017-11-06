import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int sum = Integer.MIN_VALUE; // need to use min value incase all numbers are negative and sum equals a negative number
        int largestSum = Integer.MIN_VALUE;
        
        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){                
                sum = arr[i][j] //  top left
                    +arr[i][j+1] // top middle
                    +arr[i][j+2] // top right
                    +arr[i+1][j+1] // middle middle
                    +arr[i+2][j] // bottom left
                    +arr[i+2][j+1] // bottom middle
                    +arr[i+2][j+2]; // bottom right
                
                if(sum > largestSum) largestSum = sum;  
                sum = 0;              
            }
        }
        
        System.out.println(largestSum);
    }
}
