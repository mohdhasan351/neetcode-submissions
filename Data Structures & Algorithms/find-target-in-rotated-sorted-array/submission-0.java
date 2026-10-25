class Solution {
    public int search(int[] nums, int target) {
        int start =0;
        int end = nums.length-1;
        int mid = start + (end-start)/2;
        boolean isRoated = nums[start]<=nums[end]?false:true; 
        while(start<end){
            if(start==end){
                break;
            }
            if(target==nums[mid]){
                return mid;
            }
            if(nums[mid]>nums[end]){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid;
                }else{
                    start= mid+1;
                }
            }else{
                if(target>nums[mid] && target<=nums[end]){
                    start=mid+1;
                }else end=mid;
            }

            mid = start+(end-start)/2;

            System.out.println("start :"+start);
            System.out.println("end :"+end);
            System.out.println("mid :"+mid);

        }
        return target==nums[end]?end:-1;
        
    }
}
