
import java.util.Scanner;

public class SearchInaStringArray {

    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = in.nextInt();
        String[] arr = new String[n];
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextLine();
        }

        System.out.print("Enter string you want to searcy: ");
        String element = sc.nextLine();

        boolean ans =  search(arr, element);

        if (ans) {
            System.out.println("Element found");
        }
        else System.out.println("Element not found");

        
    }
    
    

    static  boolean search(String[] arr,String element){
        if(arr.length == 0) return false;

        for (String arr1 : arr) {
            if (arr1.equals(element)) {
                return true;
            }
        }


        return false;
    }
}
