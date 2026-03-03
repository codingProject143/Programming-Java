import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int temp = n;
        
        if(n<0)
        {
            System.out.print("Invalid Input");
        }
        else if(n==0)
        {
            System.out.print("Zero");
        }
        else
        {
            int rev=0;
            while(n>0)
            {
            int r = n%10;
            n=n/10;
            rev=rev*10+r;
            }
        
        if(temp==rev)
        {
            System.out.print("Given Number is Palindrome");
        }
        else{
            System.out.print("Reverse of a Given Number is "+rev);
        }
        }
    }
}
