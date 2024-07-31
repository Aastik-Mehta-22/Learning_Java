public class PhonePadLetterCombinations {
    public static void main(String[] args) {
        
        pad("", "239");
    }   

    static void pad(String p, String up){
        if (up.isEmpty()) {
            System.out.println(p);
            return ;
        }

        int digit = up.charAt(0) - '0'; // convert '2' into 2;
        for(int i = (digit - 1)*3;i<digit*3;i++){

            if( i == 26) continue;
            char ch = (char)('a'+i);
            pad(p + ch,up.substring(1));
        }
    }
}
