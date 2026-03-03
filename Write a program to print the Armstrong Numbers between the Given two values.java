import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();
        int n2 = Sc.nextInt();
        int c1=0;
        int dup=0;
        
        if(n1<0)
        {
            n1=-(n1);
        }
        if(n2<0)
        {
            n2=-(n2);
        }
        if(n1>n2)
        {
            n1=n1+n2-(n2=n1);
        }
        if(n1==0 || n2==0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
            for(int i=n1+1;i<n2;i++)
            {
                dup=i;
                int c=0;
                int arm=0;
                
                while(dup>0)
                {
                   dup=dup/10;
                   c++;
                }
                dup=i;
                while(dup>0)
                {
                    int r=dup%10;
                    arm=arm+(int)Math.pow(r,c);
                    dup=dup/10;
                }
                if(arm==i)
                {
                    c1++;
                    if(c1==1)
                    {
                    System.out.print("Armstrong Numbers between the Given Values is ");
                    }
                    if(c1!=1)
                    {
                        System.out.print(", ");
                    }
                    System.out.print(i);
                }
            }
            if(c1==0)
            {
                System.out.print("No Armstrong Numbers Between Given Values");
            }
            else
            {
                System.out.print(".");
            }
        }
    }
}
