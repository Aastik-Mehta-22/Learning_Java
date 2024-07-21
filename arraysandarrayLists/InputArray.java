import java.util.Arrays;
import java.util.Scanner;

public  class  InputArray{
    public static void main(String[] args) {
        // int[] arr = new int[5];
        // arr[0] = 23;
        // arr[1] = 45;
        // arr[2] = 233;
        // arr[3] = 41;
        // arr[4] = 19;
        //[23,45,233,41,19]

        // System.out.println(arr[3]);
        Scanner in = new Scanner(System.in);
        //input using for loops
        // for(int i = 0;i<5;i++){
        //     arr[i] = in.nextInt();
        // }
        // for(int i = 0;i<arr.length;i++){ // arr.length gives the size of the array
        //     System.out.print(arr[i] + " ");
        // }

        // for(int num : arr){
        //     System.out.println(num); // here num represents element in the array
        // }

        // //one more method
        // System.out.println(Arrays.toString(arr)); // it will convert array into string and print it internally it is also using for loop


        // array of objects
        String[] str = new String[4];
        for(int i = 0;i<str.length;i++){
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}