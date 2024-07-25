import java.util.ArrayList;

public class FindAllNodisinarray { // cyclic sort leetcode 448
    public static void main(String[] args) {
        int[] arr = {9,9,2,4,8,6,9,9,9,10};
        ArrayList<Integer> ans = new ArrayList<>();
        solve(arr,ans);
        System.out.println(ans);
    }

    static void solve(int[] arr,ArrayList<Integer> ans){
        int n = arr.length;
        int[] store = new int[n];
        
        int i = 0;
        while(i<n){

            if(i == arr[i] - 1){
                store[arr[i]-1] = 1;
                i++;
            } 
            else{
                if(store[arr[i]-1] != 1){
                    store[arr[i]-1] = 1;
                    swap(arr,i,arr[i]-1);
                    
                }
                else i++;
            }
        }

        for(i = 0;i<n;i++){
            if(arr[i] != i+1){
                ans.add(i+1);
            }
        }
    }

    static void swap(int[] arr,int a,int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    
}
