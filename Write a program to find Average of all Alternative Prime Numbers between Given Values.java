import java.util.Scanner;
class Main
{
    public static void main(String []args)
    {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum=0;
        int c=0;
        int count=0;
        if(a>b){
            a=a+b-(b=a);
        }
        if(a<=0 || b<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=a+1;i<b;i++)
            {
                int fc=0;
                for(int j =1;j<=i;j++)
                {
                    if(i%j==0){
                    fc++;
                    }
                }
                if(fc==2)
                {
                    c++;
                    if(c%2==1)
                    {
                        sum=sum+i;
                         count++;
                    }
                }
            }
            if(c==0)
            {
                System.out.print("No Prime Numbers");
            }
            else
            {
                float avg = (float)sum/count;
                System.out.printf("%.3f",avg);
            }
            
            
        }
    }
}
