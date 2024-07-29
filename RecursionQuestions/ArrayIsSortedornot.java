public class ArrayIsSortedornot{
    public static void main(String[] args){
        int[] arr = {1,5,9,10};

        System.out.println(check(arr,0,1));
    }

    static boolean check(int[] arr,int s,int e){
        if(e == arr.length){
            return true;
        }

        if (arr[s] > arr[e]) {
            return false;
        }

        return check(arr, e, e+1);
    }
}
