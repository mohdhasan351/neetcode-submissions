class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        //applying binary search in small array
        if(nums1.length>nums2.length){
            //reference swap
            int [] temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        int total = nums1.length+nums2.length;
        int half = total%2==0?total/2:(total+1)/2;
        int start = -1;
        int end = nums1.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            //A = nums1
            int leftHalf = mid;
            int rightHalf = mid+1;
            // half = 5 mid at 1 index means 2 element in left

            //B = nums2
            int leftReqFromB = (half-(mid+1))-1;
            int rightHalfFromB = leftReqFromB+1;
            // ADDED: handle empty partitions
            int aLeftMax = leftHalf>=0?nums1[leftHalf]:Integer.MIN_VALUE;
            int bLeftMax = leftReqFromB>=0?nums2[leftReqFromB]:Integer.MIN_VALUE;
            int aRightMin = rightHalf<nums1.length?nums1[rightHalf]:Integer.MAX_VALUE;
            int bRightMin = rightHalfFromB<nums2.length?nums2[rightHalfFromB]:Integer.MAX_VALUE;


            //valid partition return the result
            if(aLeftMax<=bRightMin && bLeftMax<=aRightMin){
                int leftMax = Math.max(aLeftMax,bLeftMax);
                int rightMin = Math.min(aRightMin,bRightMin);
                return total%2==0?(((double)leftMax+rightMin)/2):leftMax;
            }else{
                if(!(aLeftMax<=bRightMin)){
                    end = mid-1;
                }else{
                    start= mid+1;
                }
            }

            mid = start+(end-start)/2;
        }

        return -1;


    }
}
