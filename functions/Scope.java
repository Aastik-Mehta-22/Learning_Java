public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        // System.out.println(num); // we can not acess num over here bevause it not in this scope

        {
            a = 100;
            System.out.println(a); // 100
        }

        System.out.println(a); // 100
    }


    static  void random(){
        int num = 67;
        System.out.println(num);
    }
}
