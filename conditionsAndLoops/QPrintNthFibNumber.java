import java.util.Scanner;

public class QPrintNthFibNumber {
    public static void main(String[] args) {

        System.out.print("Enter the value for the n : ");
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int prev = 0;
        int curr = 1;
        int ans = 0;

        if(n <= 1) System.out.println(n);
        else{
            while(n > 1 ){
                ans = prev + curr;
                prev = curr;
                curr = ans;
                n--;
            }
        }

        System.out.println(ans);

    

    }
}
