
package STRING_GFG;
import java.util.ArrayList;
class print_pattern{
public static void main(String[] args) {
    System.out.println(pattern(-8));
}
   
        public static ArrayList<Integer> pattern (int N){
       
       ArrayList <Integer> l =new ArrayList<>();
       
       if(N<=0)
       {
           l.add(N);
           return l;
           
       }
       l.add(N);
       
       int a=N-5;
       
       l.add(a);
       int c=0;
       while(a!=N)
       {
           if(a>0&&c==0)
           {
               a=a-5;
               l.add(a);
               
           }
           else
           {
               a=a+5;
               l.add(a);
               c=1;
           }
       }
       return l;
    
    }
}