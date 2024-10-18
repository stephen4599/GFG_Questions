package arrays;

import java.util.Arrays;

public class q9_2ndlargest_no {
    public static int getSecondLargest(int[] arr){
        Arrays.sort(arr);
       int n=arr.length;
       while(arr[n-2]==arr[n-1]){
        if(n==2)
        return -1;
        n--;

       }
       return arr[n-2];
        
    }
    public static void main(String[] args) {
        int u[]={10,9,10};
        System.out.println(getSecondLargest(u));
        
    }
    
    
}
