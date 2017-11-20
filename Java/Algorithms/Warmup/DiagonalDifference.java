import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        int primary = 0;
        for(int i = 0; i < n; i++){
            primary += a[i][i];
        }

        int secondary = 0;
        for(int i = 0; i < n; i++){
            secondary += a[i][(n-1)-i];
        }

        int sum = Math.abs(primary - secondary);

        System.out.println(sum);
    }
}
