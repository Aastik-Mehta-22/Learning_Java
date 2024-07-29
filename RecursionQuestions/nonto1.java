
import java.util.Scanner;

public class nonto1{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        printNto1(n);
    

    }

    static void printNto1(int n){
        if (n==1) {
            System.out.println(n);
            return ;
        }

        System.out.println(n);
        printNto1(n-1);
        // System.out.println(n); it is for print 1 to n
    }
}