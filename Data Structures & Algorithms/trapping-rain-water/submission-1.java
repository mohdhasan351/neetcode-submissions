class Solution {
    public int trap(int[] height) {
        int count =0;
        int maxl=0;
        //suffix max element
        //0,2,0,3,1,0,1,3,2,1 
        int[] maxr= new int[height.length];
        int preval = 0;
       // maxr[height.length-1] = height[height.length-1]
        for(int i=height.length-1;i>0;i--){
            maxr[i]=Math.max(height[i],preval);
            preval = maxr[i];
        }
        for(int i=0;i<height.length;i++){
            if(maxl<height[i])
                maxl= height[i];
            // for(int j=i+1;j<height.length;j++){
            //     if(maxr<height[j]) maxr = height[j];
            // }
            int water = Math.min(maxl,maxr[i])-height[i];
            if(water>0) count+=water;
        }
        return count;
    }
}
