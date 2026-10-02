class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            int start = i+1;
            int end = nums.length-1;
            while(start<end){
                int sum = nums[start]+nums[end]+nums[i];
                if(sum==0){
                    List<Integer> list= Arrays.asList(nums[start],nums[end],nums[i]);
                    //Collections.sort(list);
                    set.add(list);
                    start++;
                    end--;
                }
                if(sum>0){
                    end--;
                }else if(sum<0) start++;
            }
        }
        return new ArrayList<>(set);
    }
}
