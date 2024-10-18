package arrays;


import java.util.ArrayList;

//n=9
//k=3

public class subarray_max {
    public static ArrayList<Integer> maxarrays(int k, int arr[]) {
        ArrayList<Integer> sc = new ArrayList<>();
        int n=arr.length;
        for (int i=0;i<n-k+1;i++){
            int max =arr[i];
            for(int j=1;j<k;j++){
                if(arr[i+j]>max){
                    max=arr[i+j];
                }

            }
            sc.add(max);

        }
        return sc;
}
    public static void main(String[] args) {
        int arr[]={1, 3, 3, 3, 4, 5, 2, 3, 6};
        System.out.println(maxarrays(3,arr));
    }


}
