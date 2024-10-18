package STRING_GFG;

import java.util.Arrays;

class longest_prefix{
    public static void main(String[] args) {
       String a[]={"flower","flow","floer"};
       
        System.out.println(longest(a));
    }
public static String longest(String arr[]){
Arrays.sort(arr);
String str1=arr[0];
String str2=arr[arr.length-1];
int index =0;
while(index<str1.length()){
    if(str1.charAt(index)==str2.charAt(index)){
        index++;

    }
    else break;
}
return index==0?"-1":str1.substring(0,index);
}
}
