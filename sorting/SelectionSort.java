
import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {89,82,01,-22,20832,-18392,-2992,237762732};
        selection(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr){
        for(int i = 0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = maxi(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static int maxi(int[] arr,int start,int end){
        int ans = start;
        for(int i = start;i<=end;i++){
            if(arr[i] > arr[ans]){
                
                ans = i;
            }
        }

        return ans;
    }

    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    
}
