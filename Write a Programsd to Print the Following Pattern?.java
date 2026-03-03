import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
     Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int c =sc.nextInt();
        int k = 0;
       
        if(n<=0 && c<=0) 
        {
            System.out.print("Invalid Inputs");
        }
        else if(n<=0)
        {
            System.out.print("Invalid Row Input");
        }
        else if(c<=0)
        {
            System.out.print("Invalid Starting Value");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                int sum = 0;
                for(int j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    sum+=c;
                    c++;
                }
                
                System.out.print("- "+sum);
                System.out.println();
            }
        }
    }
}
