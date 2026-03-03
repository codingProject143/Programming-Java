import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int af = 0;
        int br = 0;
        if(n<=0)
        {
            System.out.print("InValid Input");
        }
        else
        {               //n>i
            for(int i=n-1;true;i--)
            {
                int fc=0;
                for(int j=1;j<=i;j++)
                {
                    if(i%j==0)
                    {
                        fc++;
                    }
                }
                if(fc==2)
                {
                    br=i;
                    break;
                }
            }           //true
            for(int k=n+1;k>n;k++)
            {
                int fc1=0;
                for(int j=1;j<=k;j++)
                {
                    if(k%j==0)
                    {
                        fc1++;
                    }
                }
                if(fc1==2)
                {
                    af=k;
                    break;
                }
            }
            
            int a = n-br;
            int b = af-n;
            if(a<b)
            {
                System.out.print(br);
            }
            else if(b<a)
            {
                System.out.print(af);
            }
            else
            {
                System.out.println(br);
                System.out.print(af);
            }
        }
    }
}
