class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap();
        char [] carr = s.toCharArray();
        int start=0;
        int count =0;
        //abba
        for(int i=0;i<carr.length;i++){
            if(map.containsKey(carr[i])){
                start = Math.max(map.get(carr[i])+1,start);
            }
            map.put(carr[i],i);
            
            if(count<(i-start+1))
            count = i-start+1;
        }
        return count;
    }
}
