
import java.util.Scanner;

public class QReverseNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int rev = 0 ;
        while(n != 0){
            int digit = n % 10;
            rev = (rev * 10) + digit;
            n = n/10;

        }

        System.out.println("Reverse is : " + rev);


    }
}
