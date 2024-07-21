
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {
        /*
         [[],[],[]] // this is called 2d array or multidimension array

            1 2 3
            4 5 6
            7 8 9 // it 3*3 matrix 3rows 3 column
         */

        //  int[][] arr = new int[3][]; // no of rows is 3 which s mandatory but its not mandotary to add no fo cloumuns
        
         //int[][] arr = {{1,2},{3,4},{5,6}} // its also correct
        
         Scanner in = new Scanner(System.in);

        //  int[][] arr = {
        //     {1,2,3}, //0th index
        //     {4,5}, //1st index
        //     {6,7,8,9}//2nd index when we say arr2d[2] this will give {6,7,8,9};
        //  };

         //input 

         int[][] arr = new int[3][3];
        //  System.out.println(arr.length); // no of rows
        //  System.out.println(arr[0].length); // no of columsn in that particular row
         for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                arr[i][j] = in.nextInt();
            }
         }

        //  for(int i = 0;i<arr.length;i++){
        //     for(int j = 0;j<arr[i].length;j++){
        //         System.out.print(arr[i][j] + " ");
        //     }
        //     System.out.println();
        //  }    

        // for(int i = 0;i<arr.length;i++){
        //     System.out.println(Arrays.toString(arr[i]));
        //  }         

        for(int[] ar : arr){
            for(int ele : ar){
                System.out.print(ele + " ");
            }
            System.out.println();
        }


    }
}
