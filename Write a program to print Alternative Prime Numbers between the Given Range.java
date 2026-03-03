import java.util.Scanner;
class Main{
    public static void main(String []args){
        Scanner Sc =new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int fc=0;
        int k=0;
        int c=0;
        if(a<1 || b<1)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=a;i<=b;i++)
            {
                fc=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        fc++;
                    }
                }
                if(fc==2)
                {
                    c++;
                    if(c%2==1)
                    {
                        k++;
                        if(k!=1)
                        {
                            System.out.print(", ");
                        }
                        System.out.print(i);
                    }
                }
            }
        }
    }
}
