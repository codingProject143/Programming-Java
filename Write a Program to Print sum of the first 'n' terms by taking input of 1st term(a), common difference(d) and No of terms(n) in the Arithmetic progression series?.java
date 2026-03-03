import java.util.Scanner;
class main {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int c = 0;
        int sum = 0;
        if(n<=0)
        {
            System.out.print("Invalid input.");
        }
        else
        {
            for(int i=0;i<n;i++)
            {
                c++;
                if(c!=1)
                {
                    System.out.print("+ ");
                }
                sum =sum + a+(i*d);
                System.out.print(a+(i*d)+" ");
            }
            System.out.print("= "+sum+".");
        }
    }
}
