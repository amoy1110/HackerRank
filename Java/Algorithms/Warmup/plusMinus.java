import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        double positiveCount, negativeCount, zeroCount;
        positiveCount = negativeCount = zeroCount = 0;

        for(int i = 0; i < n; i ++){
            if(arr[i] > 0) positiveCount++;
            if(arr[i] < 0) negativeCount++;
            if(arr[i] == 0) zeroCount++;
        }

        System.out.println(positiveCount / n);
        System.out.println(negativeCount / n);
        System.out.println(zeroCount / n);
    }
}
