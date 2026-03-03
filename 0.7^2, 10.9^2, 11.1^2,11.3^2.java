import java.util.Scanner;
class main{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        float a =sc.nextFloat();
        float b =sc.nextFloat();
        int c=0;
        for(float i=a;i<=b;i+=0.2)
        {
            c++;
            if(c!=1)
            {
                System.out.print(", ");
            }
           System.out.printf("%.1f^2",i);
        }
        System.out.print(".");
    }
}
