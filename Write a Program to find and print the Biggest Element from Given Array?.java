import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Array Size.");
        }
        else
        {
            int a[]= new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(a[i]>max)
                {
                    max=a[i];
                }
            }
            System.out.print(max);
        }
    }
}
