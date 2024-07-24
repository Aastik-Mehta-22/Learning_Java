
import java.util.Arrays;

public class SortedMatrix {
    public static void main(String[] args) {
        int[][] arr = {
            {1,2,3},
            {4,5,6},
            {7,8,9},
            {10,11,12}
        };

        int target = 8;
        System.out.println(Arrays.toString(search(arr, target)));

    }

    //search in the row provided between in the coloumns provided
    static int[] binarySearch(int[][] matrix,int row,int cstart,int cend,int target){
        while(cstart<=cend){
            int mid = cstart + (cend-cstart)/2;
            if(matrix[row][mid] == target){
                return new int[]{row,mid};  
            }
            else if(matrix[row][mid] < target){
                cstart = mid + 1;
            }
            else{
                cend = mid - 1;
            }
        }
        return new int[]{-1,-1};  
    }

    static int[] search(int[][] matrix,int target){
        int rows = matrix.length;
        int cols = matrix[0].length; // matrix may be empty

        if (rows == 1) {
            return binarySearch(matrix, 0, 0, cols-1, target);
        }

        int rStart = 0;
        int rEnd = rows-1;
        int cMid = cols/2;

        //run the loop till 2 rows are remaining

        while(rStart < (rEnd - 1)){
            int mid = rStart + (rEnd - rStart) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[] {mid,cMid};
            }
            else if(matrix[mid][cMid] > target){
                rEnd = mid;
            }
            else{
                rStart = mid;
            }
        }

        // now we have only 2 rows at the end
        //check whether the target is in the col of 2 rows

        if (matrix[rStart][cMid] == target) {
            return new int[] {rStart,cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[] {rStart + 1,cMid};
        }


        
        if(target <= matrix[rStart][cMid-1]){//search in 1st half
            return binarySearch(matrix, rStart, 0, cMid-1, target);
        }
        else if(target >= matrix[rStart][cMid+1] && target <= matrix[rStart][cols-1]){//search in 2nd half
            return binarySearch(matrix, rStart, cMid + 1, cols -1, target);
        }
        else if(target <= matrix[rStart+1][cMid-1] ){//search in 3rd half
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        else{//search in 4th half
            return binarySearch(matrix, rStart + 1, cMid + 1, cols -1, target);
        }
        
        


    }
}
