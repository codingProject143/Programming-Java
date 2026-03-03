import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int fc=0;
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                if(n%i==0)
                {
                    fc++;
                }
            }
            if(fc==2)
            {
                System.out.print("Prime Number");
            }
            else
            {
                System.out.print("Not a Prime Number");
            }
        }
    }
}
