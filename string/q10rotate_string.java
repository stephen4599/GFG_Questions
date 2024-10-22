package string;
public class q10rotate_string {
    public static void main(String[] args) {
        String a= "t";
        String b="t";
        System.out.println(rotate(a,b) ? 0:1);

    }
    public static boolean rotate(String a, String b){
        if(a.length() != b.length()){
            return false;
        }
        if (a.length() < 2) {
            return a.equals(b);
        }
        String clock = a.substring(2) + a.substring(0,2);
        String anti  = a.substring(a.length()-2) + a.substring(0,a.length()-2);
        return anti.equals(b) || clock.equals(b);
       
    }
}
