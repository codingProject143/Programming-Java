import java.util.Scanner;
class main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int c1 = 0;
        if(n1<=0 || n2<=0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            if(n1>n2)
            {
                n1=n1+n2-(n2=n1);
            }
            for(int i=n1;i<=n2;i++)
            {
                int dup = i;
                int c =0;
                int sum =0;
                while(dup>0)
                {
                    dup=dup/10;
                    c++;
                }
                dup = i;
                while(dup>0)
                {
                    int r=dup%10;
                    sum =sum+(int)Math.pow(r,c);
                    dup = dup/10;
                }
                if(sum==i)
                {
                    c1++;
                    if(c1==1)
                    {
                        System.out.print("Armstrong Numbers in the Given Range is ");
                    }
                    if(c1!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(sum);
                }
            }
        
            if(c1==0)
            {
                System.out.print("No Armstrong Numbers");
            }
            else
            {
                System.out.print(".");
            }
        }
    }    
}
