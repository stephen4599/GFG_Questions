package arrays;
import java.util.*;
public class q12_majorityelement{
    public static int majority(int []arr){
        Arrays.sort(arr);
        int p=-1;
        int count=1;
        int n=arr.length;
        int i=0; 
        if(n==1){
            return arr[i];
        }
        while(i<n-1){
            if(arr[i]==arr[i+1]){
                count =count+1;
                i++;
                if(count>n/2){
                    p=arr[i];
                }
            }
            else {
                count=1;
                i++;

            }
        }
        return p;
    }
public static void main(String[] args) {
    int arr[]={7,3,3,7};
    System.out.println(majority(arr));
}
}