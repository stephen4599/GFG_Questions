package string;

public class non_repeating_strin {
    public static void main(String[] args) {
        System.out.println(nonrepeat("hlh"));
    }
    public static char nonrepeat(String s){
        int n=s.length();
        int i=0;
        int j=i+1;
        while(i<s.length()&&j<s.length()){
            if(s.charAt(i)!=s.charAt(j)){
                    j++;
                    
            }
            else{

                i++;
               break;
                
            }
        }
        return j==n?s.charAt(i):'$';
    }
}
