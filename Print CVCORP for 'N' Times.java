import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<10 || n>100)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i=1;i<=n;i++)
            {
                System.out.println("CVCORP");
            }
        }
    }
}
