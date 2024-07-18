
import java.util.Scanner;

public class IntroSwitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

        switch (fruit) {
            case "Mango":
                System.out.println("King of Fruits");
                break;
            case "Apple":
                System.out.println("A sweet red fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            default:
                System.out.println("Please enter a valid fruit ");
        }
    }
}
