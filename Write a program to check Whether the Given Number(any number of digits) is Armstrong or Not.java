import java.util.Scanner;
class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dup = n;
        int c = 0;
        int sum = 0;
        if(n>0)
        {
            while(dup>0)
            {
                dup = dup/10;
                c++;
            }
            dup = n;
            while(dup>0)
            {
                int r = dup%10;
                sum = sum+(int)Math.pow(r,c);
                dup = dup/10;
            }
            if(sum==n)
            {
                System.out.print(n+" is a Armstrong Number.");
            }
            else
            {
                System.out.print(n+" is Not a Armstrong Number.");
            }
        }
        else
        {
            System.out.print("Invalid Input");
        }
    }
}
