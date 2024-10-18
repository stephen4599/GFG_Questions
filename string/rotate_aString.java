package STRING_GFG;
public class rotate_aString {
    public static boolean rotate(String str1,String str2){
        int n=str1.length()-1;
         boolean p= false;
         if(str1.length()==0){
            return p;
        }
        
     for(int i=2;i<=str1.length();i++){

        if(str1.substring(i)+str1.substring(n,n-1)==str2){
             p=true ;
        }
        
     }
     return p;


    }
    public static void main(String[] args) {
        System.out.println(rotate("amazon","azonam"));
    }
}
