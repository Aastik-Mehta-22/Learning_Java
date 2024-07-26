public class SB {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i<26;i++){
            char ch = (char)('a' + i);
            builder.append(ch); // this is not creating new object this is just changing that one nothing else
        }

        System.out.println(builder.toString());

        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.insert(0, 'a'); 
        System.out.println(builder);

        builder.reverse(); // will reverse it
        System.out.println(builder);
    }
}
