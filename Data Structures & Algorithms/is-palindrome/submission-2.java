class Solution {
    public boolean isPalindrome(String s) {
        int start=0;
        int end = s.length()-1;
        while(start<=end){
            char left = Character.toLowerCase(s.charAt(start));
            char right = Character.toLowerCase(s.charAt(end));
            if(!isValid(left)){
                start++;
                continue;
            }
            if(!isValid(right)){
                end--;
                continue;
            }
            if(left!=right){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    private boolean isValid(char ch){
        return (ch>='a' && ch<='z')||(ch>='0' && ch<='9');
    }
}
