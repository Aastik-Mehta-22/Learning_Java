package abstractDemo;

public class Main {
    
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        System.out.println(son.age);

        Parent daughter = new Daughter(38);
        daughter.career();
        System.out.println(daughter.age);

        Parent.hello();
    }
}
