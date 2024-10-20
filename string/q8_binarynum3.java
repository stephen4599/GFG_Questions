package string;

import java.util.*;

public class q8_binarynum3 {
    public static int m3(String s) {
        int v = 0;
        int y = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(s.length() - 1 - i);
            if (c == '1') {
                if (i % 2 == 0) {
                    v++;
                } else {
                    y++;
                }

            }
        }
        int diff = y - v;

        return (diff % 3 == 0) ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(m3("000111"));
    }
}

// HashMap <Character,Integer> sc=new HashMap<>();
// for(int i=s.length()-1;i>=0;i--){

// char c=s.charAt(i);
// if(i==s.length()-1){
// sc.put(c,1);
// }
// else{
// sc.put(c,v=v*2);
// }
// if(sc.containsKey('1'))
// {

// y= sc.get('1')+y;
// }

// for(Map.Entry<Character,Integer> entry:sc.entrySet())

// if(entry.getKey()==1){
// y=entry.getValue()+y;

// }
