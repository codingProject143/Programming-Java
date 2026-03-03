import java.util.Scanner;
class Main{
    public static void main(String []args){
    Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        if(a<1)
        {
            System.out.print("Invalid Input");
        }
        else
        {
            for(int i=1;i<=a;i++)
            {
                if(a%i==0)
                {
                    System.out.print(i+" ");
                }
            }
        }
    }
}
