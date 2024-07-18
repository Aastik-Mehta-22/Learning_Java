
import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt(); // 5 5.474 
        // System.out.println(num); // 5   error

        // float num = input.nextFloat(); // 5.389 5 
        // System.out.println(num); // 5.389 5.0

        // float num = input.nextInt(); // 5  5.445
        // System.out.println(num); // 5.0    error

        // int num = (int)(67.3456f);
        // System.out.println(num); //67 

        //automatic type promotion in expressions
        // int a = 257;
        // byte b = (byte)(a);
        // System.out.println(b); // 257 % 256 = 1

        // byte a = 40;
        // byte b = 50;
        // byte c = 100;

        // int d = (a * b ) /c; 
        // System.out.println(d);// 2000 / 100 = 20

        // byte b = 50;
        // b = b * 2; // error becuase when we aare performing byte evaluation auto it will cnvert into int

        // int num = 'A';
        // System.out.println(num); // 65 ascii value 

        // System.out.println(2 * 4.2);

        //
        
        byte b = 42;
        char c = 'a';
        short s = 1024;
        int i = 50000;
        float f = 5.67f;
        double d = 0.1234;
        double result = (f*b) + (i/c) - (d*s);
        System.out.println(result);

        input.close();
    }
}
