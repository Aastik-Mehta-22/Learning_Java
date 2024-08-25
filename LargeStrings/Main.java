import java.util.Arrays;

public class Main{
    public static void main(String[] args) {

        //constructor 1
        StringBuffer sb = new StringBuffer();

        //constructor 2
        StringBuffer s2 = new StringBuffer("Kunal Kushawa");     
        
        //constructor 3
        StringBuffer s3 = new StringBuffer(30);

        sb.append("WeMakeDevs");
        sb.append(" is nice");
        // sb.insert(2, " Rahul ");
        sb.replace(1, 5, "Kushwaha");
        sb.delete(1, 5);
        sb.reverse();
        String str = sb.toString();
        System.out.println(str);

        int n = 20;
        String name = RandomString.generate(n);
        System.out.println(name);

        //remove whitespaces
        String sentence = "hi fidjo lajdja oihi oasdjo";
        System.out.println(sentence);

        System.out.println(sentence.replaceAll("\\s", ""));

        //split

        String names = "Kunal Rahul Apporva Snehal";
        String[] arr = names.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}