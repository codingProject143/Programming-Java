import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        if(n<=0)
        {
            System.out.print("Given Value is Invalid");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=n;j++)
                {
                    count++;
                    if(count%4==0)
                    {
                        System.out.print("* ");
                    }
                    else
                    {
                        System.out.print(count+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
