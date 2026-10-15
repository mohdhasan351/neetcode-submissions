class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int [] alpha1 = new int [26];
        int [] alpha2 = new int [26];
        for(int i=0;i<s1.length();i++){
            alpha1[s1.charAt(i)-'a']++;
        }
        if(s1.length()>s2.length()) return false;
        for(int i=s1.length()-1,start=0;i<s2.length();i++,start++){
            String str = s2.substring(start,i+1);
            for(int j=0;j<str.length();j++){
                alpha2[str.charAt(j)-'a']++;
            }
            if(Arrays.equals(alpha1,alpha2)) return true;
            else Arrays.fill(alpha2,0);
        }
        return false;
    }
}
