package arrays;

public class binary_search {
    public static int binary(int arr[],int k){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid =left+(right-left)/2;

            if(arr[mid]==k){
                return mid;
            }
            if(arr[left]<k){
                left++;

            }
            else{
                right--;
            }
        }
        return-1;
    
}
public static void main(String[] args) {
    int arr[]={ 8, 12, 16, 4, 0, 20};
System.out.println(binary(arr,4));
    
}}
