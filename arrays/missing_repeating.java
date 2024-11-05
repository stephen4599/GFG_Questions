package arrays;
import java.util.*;

public class missing_repeating {
   public static ArrayList<Integer> miss(int arr[]){
    ArrayList<Integer> sc1 = new ArrayList<>();
    HashSet<Integer> hs =new HashSet<>();
    int n=arr.length;
    int realsum=(n*(n+1))/2;
    int sum=0;
    for(int x:arr){
    if(hs.contains(x))
    {
        sc1.add(x);

    }
    else{
        hs.add(x);
        sum+=x;

    }
    
}
int diff=Math.abs(realsum-sum);
    sc1.add(diff);
return sc1;
}
   public static void main(String[] args) {
    int arr[]={1,3,3};
    System.out.println(miss(arr));

   }
    
}
