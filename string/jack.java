package STRING_GFG;

public class jack {
    public static void sr(String a,String b){
        StringBuilder x=new StringBuilder(a);
        StringBuilder y=new StringBuilder(b);
        for(int i=0; i<x.length(); i++)
        {
            for(int j=0; j<y.length(); j++)
            {
                if(x.charAt(i)==y.charAt(j))
                {
                    x.deleteCharAt(i);
                }
            }   
        }
        System.out.println(x);}

        public static void main(String[] args) {
            sr("tiger","er");
        }
    
}
