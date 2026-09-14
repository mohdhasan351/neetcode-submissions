class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                return new int []{map.get(nums[i]),i};
            }
            int difference = target-nums[i];
            map.put(difference,i);
        }
        System.out.println(map);
        return new int[2];
    }
}
