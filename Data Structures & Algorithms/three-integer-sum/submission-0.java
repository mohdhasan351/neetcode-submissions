class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> unique = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            HashMap<Integer,Integer> map = new HashMap<>();
            for(int j=i+1;j<nums.length;j++){
                int sum = nums[i]+nums[j];
                if(map.containsKey(-nums[j])){
                    int k = map.get(-nums[j]);
                    List<Integer> list =  Arrays.asList(nums[i],nums[j],k);
                    Collections.sort(list);
                    unique.add(list);
                }
                map.put(sum,nums[j]);
            }
        }
        return new ArrayList<>(unique);
    }
}
