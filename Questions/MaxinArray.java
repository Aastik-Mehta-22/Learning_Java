public class MaxinArray {
    public static void main(String[] args) {
        int[] arr = {99,87,101,221,0,12,20};

        System.out.println(maxElement(arr));

    }

    static int maxElement(int[] arr){
        int ans = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > ans){
                ans = arr[i];
            }
        }

        return ans;
    }
}
