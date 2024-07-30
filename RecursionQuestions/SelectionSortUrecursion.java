
import java.util.Arrays;

public class SelectionSortUrecursion {
    public static void main(String[] args) {
        int[] arr = {3,7,8,1,9,0};
        selecion(arr, arr.length - 1, 0, 0);
        System.out.println(Arrays.toString(arr));
    }

    static void selecion(int[] arr,int last,int start,int max){

        if (last == 0) {
            return ;
        }

        if(start <= last){
            if(arr[start] > arr[max]){
                max = start;
            }

            selecion(arr, last, start+1, max);
        }
        else{
            int temp = arr[max];
            arr[max] = arr[last];
            arr[last] = temp;


            selecion(arr, last-1, 0, 0);
        }

    }


}
