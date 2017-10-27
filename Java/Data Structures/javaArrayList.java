import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // how many rows with ints

        ArrayList<ArrayList<Integer>> rows = new ArrayList<>(); // an arraylist containing arraylists of type Integer

        // store each row inside an arraylist, which is then added to the rows arraylist
        for(int i = 0; i < n; i++){
            int numOfElements = in.nextInt(); // get the # of elements in the row
            ArrayList<Integer> row = new ArrayList<>(); // create a new row, an arraylist

            for(int j = 0; j < numOfElements; j++){
                row.add(in.nextInt()); // store elements in the arraylist row
            }
            rows.add(row); // then add the row arraylist to the arraylist of arraylist<Integer>'s rows
        }

        // retrieve the elements inside the 2nd arraylist
        int numOfQueries = in.nextInt(); // how many queries we are going to run
        for(int i = 0; i < numOfQueries; i++){
            int x = in.nextInt(); // x position
            int y = in.nextInt(); // y position

            ArrayList<Integer> rowX = rows.get(x - 1); // get the row for x query
            if(y <= rowX.size())
                System.out.println(rowX.get(y - 1)); // print the number at y
            else
                System.out.println("ERROR!"); // y is out of bounds for the arraylist
        }
    }
}
