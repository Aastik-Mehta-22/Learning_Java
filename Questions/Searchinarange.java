public class Searchinarange {
    public static void main(String[] args) {
        int[] arr = {18,12,-7,3,14,28};
        int target = 14;
        System.out.println(searchInRange(arr,1,4,target));
    }

    static int searchInRange(int[] arr,int s,int e, int target){
        if(arr.length == 0 || e < s) return -1;

        for(int i = s;i<=e;i++){
            if(arr[i] == target) return i;
        }


        return -1;
    }
}
