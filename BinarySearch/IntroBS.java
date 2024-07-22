
public class IntroBS {
   public static void main(String[] args) {
      
      int[] arr = {1};

      int index = search(arr,1);

      if(index != -1){
         System.out.println("Element found at index : " +  index);
      }
      else System.out.println("Element not found");
   } 

   static int search(int[] arr,int ele){
      int s = 0;
      int e = arr.length -1;
      int mid = s + (e-s) /2 ;
      while (s <= e) {
         if(arr[mid] == ele){
            return mid;
         }
         else if(ele < arr[mid]){
            e = mid - 1;
         }
         else s = mid + 1;

         mid = s+(e-s)/2;
      }


      return -1;
   }
}
