package string;
import java.util.*;

public class nonrepeating {
    public static char nonrepeat(String s){
        HashMap<Character, Integer> frequencyMap = new HashMap<>();
        
        // Step 1: Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        // Step 2: Find the first character with frequency 1
        for (char c : s.toCharArray()) {
            if (frequencyMap.get(c) == 1) {
                return c;
            }
        }
        
        // Step 3: If no non-repeating character is found, return '$'
        return '$';


    }
    public static void main(String[] args) {
        String s= "geeksforgeeks";
        System.out.println(nonrepeat(s));
    }
    
}
