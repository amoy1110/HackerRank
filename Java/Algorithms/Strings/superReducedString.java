import java.util.*;

public class Solution {

    static String super_reduced_string(String s){
        ArrayList<Character> arrayList = new ArrayList<>();

        // put each character of the string into an ArrayList
        for(int i = 0; i < s.length(); i++){
            arrayList.add(s.charAt(i));
        }

        // determine if adjacent characters are equal and remove them until we find no more adjacent characters.
        for(int i = 1; i < arrayList.size(); i++){
            // if the character before the current iteration equals the current iteration, remove both
            if(arrayList.get(i).equals(arrayList.get(i-1))){
                arrayList.remove(i);
                arrayList.remove(i-1);

                i = 0; //reset i because we just removed duplicates so start at the beginning again
            }
        }

        String reducedString = "";
        if(arrayList.size() == 0){
            reducedString = "Empty String";
        }
        else{
            for(Character i : arrayList)
            {
                reducedString += i;
            }
        }

        return reducedString;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
        System.out.println(result);
    }
}