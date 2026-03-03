import java.util.Scanner;
class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<1 || n>10)
        {
            System.out.print("Invalid Array Size.");
            System.exit(0);
        }
        else
        {
            int arr [] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            
            int key = sc.nextInt(); int sum=0;
            if(key<0 || key>=n)
            {
                System.out.print("Invalid Key Value.");
                System.exit(0);
            }
            else
            {
                for(int i=0;i<=key;i++)
                {
                    sum=sum+arr[i];
                }
                System.out.print(sum);
            }
        }
    }
}
