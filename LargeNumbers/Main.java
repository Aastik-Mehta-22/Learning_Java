
import java.math.BigInteger;


public class Main {
    public static void main(String[] args) {
        int a = 30;
        int b = 67;

        BigInteger A = BigInteger.valueOf(5);
        BigInteger B = BigInteger.valueOf(6);
        BigInteger C = new BigInteger("2345678984989380932898384020840329943490");
        BigInteger X = new BigInteger("546783548946654895656878165528265826878662");

        //constants
        BigInteger D = BigInteger.TEN;


        //additioin of big numbers
        BigInteger s = C.add(X);
        System.out.println(s);
        
        System.out.println(Factorial.fact(8789));

    }
}
