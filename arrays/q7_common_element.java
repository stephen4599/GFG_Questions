package arrays;
import java.util.*;
public class q7_common_element {
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList<Integer>l=new ArrayList<>();
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0; i<v2.length; i++)
        {
            hs.put(v2[i],hs.getOrDefault(v2[i],0)+1);
        }
        for(int i=0; i<v1.length; i++)
        {
            if(hs.containsKey(v1[i]))
            {
                l.add(v1[i]);
                hs.put(v1[i],hs.get(v1[i])-1);
                if(hs.get(v1[i])==0)
                {
                    hs.remove(v1[i]);
                }
            }
        }
        Collections.sort(l);
         return l;
}
public static void main(String[] args) {
     int []a = {3, 4, 2, 2, 2, 4};
     int []b = {3, 2, 2, 7};
    System.out.println(common_element(a,b));
}
}

