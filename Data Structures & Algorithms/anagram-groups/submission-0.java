class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //keys sorted strings
        HashMap<String,List<String>> map = new HashMap<>();
        for(String s: strs){
              char[] charr = s.toCharArray();
             Arrays.sort(charr);
            String sorted = new String(charr);
            // if(map.containsKey(sorted)){
            //    map.get(sorted).add(s);
            // }else {
            //      List<String> list = new ArrayList<>();
            //     list.add(s);
            //     map.put(sorted,list);
            // }
           List<String> list = map.getOrDefault(sorted, new ArrayList<>());
           list.add(s);
           map.put(sorted, list);
        }
        List<List<String>> result = new ArrayList<>();
        
        map.forEach((key,value)->{
            result.add(value);
        });
        return result;
    }
}
