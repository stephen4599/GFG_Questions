package arrays;

public class minimum_jumps {
    public static int minjumps(int []arr){
        int n=arr.length;
        int count =1;
        if(arr[0]==0)
        {
            return -1;
        }//1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9
        //First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last.
        for(int i=0;i<n;i++)
        {
            int x=0;
            if(i==0)
            {
                x=arr[i];
            }
            int y=x+i+1;
            if(y<n)
            {
            x=arr[y];
            count=count+1;
        }
            if(y>n)
            {
                arr[x]=n;
                count=count+1;
                break;
            }

        }
        return count;
    }
    public static void main(String[] args) {
        int arr[]={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(minjumps(arr));
    }
}
