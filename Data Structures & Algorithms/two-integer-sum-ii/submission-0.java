class Solution {
    public int[] twoSum(int[] numbers, int target) {
        /* we need to return the array of index but from 1 not 0
          use hashmap with index as value and key as target-num[i]
          it means if we minus the value from target then we will
          know what value we needed next to get the target*/
          HashMap<Integer,Integer> map = new HashMap<>();
          for(int i=0;i<numbers.length;i++){
            if(map.containsKey(numbers[i]))
            return new int[]{map.get(numbers[i])+1,i+1};
            map.put(target-numbers[i],i);
          }
         
          return new int[]{-1,-1};
    }
}
