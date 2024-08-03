public class InnerClass {
    
    static  class Test{
        String name;
        public Test(String name){
            this.name = name;
        }


    }

    public static void main(String[] args) {
        
        Test a = new Test("random");
        Test b = new Test("random2");
        System.out.println(a.name); // random
        System.out.println(b.name); // random2
        
    }
}
