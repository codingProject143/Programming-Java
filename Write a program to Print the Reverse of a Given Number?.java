import java.util.Scanner ;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int rev = 0;
        if(n<=0)
        {
            System.out.print("InValid Input");
        }
        else
        {
            while(n>0)
            {
                int r=n%10;
                n=n/10;
                rev=rev*10+r;
            }
            System.out.print(rev);
        }
    }
}
