import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        if(r<=0 && c%2==0)
        {
            System.out.print("Invalid Inputs");
        }
        else if(r<=0)
        {
            System.out.print("Invalid Row Value");
        }
        
        else if(c%2==0)
        {
            System.out.print("Invalid Starting Value");
        }
        else
        {
            for(int i=1;i<=r;i++)
            {
                int sum=0;
                for(int j=1;j<=i;j++)
                {
                   
                    System.out.print(c+" ");
                    sum+=c;
                    c+=2;
                }
                if(sum%2==0)
                {
                System.out.println("@ "+sum+" -"+" Even");
                }
                else
                {
                System.out.println("@ "+sum+" -"+" Odd");
                }
            }
        }  
    }
}
