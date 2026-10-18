class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
        //7-3 = 4 we can iterate only 4 times to cover 7 elements

        int [] result = new int [nums.length-k+1];
        //priorityqueue max-heap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b)->(b-a));
        

        //initializing first window
        int [] window = new int [k];
        for(int i=0;i<k;i++){
            window[i] = nums[i];
            maxHeap.offer(nums[i]);
        }
        
        //initializing first result of the window

        // dont want to delete the max element because it can be
        //anywhere at any index not at start for shrinking
        result[0] = maxHeap.peek(); 
        for(int start=1,end=k;end<nums.length;end++,start++){
            maxHeap.remove(nums[start-1]);//shrink the window from left
            maxHeap.offer(nums[end]);// expand the windows from right
            result[start]=maxHeap.peek(); 
            
        }
        return result;
    }
}
