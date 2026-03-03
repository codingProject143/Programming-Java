import java.util.Scanner;
class main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int gcd = 0;
        if(a<1 && b<1)
        {
            System.out.print("Invalid Inputs");
        }
        else if(a<1)
        {
            System.out.print("Invalid First Input");
        }
        else if(b<1)
        {
            System.out.print("Invalid Second Input.");
        }
        else
        {
            for(int i = 1;i<=a && i<=b ;i++)
            {
                if(a%i==0 && b%i==0 )
                {
                    gcd = i;
                }
            }
            System.out.print(gcd);
        }
    }
}
