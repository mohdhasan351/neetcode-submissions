class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int start = 1;
        int end = piles[piles.length-1];;
        int mid = start+(end-start)/2;
        int totalHours = calculateTotalHours(piles,mid);
        //System.out.println(totalHours);
        /**
        piles=[1,2,3,4]
        h=9
        **/
        while(start<=end){
            // System.out.println("mid "+mid);
            // System.out.println("totalHours "+totalHours);
            if(totalHours<=h){
                end=mid-1;
            }else{
                start=mid+1;
            }
            mid=start+(end-start)/2;
            totalHours = calculateTotalHours(piles,mid);
        }
        
        return mid;
    }

    static int calculateTotalHours(int [] arr, int k){
        int totalHours=0;
        for(int n : arr){
            totalHours += (n+k-1)/k;
        }
        return totalHours;
    }
}
