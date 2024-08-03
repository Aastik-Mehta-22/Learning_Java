package staticExample;

public class Temp {
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal Kushawa", 10000, false);
        Human Rahul = new Human(34, "Rahul", 15000, true);
        Human OK = new Human(0, null, 0, false);

        System.out.println(kunal.name);
    }
}
