class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        //start + needed why look here -
        // end = 7 start =5 => (7-5)/2 = 1 now think does 1 index is mid no right
        // [1,2,3,4,5,6,7,8]
        // fix start +(end-start)/2 => 5+(7-5)/2 => 6 [6,7,8] here at index 6 7 is the mid
        int mid = start+(end-start)/2;

        while(start<end){
           
            if(nums[mid]==target) return mid;

            if(target>nums[mid]){
                start=mid+1;
            }else{
                end = mid-1;
            }
            mid = start+(end-start)/2;
        }
        
        return nums[mid]==target?mid:-1;
    }
}
