
import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b'); // 195 converti it into ascii value and add it
        System.out.println("a" + "b"); // add becuase both are string
        System.out.println('a' + 3); //100
        System.out.println((char)('a' + 3)); //d as we convert 100 into char i.e casting
        System.out.println("a" + 1);
        // int will be converted to integer that will call toString int the end this is "a" + "1"

        System.out.println("Kunal" + new ArrayList<>());

    }
}
