import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner Sc =new Scanner(System.in);
        char ch = Sc.next().charAt(0);
        if(ch=='a')
        {
            for(char i=ch;i<='z';i++)
            {
                System.out.print(i+" ");
            }
        }
        else
        {
            for(char i=ch;i<='Z';i++)
            {
                System.out.print(i+" ");
            }
        }
    }
}
