import java.util.Scanner;
class Main {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c = 0;
        if(n<=10)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            int dup = n;
            while(dup>0)
            {
                dup=dup/10;
                c++;
            }
            System.out.print(c);
        }
    }
}
