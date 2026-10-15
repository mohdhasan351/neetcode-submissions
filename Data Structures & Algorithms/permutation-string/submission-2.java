class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.equals(s2)) return true;
        if(s1.length()>s2.length()) return false;
        int [] alpha1 = new int [26];
        int [] alpha2 = new int [26];
        for(int i=0;i<s1.length();i++){
            alpha1[s1.charAt(i)-'a']++;
            alpha2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(alpha1,alpha2)) return true;

        //we already calculated the first window now we just need to shrink by removing that letter count from array and expand by adding end of the window letter count to array
        for(int i=s1.length(),start=1;i<s2.length();i++,start++){
           char chs = s2.charAt(start-1);
           char che = s2.charAt(i);
           alpha2[chs-'a']--;
           alpha2[che-'a']++;
           if(Arrays.equals(alpha1,alpha2)) return true;
        }
        return false;
    }
}
