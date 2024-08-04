import access.A;

public class Singleton {
    public static void main(String[] args) {
        
        SingletonExample a = SingletonExample.getInstance();
        SingletonExample b = SingletonExample.getInstance();
        SingletonExample c = SingletonExample.getInstance();


        // all three refrence variables aare pointing to just one object 

        A atwo = new A(10,"Kunal");

        System.out.println(atwo.getNum());

    }
}
