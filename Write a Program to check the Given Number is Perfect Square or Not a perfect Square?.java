import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int sqrt=0;
        if(n<=0)
        {
            System.out.print("InvaliD Input");
        }
        else
        {
            for(int i= 1; i<=n;i++)
            {
                 sqrt=i*i;
                    if(sqrt==n){
                    break;
                }
            }
            if(sqrt==n){
                System.out.print("Given Number is a Perfect Square.");
            }
            else{
                System.out.print("Given Number is Not a Perfect Square.");
            }
        }
    }
}
