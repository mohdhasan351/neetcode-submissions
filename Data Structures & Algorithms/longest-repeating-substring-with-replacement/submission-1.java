class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map = new HashMap<>();
        int start =0;
        char [] carr = s.toCharArray();
        int count=0;
        //A A A B A B B A A
        for(int i=0;i<carr.length;i++){
            map.put(carr[i],map.getOrDefault(carr[i],0)+1);
            int mostFreq = Collections.max(map.values());
            int windowLen = i-start+1;
            if(windowLen-mostFreq<=k){
                if(count<windowLen)
                count = windowLen;
            }else{
                map.put(carr[start],map.get(carr[start])-1);
                start++;
            }
        }
        return count;
    }
}
