
import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Kunal Kushawa";
        System.out.println(Arrays.toString(name.toCharArray())); // converted into char array
        name.length(); // gives length;
        System.out.println(name.toLowerCase()); // original one is not changed its actually creating a new object
        System.out.println("  Kunal   ".strip());// will remove the extar spacees from edge
        System.out.println(Arrays.toString(name.split(" "))); // where you have space split it over there
    }
}
