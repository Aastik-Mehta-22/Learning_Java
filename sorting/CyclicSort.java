
import java.util.Arrays;

public class CyclicSort { // when given nos from range 1 to n use cyclic sort algorithm
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
    static void cyclic(int[] arr){
        int i = 0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            }
            else i++;
            // if(i == arr[i] - 1){
            //     i++;
            // }
            // else{
            //     swap(arr,i,arr[i] - 1);
            // }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
