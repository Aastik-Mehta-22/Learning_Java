import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        // String name = "Rahul";
        // int code = name.hashCode();
        // System.out.println(code);

        HashMap<String,Integer> map = new HashMap<>();

        map.put("Kunal",89);
        map.put("Karan",99);
        map.put("Rahul",94); 

        

        System.out.println(map.get("Karan"));
        System.out.println(map.containsKey("Karan"));

        

        HashSet set = new HashSet<>();
        set.add(56);
        set.add(56);
        set.add(9);
        set.add(12);
        set.add(43);

        System.out.println(set);

    }
}
