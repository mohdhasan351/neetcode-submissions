class Solution {
    public int findMin(int[] nums) {    
       boolean isRotated = nums[0]>nums[nums.length-1]?true:false;
       System.out.println(isRotated);
       //for single and not rotated
       if(!isRotated || nums.length==1) return nums[0];
       int point=-1;
       for(int i=nums.length-1;i>=0;i--){
        // 6 1 2 
        if(nums[i]<nums[i-1]){
            point = i;
            break;
        } 
       }
       return nums[point];
    }
}
