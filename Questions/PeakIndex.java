public class PeakIndex {
    public static void main(String[] args) {
        
    }
    public static int peakIndexInMountainArray(int[] arr) {
        
        int s = 0;
        int n = arr.length;
        int e = n-1;
        while(s<=e){
            int mid = s + (e-s)/2;
            if((mid == 0 || arr[mid] > arr[mid-1]) && 
                (mid == n-1 || arr[mid] > arr[mid+1])){

                return mid;
            }
            else if(arr[mid+1] > arr[mid]){
                s = mid + 1;
            }
            else e = mid -1;

        }


        return -1;
    }
}
