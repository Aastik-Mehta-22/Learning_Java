import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
        
        //syntax
        ArrayList<Integer> list = new ArrayList<>(10); // 10 is the initial capacity
        Scanner in = new Scanner(System.in);
        // ArrayList<Integer> list = new ArrayList<Integer>();

        // list.add(65);
        // list.add(1124);
        // list.add(21);
        // list.add(543);
        // list.add(324);
    
        // System.out.println(list);
        // list.set(0, 99);
        // System.out.println(list);
        // list.remove(0);
        // System.out.println(list);

        for(int i = 0;i<5;i++){
            list.add(in.nextInt());
        }

        //get an item at any index
        for(int i = 0;i<5;i++){
            System.out.println(list.get(i));
        }

    }
}
