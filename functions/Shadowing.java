public class Shadowing {
    static int x = 10;  // this will be shadowed 
    public static void main(String[] args) {
        System.out.println(x);
        int x =  5; // overlap the higher scope 
        fun();
        System.out.println(x);
    }

    static void fun(){
        System.out.println(x);
    }
}
