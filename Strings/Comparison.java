public class Comparison {
    public static void main(String[] args) {
        String a = "kunal";
        String b = "kunal";
        String c = a;
        // System.out.println(b == c);
        a = "kush";
        // System.out.println(c);
        // System.out.println(a);
        // System.out.println(c==a);


        // == operator gives true when the refrence is the same
        System.out.println(a==b); // true as both have same refrence

        String x = new String("Kunal");
        String y = new String("Kunal");

        System.out.println(x==y); // it will give false as both have different refrence
        System.out.println(x.equals(y)); // true, as it does not cares whether the refrence 
                                        // variable are equal or not , it just check about value
        

    }
}
