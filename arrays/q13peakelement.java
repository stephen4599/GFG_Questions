package arrays;

public class q13peakelement {
    public static int peak(int arr[]){
        int n = arr.length;

       
        if (n == 1 || arr[0] >= arr[1]) {
            return 0; 
        }

       
        if (arr[n - 1] >= arr[n - 2]) {
            return n - 1; 
        }

        
        for (int i = 1; i < n - 1; i++) {
            if (arr[i] >= arr[i - 1] && arr[i] >= arr[i + 1]) {
                return i; 
            }
        }

        return -1;
    }
    
    public static void main(String[] args) {
        int arr[]={1,2,3,2};
        
        System.out.println(peak(arr));
    }
}
