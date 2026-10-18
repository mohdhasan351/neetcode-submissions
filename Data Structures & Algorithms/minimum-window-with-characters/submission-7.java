class Solution {
    public String minWindow(String s, String t) {
        if(t.length()>s.length()) return "";
        HashMap<Character,Integer> tmap = new HashMap<>();
        HashMap<Character,Integer> smap = new HashMap<>();
        for(char ch : t.toCharArray())
            tmap.put(ch,tmap.getOrDefault(ch,0)+1);

        int start=0;
        int windLen = 0;
        int len = Integer.MAX_VALUE;
        int have =0;
        int bestStart=0;
        String result = "";
        int c = tmap.size();
        for(int end = 0;end<s.length();end++){
            char ch = s.charAt(end);
            //when both char or t and s matches
            if(tmap.getOrDefault(ch,0)>0){ 
                smap.put(ch,smap.getOrDefault(ch,0)+1);
                if(smap.get(ch).equals(tmap.get(ch))){
                    have++;
                }
            }
            //we found the valid window
            if(have==c){
                //shrink it untill valid 
                while(smap.getOrDefault(s.charAt(start),0)==0 || 
                (tmap.getOrDefault(s.charAt(start),0)<smap.getOrDefault(s.charAt(start),0))
                ){
                    if(smap.containsKey(s.charAt(start))){
                        int freq = smap.getOrDefault(s.charAt(start),0);
                        freq = freq > 0 ? freq - 1 : 0;
                        smap.put(s.charAt(start), freq);
                    }
                    start++;
                }
                windLen = end-start+1;
                
                if(len>windLen){
                    len = windLen;
                    bestStart= start;
                }
                    int freq = smap.getOrDefault(s.charAt(start),0);
                    freq = freq>0?freq-1:0;
                    //removing freq and making window invalid again
                    smap.put(s.charAt(start),freq);
                    have--;
                    start++;            
                

            }
        }
        return len==Integer.MAX_VALUE?"":s.substring(bestStart,bestStart+len);
    }
}
