public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        //swap two numbers
        // int temp = a;
        // a = b;
        // b = temp;
        // System.out.println(a + " "+ b); 20 10 it sswaps 

        // swap(a,b);
        // System.out.println(a + " "+ b);

        String name = "Kunal Kushwa";
        changeName(name);
        System.out.println(name);
    }

    static void swap(int a, int b){

        int temp = a;
        a = b;
        b = temp;
    }

    static void changeName(String name){
        name  = " Rahul Rana";
    }
}
