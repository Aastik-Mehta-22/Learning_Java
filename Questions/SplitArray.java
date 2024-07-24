

public class SplitArray {
    public static void main(String[] args) {
        
    }

    static int SplitArray(int[] nums,int m){
        int start = 0;
        int end = 0;

        for(int i = 0;i<nums.length;i++){
            start = Math.max(start, nums[i]);
            end += nums[i];
        }


        // binary search

        while (start < end) {
            int mid = start + (end-start)/2;
            
            //calculate how many peices we can divid this with max sum 
            int sum = 0;
            int peices = 1;
            for(int num : nums){
                if(sum + num > mid){

                    sum = num;
                    peices++;
                }
                else{
                    sum += num;
                }
            }

            if (peices > m) {
               start = mid + 1; 
            }
            else{
                end = mid;
            }
        }


        return  end; // we can return start as well as end anything
    }
}
