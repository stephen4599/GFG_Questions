package STRING_GFG;
public class reverse_word {


   

 

    static String reverse(String str) {
        String []arr=str.split("//.");
        StringBuilder sb=new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]+".");
            
        }
        String ans=sb.toString();
        String ans2 = ans.substring(0,ans.length()-1);
        return ans2;
    }
      
  
    public static void main(String[] args) {
    System.out.println(reverse("string.love"));

}}