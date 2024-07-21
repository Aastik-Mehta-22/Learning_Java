
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        System.out.print("Enter the first number : ");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = input.nextInt();
        int ans = num1 + num2;
        System.out.println("Sum of two numbers is : "+num1+num2);//22
        System.out.println("Sum of two numbers is : "+ans);//4
        // input.close();
    }
}
