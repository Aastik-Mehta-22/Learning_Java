
import java.util.ArrayList;
// import java.util.Arrays;

public class AllSubsetsString {

    public static void main(String[] args) {
        
        String st = "abc";
        String p = "";
        // printAllSubsets(p,st);
        System.out.println(subseq(p, st)); // conatains all the elments in the list 
        


    }

    static void printAllSubsets(String p, String up){

        if (up.length() == 0) {
            if(p.length() == 0) return ;
            
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0);
        printAllSubsets(p, up.substring(1));
        printAllSubsets(p+ch, up.substring(1));
    }

    static ArrayList<String> subseq(String p , String up){
        if(up.length() == 0){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);

        ArrayList<String> left = subseq(p, up.substring(1));
        ArrayList<String> right = subseq(p + ch, up.substring(1));

        left.addAll(right);


        return left;
    }
}
