public class Searchinastring {
    public static void main(String[] args) {
        
        String name = "Aastik";

        char ch = 's';
        
        boolean ans = search(name, ch);

        System.out.println(ans);

    }

    static boolean search(String name, char ch){

        if (name.length() == 0) {
            return false;
        }
        // for(int i = 0;i<name.length();i++){
        //     if(ch == name.charAt(i)){
        //         return true;
        //     }
        // }

        for(char c : name.toCharArray()){
            if (c == ch) {
                return  true;
            }
        }


        return false;
    }
}
