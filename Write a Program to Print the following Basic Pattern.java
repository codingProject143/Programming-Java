import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
       Scanner sc = new Scanner(System.in) ;
       int n = sc.nextInt();
       if(n<=0)
       {
           System.out.print("InValid InPut");
       }
       else
       {
           for(int i=1;i<=n;i++)
           {
               for(int j=1;j<=n;j++)
               {
                   System.out.print(i+" ");
               }
               System.out.println();
           }
       }
    }
