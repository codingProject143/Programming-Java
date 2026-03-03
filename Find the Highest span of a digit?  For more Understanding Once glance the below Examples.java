import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner Sc =new Scanner (System.in);
    int n =Sc.nextInt();
    int h =0;
    int s=9;
    if(n<=0)
    {
        System.out.print("Invalid Input.");
    }
    else
    {
        while(n>0)
        {
            int r = n%10;
            n = n/10;
            if(h<r)
            {
                h=r;
            }
            if(s>r)
            {
                s=r;
            }
        }

        
        System.out.println("Lowest Digit in a Given Number is "+s+".");
        System.out.println("Highest Digit in a Given Number is "+h+".");
        int c=h-s;
        System.out.print("Highest Span in a Given Number is "+c+".");
    }
    
    }
}
