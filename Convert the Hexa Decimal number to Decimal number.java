import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Hd=sc.next();
        int dec = 0;
        int p=0;
        for(int i= Hd.length()-1;i>=0;i--)
        {
            char ch = Hd.charAt(i);
            if(ch>='0' && ch<='9')
            {
                dec = dec+(ch-48)*(int)Math.pow(16,p++);
            }
            else if(ch>='A' && ch<='F')
            {
                dec = dec+(ch-55)*(int)Math.pow(16,p++);
            }
            else if(ch>='a' && ch<='f')
            {
                dec = dec+(ch-87)*(int)Math.pow(16,p++);
            }
        }
        System.out.print(Hd+" -> "+dec);
    }
}
