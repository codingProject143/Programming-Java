import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner Sc = new Scanner(System.in);
        int n1 = Sc.nextInt();//12
        int n2 = Sc.nextInt();//18
        int h = n1<n2?n1:n2;
        int gcd=0;
        if(n1<=0 && n2<=0)
        {
            System.out.print("Invalid Inputs.");
        }
        else if(n1<=0)
        {
            System.out.print("Invalid First Input");
        }
        else if(n2<=0)
        {
            System.out.print("InValid Second Input");
        }
        else
        {
            for(int i=h;true;i+=h)
            {
              if(i%n1==0 && i%n2==0)
              {
                  System.out.print(i);
                  break;
              }
            }
        }
    }
}
