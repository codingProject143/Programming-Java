import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String oct= sc.next();
        int p=0;
        int dec =0;
        for(int i=oct.length()-1;i>=0;i--)
        {
            char ch = oct.charAt(i);
            if(ch>='0' & ch<='7')
            {
                dec = dec+(ch-48)*(int)Math.pow(8,p++);
            }
            else{
                p=-1;
                break;
            }
        }
        if(p==-1)
        {
            System.out.print("InvalId Input");
        }
        else
        {
            String bin = "";
            while(dec>0)
            {
                int r = dec%2;
                dec= dec/2;
                bin= r+bin;
            }
            System.out.print(bin);
        }
        
    }
}
