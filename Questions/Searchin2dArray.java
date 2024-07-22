import java.util.Arrays;

public class Searchin2dArray {
    public static void main(String[] args) {
        
        int[][] arr = {
            {23,4,1},
            {18,120,3,9},
            {78,99,34,56},
            {18,12}
        };

        int target = 99;
        System.out.println(Arrays.toString(search(arr,target)));
    }

    static int[] search(int[][] arr,int target){
        int n = arr.length;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    
                    return new int[]{i,j};
                }
            }
        }


        return new int[]{-1,-1};
    }
}
