import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int birthdayCakeCandles(int n, int[] ar) {
        int counter = 0;

        Arrays.sort(ar);

        int tallest = ar[n-1]; // the last element is always the tallest candle after sorting an int array
        counter++;

        // i needs to be n-2 to start at the 2nd to last array element
        for(int i = n-2; i >= 0; i--){
            if(ar[i] == tallest) counter++; // if the element equals the tallest then count it
        }

        return counter;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
