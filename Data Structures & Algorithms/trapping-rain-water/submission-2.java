class Solution {
    public int trap(int[] height) {
        int start=0;
        int end= height.length-1;
        int leftMax =0;
        int rightMax=0;
        int count =0;
        while(start<end){
            if(height[start]<=height[end]){
                leftMax = Math.max(leftMax,height[start]);
                count += leftMax-height[start];
                start++;
            }else{
                rightMax = Math.max(rightMax,height[end]);
                count += rightMax - height[end];
                end--;
            }
        }
        return count;
    }
}
