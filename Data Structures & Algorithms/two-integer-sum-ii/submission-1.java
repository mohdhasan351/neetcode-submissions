class Solution {
    public int[] twoSum(int[] numbers, int target) {
    //we can use two pointers to solve it O(N)time and O(1) space
    int start=0;
    int end= numbers.length-1;
    while(start<end){
        int sum = numbers[start]+numbers[end];
        //Input: numbers = [1,2,3,4], target = 3
        // 1+4 = 5 means we can have 1 but not 4 because it is
        //sorted so we know we need to exclude last big and
        //compare again untill we get the solution so we do end--
        if(sum==target) return new int[]{start+1,end+1};
        if(sum>target) end--;
        else start++;
    }
          return new int[]{-1,-1};
    }
}
