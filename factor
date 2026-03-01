import java.util.Scanner;
class main {
    public static void main(String[] args){
    Scanner Sc=new Scanner(System.in);
        int a = Sc.nextInt();
        int c=0;
        for(int i = 1;i<=a;i++)
        {
            c++;
            if(c!=1)
            {
                System.out.print(", ");
            }
            if(i%3==0)
            {
            System.out.print("factor of three");
            }
             else
             {
             System.out.print(i);
             }
        }
    }
}
