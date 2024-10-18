
package arrays;
import java.util.*;

public class chocolate_Dis {
    public static void main(String[] args) {
        ArrayList <Integer> sc =new ArrayList<>(Arrays.asList(3, 4, 9, 56, 7, 9, 12));
        System.out.println(minval(sc,5));
    }
    
    
    public static long minval(ArrayList<Integer> a,int m){
        int n=a.size();
        Collections.sort(a);
        long res =Long.MAX_VALUE;
        if(n==0){
            return 0;
        }
        else{
            for(int i=0;i<n-m+1;i++){
                int x=a.get(i);
                int y=a.get(i+m-1);
                res =Math.min(res,y-x);
            }
        }
        return res;
    }
}
