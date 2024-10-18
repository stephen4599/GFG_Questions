package arrays;
import java.util.*;
public class two_sumpair_zero {
    //[-1,0,1,2,-1,-4]
    //[-4,-1,-1,0,1,1,2]
    //
public static ArrayList<ArrayList<Integer>> getpair(int[]arr){
ArrayList<ArrayList<Integer>> result = new ArrayList <>();
 Arrays.sort(arr);
 int l=0;
 int r= arr.length-1;
 
  while(l<r)
  {
    int sum =arr[l]+arr[r];
    if(sum==0)
    {
        ArrayList <Integer> pair = new ArrayList <>();
        pair.add(arr[l]);
        pair.add(arr[r]);
        result.add(pair);
    
    l++;
    r--;

while(l < r && arr[l]==arr[l-1]){l++;}
while(l < r && arr[r]==arr[r+1]){r--;}
}
else if(sum<0){
    l++;
} 
else 
{
    r--;
}


  }
  return result;
}

         
    public static void main(String[] args) {
        int[] arr = {-4,-1,-1,0,1,1,2};
        ArrayList<ArrayList<Integer>> output = getpair(arr);
        System.out.println(output); 
    }
}

