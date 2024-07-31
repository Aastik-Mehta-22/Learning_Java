
public class RemoveA {
    public static void main(String[] args) {
        
        skip("", "baccdah");
        String ans = skiptwo("baccdah");
        System.out.println(ans);
    }
    
    static void skip(String p, String up){
        if (up.isEmpty() ) { // we can also take up.length() == 0
            System.out.println(p);
            return ; 
        }
        char ch = up.charAt(0);

        if(ch == 'a') { // skip
            skip(p, up.substring(1));
        }
        else{
            skip(p + ch, up.substring(1));
        }

    }
    
    static String skiptwo(String up){
        if (up.isEmpty() ) { // we can also take up.length() == 0
            return ""; 
        }
        char ch = up.charAt(0);

        if(ch == 'a') { // skip
            return  "" + skiptwo(up.substring(1));
        }
        else{
            return ch + skiptwo(up.substring(1));
        }

    }
}
