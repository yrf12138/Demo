public class Demo6
{
    public static void main(String[] args) {
        int n=5;
        for(int i = 1;i<=n;i++) {
         for(int j =1;j<=n-i;j++)
           System.out.printf(" ");
      for(int k=1;k<=2*i-1;k++)
     {
     System.out.printf("*");
      }
      System.out.println();
      }

     }
}

