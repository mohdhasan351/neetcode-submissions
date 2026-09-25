class Solution {
    public int[] productExceptSelf(int[] nums) {
        //prefix product    //suffix product
        //[1,2,4,6]         //[1,2,4,6]
        //[1,2,8,48]        //[6,24,48,48]
        //a[i]*[i+1]        //a[size-i]*a[size-i-1]

        //prefix sum
        int mul=1;
        int[]prefixProduct = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            mul*=nums[i];
            prefixProduct[i]= mul;
        }
        mul=1;
        int[]suffixProduct = new int[nums.length];
        for(int i=nums.length-1;i>=0;i--){
            mul*=nums[i];
            suffixProduct[i] = mul; 
        }
        int[]result = new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int value = (i>0?prefixProduct[i-1]:1)*(i<nums.length-1?suffixProduct[i+1]:1);
            result[i]=value;
        }
        //System.out.println(Arrays.toString(result));
        //System.out.println(Arrays.toString(prefixProduct));
        //System.out.println(Arrays.toString(suffixProduct));
        return result;
    }
}  
