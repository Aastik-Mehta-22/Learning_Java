public class InfiniteArray {
    public static void main(String[] args) {
        
    }

    static int ans(int[] arr,int target){
        //first find the range
        //first start with a box of size 2
        int start = 0;
        int end = 1;
       
        while(target > arr[end]){
            int newStart = end + 1;
            end = end + (end-start+1)*2;
            start = newStart;
        }

        
        return search(arr,target,start,end);
    }


    static int search(int[] arr,int ele,int s,int e){

        while (s <= e) {
           int mid = s + (e-s) /2 ;
           if(arr[mid] == ele){
              return mid;
           }
           else if(ele < arr[mid]){
              e = mid - 1;
           }
           else s = mid + 1;
  
        }
  
  
        return -1;
     }
}
