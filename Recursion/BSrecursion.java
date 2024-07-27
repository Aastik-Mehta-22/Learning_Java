public class BSrecursion {
    public static void main(String[] args) {
        int[] arr = {1,5,7,8,21,22,33};
        System.out.println(search(arr,5, 0, arr.length - 1));
    }

    static int search(int[] arr,int target,int s,int e){

        if(s > e){
            return -1;
        }

        int mid = s + (e-s)/2;

        if(target == arr[mid]) return mid;

        if(target < arr[mid]){
            return search(arr, target, s, mid-1);
        }

        return search(arr,target,mid+1,e);
    }
}
