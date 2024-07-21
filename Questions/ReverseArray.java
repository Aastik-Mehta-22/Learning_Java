
import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.print("After reversing the array we got : ");
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int[] arr){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
          
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;

            s++;
            e--;
        }
    }
}
