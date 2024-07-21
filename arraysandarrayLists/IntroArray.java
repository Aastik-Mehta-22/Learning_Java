
public class IntroArray {
    public static void main(String[] args) {
        
        // Q store a roll no;
        // int rollNo = 31;

        // syntax
        // datatype[] variable_name = new datatype[size];

        //store 5 roll numbers;
        int[] rnos = new int[5]; // all the type of data in the array should be same
        //or directly
        int[] rnos2 = {23,12,45,32,50};

        int[] ros; // declarationn of array, ros is getting defined in the stack
        ros = new int[5]; // actual obj is created in heap

        System.out.println(ros[1]); // 0 bcoz by defaault its 0

        String[] arr = new String[4];
        System.out.println(arr[0]); // null




    }
}
