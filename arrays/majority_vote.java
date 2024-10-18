package arrays;
import java.util.*;


public class majority_vote {
     public static List<Integer> votes(int [] nums){
        HashMap <Integer , Integer> sc= new HashMap<>();
       
        if(nums.length==0)
        {
         return Collections.singletonList(-1);
       }
       for(int num:nums){
       sc.put(num, sc.getOrDefault(num, 0) + 1);

        }
        int n=nums.length;
        int y=n/3;
        List <Integer> result = new ArrayList<>();
        for(Map.Entry<Integer,Integer> entry: sc.entrySet()){
            if(entry.getValue() > y){
                result.add(entry.getKey());
            }
        
        
        }
        return result.isEmpty() ? Collections.singletonList(-1):result;
       }



    
    public static void main(String[] args) {
        int[] nums = {2, 1, 5, 5, 5, 5, 6, 6, 6, 6, 6};
        List<Integer> output = votes(nums);
        System.out.println(output);
        
     }
    
}
