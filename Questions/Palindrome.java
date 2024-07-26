


public class Palindrome {
    public static void main(String[] args) {
        String name = "naman";
        int s = 0;
        int e = name.length() - 1;

        while (s<e) {
            if(name.charAt(s++) != name.charAt(e--)){
                System.out.println("Not Palindrome");

                return ;
            }
        }

        System.out.println("Palindrome");

   
    }
}
