class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        if(nums.length==0)return 0;
        
        //copy array to hashset for o(n) lookup
        for(int n :nums){
            set.add(n);
        }

        //finding starting points and adding it to new array
        //[1, 2, 3, 10, 11, 12]
        //starting points [1,10] we will check from it till nums.length

        //if num-1 is not present then it is starting points
        int result = 1;
        for(int n : set){
            if(!set.contains(n-1)){
                int count = 1;
                while(set.contains(n+count)){
                    count++;
                }
                result = Math.max(result,count);

            }
        }
        return result;
     

    }
}
