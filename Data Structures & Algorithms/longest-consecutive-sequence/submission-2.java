class Solution {
    public int longestConsecutive(int[] nums) {
        //nums=[9,1,4,7,3,-1,0,5,8,-1,6]
        if(nums.length==0) return 0;
        HashSet<Integer> hset = new HashSet<>();
        for(int n:nums){
            hset.add(n);
        }
        List<Integer> list = new ArrayList<>();
        for(int n:hset){
            if(!hset.contains(n-1))
                list.add(n); // got starting points
        }
       // System.out.println(list);
        //System.out.println(hset);

        //[-1, 0, 1, 3, 4, 5, 6, 7, 8, 9]


        int count=1;
        int result=1;
        for(int start : list){
            count=1;
            //System.out.println("Start of : "+start);
            for(int i=1;i<=hset.size();i++){
                if(hset.contains(start+i)){
                    System.out.println(start+i);
                    count++;
                }else break;
                    
            }
            if(result<count){
                result = count;
            }
        }

        return result;

    }
}
