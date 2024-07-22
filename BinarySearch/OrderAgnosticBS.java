public class OrderAgnosticBS {
    public static void main(String[] args) {
        int[] arr = {40};

        int index = OrderAgBS(arr,40);

        if(index != -1){
           System.out.println("Element found at index : " +  index);
        }
        else System.out.println("Element not found");
    }

    static int OrderAgBS(int[] arr,int ele){


        int s = 0;
        int e = arr.length -1;
        boolean isAsc;

        if(arr[s] < arr[e]) isAsc = true;
        else isAsc = false;

        int mid = s + (e-s) /2 ;
        while (s <= e) {
           if(arr[mid] == ele){
              return mid;
           }
           else if(ele < arr[mid]){
                if(isAsc == true) e = mid - 1;
                else s = mid + 1;
           }
           else{
            if (isAsc) {
                s = mid + 1;
            }
            else e = mid -1;
           } 
  
           mid = s+(e-s)/2;
        }
  
  
        return -1;
    }
}
