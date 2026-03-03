import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Array Size.");
            return;
        }
        
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
        int n1 = sc.nextInt();
        if(n1<=0)
        {
            System.out.print("Invalid Array Size.");
            return;
        }
        
        int b[] = new int[n1];
        for(int i=0;i<n1;i++)
        {
            b[i]=sc.nextInt();
        }
        
        int min = Math.min(n,n1);
        int total =0;
        for(int i=0;i<min;i++)
        {
            System.out.print(a[i]+b[i]+" ");
        }
       
        for(int i=min;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
       
        for(int i=min;i<n1;i++)
        {
            System.out.print(b[i]+" ");
        }
    }
}
