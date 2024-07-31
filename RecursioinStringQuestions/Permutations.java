
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        
        // permutations("", "abc");
        ArrayList<String> temp = permutationsList("", "abc");
        System.out.println(temp);
    }

    static void permutations(String p, String up){

        if(up.isEmpty()){
            System.out.println(p);
            return ; 
        }

        char ch = up.charAt(0);
        for(int i = 0;i<=p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());

            String ans = s + ch + e;
            permutations(ans, up.substring(1));
            
        }
    }

    static ArrayList<String> permutationsList(String p, String up){

        if(up.isEmpty()){
            ArrayList<String> temp = new ArrayList<>();
            temp.add(p);
            return temp; 
        }

        char ch = up.charAt(0);
        ArrayList<String> ans = new ArrayList<>();
        for(int i = 0;i<=p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i,p.length());

            ans.addAll(permutationsList(s + ch + e, up.substring(1)));

        }


        return ans;
    }
}
