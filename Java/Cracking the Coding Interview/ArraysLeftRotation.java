import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        ArrayList<Integer> al = new ArrayList<Integer>();

        // store the array in an ArrayList
        for(int i = 0; i < n; i++){
            al.add(a[i]);
        }

        // left rotation is just moving the first element to the last
        // can easily do this by removing and adding back to the ArrayList as every element shifts up when removing
        for(int j = 0; j < k; j++){
            int temp = al.get(0);
            al.remove(0);
            al.add(temp);
        }

        // now just set the given array to the new ArrayList we generated
        for(int i = 0; i < n; i++){
            a[i] = al.get(i);
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = new int[n];
        output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
