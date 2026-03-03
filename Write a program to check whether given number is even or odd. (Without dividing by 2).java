import java.util.Scanner;
class main{
    public static void main(String [] args){
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        if(n<=0)
        {
            System.out.print("Invalid Input");
        }
        while(n>0)
        {
           n= n-2;
        }
        if(n==0)
        {
            System.out.println("Even");
        }
        else
        {
            System.out.println("Odd");
        }
    }
}
