import java.util.Scanner;
class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int c1 = 0;
        int k = 0;
        if(n==0)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            if(n<0)
            {
                n=-n;
            }
            for(int i=1;i<=n*2;i++)
            {
                c1++;
                if(c1%2==1)
                {
                    k++;
                    if(k!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(a);
                }
                int c = a+b;
                a=b;
                b=c;
            }
        }
        
    }
}
