class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int count =0;
        char [] carr = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<carr.length;i++){
            while(!set.add(carr[i])){
                if(count<set.size()){
                    count = set.size();
                }
                // to make it continuous
                set.remove(carr[start]);
                start++;
            }
        }
        return count>set.size()?count:set.size();
    }
}
