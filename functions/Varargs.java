
import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
        fun(2,3,4,5,6,7);
        multiple(1, 2, "Hello","Hi my name is aastik");
    }

    static void multiple(int a,int b, String ...v){
        System.out.println(a +  b + Arrays.toString(v));
        
    }

    static void fun(int ...v){
        System.out.println(Arrays.toString(v));
    }
}
