import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
            int n1=sc.nextInt();
            int n2=sc.nextInt();
            if(n1<0  && n2<0)
            {
                System.out.print("Invalid Inputs");
            }
            else
            {
                int a = (int)Math.pow(n1,n2);
                System.out.print(n1+" Power "+n2+" value is "+a);
            }
            System.out.print(".");
        
    }
}
