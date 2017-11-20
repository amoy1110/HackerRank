import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
        int hour;

        // Determine if it is AM or PM
        if(s.contains("PM")){
            hour = Integer.parseInt(s.substring(0,2));
            // we can change it to military time by adding 12 hours to it if it is not noon.
            if(hour != 12)
                hour += 12;
            s = hour + s.substring(2,8);
        }
        else if(s.contains("AM"))
        {
            hour = Integer.parseInt(s.substring(0,2));
            // if time is 12AM then subtract 12 so we go back to 00
            if(hour == 12){
                hour -= 12;
            }
            s = String.format("%02d%s", hour, s.substring(2,8));
        }

        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}
