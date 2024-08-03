
public  class StaticEx{
    public static void main(String[] args) {
        
        fun();
        StaticEx obj = new StaticEx();
        obj.greeting(); // we just need a object to access non static things 
        // greeting(); we can not use non static here
    }

    // this is not dependent on objects 
    static void fun(){
        // greeting(); // you can not use this because it requires an instance
    }



    void fun2(){
        greeting(); // heere we can call because non static does not needs anything to be static 
    }
    // we know something which is not static belongs to an object 
    void greeting(){
        System.out.println("Hello World");
    }
}
