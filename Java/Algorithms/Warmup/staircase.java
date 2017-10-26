import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        // for each row starting with 1
        for(int i = 1; i <= n; i++){
            // print out spaces for as many N minus i because i is rows and number of how many # to print
            for(int j = 0; j < n - i; j++){
                System.out.print(" ");
            }
            // after spaces are printed, print out N minus (how many spaces were printed) to get number available space to print to.
            for(int k = 0; k < n-(n-i); k++){
                System.out.print("#");
            }
            System.out.print("\n");
        }
    }
}