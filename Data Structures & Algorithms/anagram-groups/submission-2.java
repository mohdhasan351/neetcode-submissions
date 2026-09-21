class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // because array is checked by reference not value thats why we used string 
        HashMap<String,List<String>> hmap = new HashMap<>();
        for(String s :strs){
            int [] alpha = new int[26];
            for(char ch : s.toCharArray())
                alpha[ch-'a']++;
            String key = Arrays.toString(alpha); // because array is checked by mermory reference not value thats why we used string 

            List<String> list = hmap.getOrDefault(key,new ArrayList<>());
            list.add(s);
            hmap.put(key,list);
        }
        List<List<String>> result = new ArrayList<>();
        hmap.forEach((key,value)->{
            result.add(value);
        });

        return result;
    }
}
