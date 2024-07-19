import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        // int a = sum();
        // int b =sum();
        // int c = sum();

        // System.out.println(a+" "+ b + " "+ c);

        int sum = sum2(5, 10);
        System.out.println(sum); // 15
    }

    static int sum(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number 1 : ");
        int num1 = in.nextInt();
        System.out.println("Enter number 2 : ");
        int num2 = in.nextInt();
        int sum = num1 + num2;

        return sum;
        


    }

    static int sum2(int a,int b ){
        int sum = a + b;
        return sum;
    }
    
}
