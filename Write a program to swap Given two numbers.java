import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        
        a=a+b-(b=a);
        if(a<b)
        {
            System.out.println(a);
            System.out.println(b);
        }
        else
        {
            a=a+b-(a=b);
            System.out.println(a);
            System.out.println(b);
        }
        
    }
}
