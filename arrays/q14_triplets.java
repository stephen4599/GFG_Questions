package arrays;
import java.util.*;
public class q14_triplets {
    public  static boolean ftriplet(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int c = arr[i];
            HashSet<Integer> seen = new HashSet<>();
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    int a = arr[j];
                    if (seen.contains(c - a)) {
                        return true; // Found a triplet
                    }
                    seen.add(a);
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={8,9,2,1};
        System.out.println(ftriplet(arr));
    }
}
