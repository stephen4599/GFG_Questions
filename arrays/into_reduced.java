package arrays;

import java.util.ArrayList;

import java.util.Collections;

public class into_reduced {
    
    public static void convert(int[] arr){
    ArrayList<Integer> sc=new ArrayList<>();
     
    for(int i=0;i<arr.length;i++)
{ 
    sc.add(arr[i]);
}
 Collections.sort(sc);
for(int i=0;i<arr.length;i++)
{ 
   int index = sc.indexOf(arr[i]);
   arr[i]=index;
  }

                
            }
public static void main(String[] args) {
    int[]y={50,40,45};
    convert(y);

}
            }
//     int[] arr1 = arr.clone();
//     Arrays.sort(arr);
//      int n=arr.length;
    
//     HashMap <Integer,Integer> sc=new HashMap<>();
//     for(int i=0; i<n;i++)
//     {
        
//         sc.put(arr[i],i);

//     }
//     for (int i = 0; i < n; i++) {
//         arr[i] = sc.get(arr1[i]);
//     }
// }
//     public static void main(String[] args) {
//         int y[]={10,40,20};
//         convert(y);
//         System.out.println(Arrays.toString(y));
//     }
// }
