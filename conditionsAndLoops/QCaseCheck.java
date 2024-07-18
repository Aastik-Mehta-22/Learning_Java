import java.util.Scanner;

public class QCaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char ch = in.next().trim().charAt(0);
        System.out.println(ch);

        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Lowercase");
        }
        else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("UpperCase");
        }
        else{
            System.out.println("Other");
        }

        
    }
}
