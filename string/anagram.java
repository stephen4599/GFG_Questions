package string;

import java.util.Arrays;

public class anagram {
    public static void main(String[] args) {
        String a="lves";
        String b="elvS";
      System.out.println(  Anagram(a,b));


    
}
     public static  boolean Anagram(String a, String b) {
       String  str1 =a.replaceAll("\\ ","");
        String  str2 =b.replaceAll("\\ ","");
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            char [] c1 =str1.toLowerCase().toCharArray();
            char [] c2 =str2.toLowerCase().toCharArray();
            
            Arrays.sort(c1);
            Arrays.sort(c2);
            return Arrays.equals(c1,c2);
            
        }
    }

     

}