
import java.util.Arrays;

public class BubbleSortURecursion {
    public static void main(String[] args) {
        int[] arr = {3,7,8,1,9,0};
        bubble(arr, arr.length-1, 0);
        System.out.println(Arrays.toString(arr));


    }

    static void bubble(int[] arr, int last,int start){

        if(last == 0) return ;

        if(start < last){

            if (arr[start] > arr[start+1]) {
                int temp = arr[start];
                arr[start] = arr[start+1];
                arr[start+1] = temp;

            }

            bubble(arr, last, start+1);
        }
        else bubble(arr, last-1, 0);
    }
}
