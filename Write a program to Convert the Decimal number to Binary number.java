import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();

        if (dec == 0) {
            System.out.println("Zero");
        } else if (dec < 0) {
            // For negative numbers, just add '-' in front of binary string
            System.out.println( Integer.toBinaryString(-dec));
        } else {
            System.out.println( Integer.toBinaryString(dec));
        }
    }
}
