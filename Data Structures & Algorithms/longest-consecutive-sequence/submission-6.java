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
        List<Integer> start_points = new ArrayList<>();
        for(int n : nums){
            if(!set.contains(n-1)){
                start_points.add(n);
            }
        }
        int count =1; // there will be at least 1 starting point
        int result =1;// there will be at least 1 starting point means one longest consecutive sequence
        for(int s_point : start_points){
            count =1;
            System.out.println(s_point);
            for(int i=1;i<set.size();i++){
                if(set.contains(s_point+i)){
                    count++;
                }else{
                    break;
                }
            }
            if(count>result) result = count;
        }

        return result;

    }
}
