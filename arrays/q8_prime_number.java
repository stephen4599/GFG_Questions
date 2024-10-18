package arrays;

public class q8_prime_number {
  public static int prime(int N) {
    if(N==1)return 0;
    if(N==2||N==3)return 1;
    double y=Math.sqrt(N);
    for(int i=2;i<=y;i++)
    {
        if(N%i==0)        {
            return 0;
        }
    }
    return 1;

  

  }

  public static void main(String[] args) {
    int o = 5;
    System.out.println(prime(o));
  }

}