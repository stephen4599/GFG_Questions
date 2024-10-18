package arrays;
import java.util.*;


public class q10imidiate_small_element {
    public static void smallnext(int arr[]){
        int n=arr.length;
        int i=0;

        while(i<n){
            if(i==n-1){
                arr[n-1]=-1;
                break;
            }
            if(arr[i]>arr[i+1]){
                arr[i]=arr[i+1];
                
            }
            else{
                arr[i]=-1;
                       
         }
         i++;
      
        
        }
            }
    public static void main(String[] args) {
        int arr[]={4,2,1,5,3};

       smallnext(arr);
       String sc=Arrays.toString(arr);
       System.out.println(sc);
        
    }
    
}
