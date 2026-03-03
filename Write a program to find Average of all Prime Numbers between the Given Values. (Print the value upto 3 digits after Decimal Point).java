import java.util.Scanner;
class Main
{
    public static void main(String []args) {
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int fc = 0;
        int sum = 0;
        int count = 0;
        if(a<1 || b<1)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=a+1;i<b;i++)
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
                    sum=sum+i;
                    count++;
                }
            }
            float avg = (float)sum/count;
            System.out.printf("%.3f",avg);
        }
    }
}
