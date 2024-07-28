import java.util.Scanner;

public class evenorodd {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        if( (n & 1 ) == 1) {
            System.out.println("Odd Number");
        }
        else System.out.println("Even Number");
    }
}
