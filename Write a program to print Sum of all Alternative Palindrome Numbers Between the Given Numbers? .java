import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n1=Sc.nextInt();
        int n2=Sc.nextInt();
        int sum=0;
        int c=0,d=0;
        int rev=0;
        if(n1==0 ||n2==0)
        {
            System.out.print("Invalid Inputs");
        }
        else
        {
        
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
            
            for(int i=n1+1;i<n2;i++)
            {
                int dup=i;
                 rev=0;
                while(dup>0)
                {
                    int r=dup%10;
                    dup=dup/10;
                    rev=rev*10+r;
                }
                if(i==rev)
                {
                    c++;
                    if(c%2==1)
                    {
                        sum=sum+i;
                        d++;
                        if(d==1){
                            System.out.print("Sum of Alternative Palindrome Numbers between the "+n1+" and "+n2+ " is "+ rev);
                        }
                        else
                        {
                            System.out.print(" + "+rev);
                        }
                    }
                }
            }
            if(c==0){
                System.out.print("No Palindrome Values");
            }
            else
            {
                System.out.print(" = "+sum+".");
            }
        }
    }
}
