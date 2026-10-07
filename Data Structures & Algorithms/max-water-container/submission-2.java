class Solution {
    public int maxArea(int[] heights) {
        int start =0;
        int end =heights.length-1;
        int max=0;
        while(start<end){
            int area = Math.min(heights[start],heights[end])*(end-start);
            if(max<area)    max=area;
            if(heights[start]<heights[end]){ //when actual heights of start is less
                start++;
            }else if(heights[start]==heights[end]){
                start++;
                end--;
            }else{
                end--;
            }
        }
        return max;
    }
}
