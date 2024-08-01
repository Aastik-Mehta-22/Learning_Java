public class WrapperClass {
    public static void main(String[] args) {
    

        Integer num = 10; // Integer is a wrapper class // here we are using this as an object 

        // when we do num. we can get many fucntions of integer class

        Integer a = 10;
        Integer b = 20;

        swap(a,b);

        System.out.println(a + " " + b);
        // final int bonus = 2;
        // bonus = 3; // we can not modify it 
       
        final A kunal = new A("Kunal Kushwaha");

        kunal.name = "other name";

        // when a non primitive is final,you can not reassign it
        // kunal = new A(null);


    }

    static void  swap(Integer a, Integer b){ // this will also not swap because this wrapper class is final
        Integer temp = a;
        a = b;
        b = temp;

    }
}

class A{

    final int num = 10;
    String name;

    public A(String name){
        this.name = name;
        // this.num = 40; // we can not do this 
    }

    
}
