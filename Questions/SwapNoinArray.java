
import java.util.Arrays;


public class SwapNoinArray {
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10};

        swap(arr,0,3); // arr,index1,index2

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
