class Solution {
    public boolean isPalindrome(String s) {
        String cleanText = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        int start=0;
        int end=cleanText.length()-1;
        while(start<=end){
            // char a = cleanText.charAt(start);
            // char b = cleanText.charAt(end);
            // System.out.println("Start a :"+a+" End b:"+b);
            if(cleanText.charAt(start)== cleanText.charAt(end)){
                start++;
                end--;
                // System.out.println("Start :"+start+" End:"+end);
            }else return false;
        }
        //System.out.println(cleanText);
        return true;
    }
}
