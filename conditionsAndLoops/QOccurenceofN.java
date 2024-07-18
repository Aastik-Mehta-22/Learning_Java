
import java.util.Scanner;

public class QOccurenceofN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // input the number
        
        int ans = 0;
        while(n != 0){
            int digit = n % 10;
            if(digit == 7) ans++;
            n = n /10;
        }

        System.out.println(ans);
    }
}
