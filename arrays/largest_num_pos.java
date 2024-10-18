package arrays;
public class largest_num_pos {
    static String findLargest(int N, int S){
        if (S == 0) 
        {
            // s==0 n=0 st=-1 
            if (N == 1)
            {
                return "0";
            }
             else 
            {
                return "-1";
            }
        }
        if (S > 9 * N)
        {
            return "-1";
        }

        
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < N; i++) 
        {
            int digit = Math.min(9, S);
            result.append(digit);
            S -= digit;
        }

        return result.toString();
    }

    //     String st="";
    //    if(s==0){
        
    //     if(n==0){
    //         return "-1";
    //     }
    //     else{
    //         return "0";
    //     }}
    //     if (s > 9 * n) {
    //         return "-1";
    //     }
    //     StringBuilder sc =new StringBuilder();
    //     for(int i=0;i<n;i++){
    //         if(s>=9){
    //             sc.append(9);
    //             s-=9;
    //         }
    //         else{
    //             sc.append(s);
    //         }
    //     }
    //     return st=sc.toString();

       
    // }
    

    
    public static void main(String[] args) {
        System.out.println(findLargest(3,20));
        }}
    

