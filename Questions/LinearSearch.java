
import java.util.Scanner;

public class LinearSearch{
    
    public static void main(String[] args) {
        
        @SuppressWarnings("resource")
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int n = in.nextInt();
        int[] arr = new int[n];

        for(int i = 0;i<n;i++){
            arr[i] = in.nextInt();
        }
        
        System.out.print("Maximum element is: " + findMax(arr));




    }
 

    static int findMax(int[] arr){
        int maxi = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            maxi = Math.max(maxi,arr[i]);
        }

        return maxi;
    }

}