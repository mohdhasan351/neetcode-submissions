class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;
        int start = 0;
        int end = matrix.length-1;
        int mid = start + (end-start)/2;
        while(start<=end){
            int min = matrix[mid][0];
            int max = matrix[mid][matrix[mid].length-1];
            if(target>=min && target<=max){
                targetRow = mid;
                break;
            }
             
            if(target>max){
                start  = mid+1;
            }else{
                end = mid-1;
            }
            mid = start+(end-start)/2;
        }
        if(targetRow==-1) return false;
        return binarySearch(matrix[targetRow],target);
    }

    static boolean binarySearch(int [] arr,int target){
        int start =0;
        int end = arr.length-1;
        int mid = start+(end-start)/2;
        while(start<=end){
            if(target==arr[mid]) return true;
            if(target>arr[mid]){
                start=mid+1;
            }else{
                end= mid-1;
            }
            mid = start+((end-start)/2);
        }
        return false;
    }
}
