package arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class alternative_sorting {
    public static ArrayList<Integer> alt (int[] arr){
        ArrayList<Integer> sc = new ArrayList<>();
//         Arrays.sort(arr);
//         int y=0;
//         int n=arr.length-1;
//         //{1,2,3,4,5,6,7} 605142
//         //{7, 1, 6, 2, 5, 3, 4}
//         for(int i=n;i>=0;i--){
//             sc.add(arr[n]);
//             n=n-1;
            
//             sc.add(arr[y]);
//            y=y+1;
//             if(arr[n]==arr[y]){
//                 sc.add(arr[n]);
//                 break;
//             }
            
            
// }
//        return sc;
  
int left = 0;
int right = arr.length - 1;

// Step 3: Use a loop to rearrange the elements
while (left <= right) {
    if (right >= left) {
        sc.add(arr[right--]); // Add largest element
    }
    if (right >= left) {
        sc.add(arr[left++]); // Add smallest element
    }
}

return sc;
        
    }
    public static void main(String[] args) {
        int [] arr={7, 1, 6, 2, 5, 3, 4};
        System.out.println(alt(arr));

        
    }

}
