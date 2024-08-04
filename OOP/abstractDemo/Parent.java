package abstractDemo;

public abstract class Parent {
    
    int age;
    public  Parent(int age){
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey");
    }

    abstract void career();
    abstract void partner();
}
