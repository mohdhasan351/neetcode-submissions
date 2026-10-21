class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int targetRow = -1;
        for(int i=0;i<matrix.length;i++){
            int min = matrix[i][0]; //first
            int max = matrix[i][matrix[i].length-1];
            if(target>=min && target<=max){
                targetRow = i;
            }
        }
        if(targetRow==-1) return false;
        return binarySearch(matrix[targetRow],target);
    }

    static boolean binarySearch(int [] arr,int target){
        int start =0;
        int end = arr.length-1;
        int mid = start+(end-start/2);
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
