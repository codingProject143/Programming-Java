import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int count=0;
    int sum=0;
    if(n1<0)
    {
        n1=(-n1);
    }
    if(n2<0)
    {
        n2=(-n2);
    }
    if(n2<n1)
    {
        n1=n1+n2-(n2=n1);
    }
    if(n1==0 ||n2==0)
    {
        System.out.print("INVALID Inputs");
    }
    else
    {
        for(int i =n1+1;i<n2;i++)
        {
            int rev=0;
            int dup = i;
            while(dup>0)
            {
                int r=dup%10;
                dup=dup/10;
                rev=rev*10+r;
            }
      
            if(rev==i)
            {
                sum=sum+rev;
                count++;
            }
        }
        if(count==0)
        {
            System.out.print("No Palindrome Values");
        }
        else
        {
            System.out.print(sum);
        }
    }
}
}
