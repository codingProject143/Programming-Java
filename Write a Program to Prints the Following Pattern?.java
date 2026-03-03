import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char c = 'A';
        if(n<0)
        {
            n=-n;
        }
        if(n==0)
        {
            System.out.print("Invalid Input");
        }
        
        else if(n>6)
        {
            System.out.print("Range Exceeded");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                for(int j=1;j<=i;j++)
                {
                    System.out.print(c+" ");
                    c++;
                }
                System.out.println();
            }
        }
    }
}
