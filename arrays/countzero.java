package arrays;

public class countzero {
    public static int count(int arr[]){
    int count=0;
    int n=arr.length;
    for (int i=n-1;i>0;i--){
        if(arr[i]==0){
             count=count+1;
           
        }
        else{
            break;
        }
        
    }
    return count;
    }
public static void main(String[] args) {
    int arr[]={1,1,1,1,0,0,0,0};
    System.out.println(count(arr));
}}
