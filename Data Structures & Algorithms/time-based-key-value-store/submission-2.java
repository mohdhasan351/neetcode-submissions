class TimeMap {
    HashMap<String,ArrayList<HashMap<String,Integer>>> map;
    public TimeMap() {
       this.map = new HashMap<>(); 
    }
    
    public void set(String key, String value, int timestamp) {
        HashMap<String,Integer> valueTimeMap = new HashMap<>();
        valueTimeMap.put(value,timestamp);
        ArrayList<HashMap<String,Integer>> list=map.getOrDefault(key,new ArrayList<>());
        list.add(valueTimeMap);
        map.put(key,list);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        ArrayList<HashMap<String,Integer>> list = map.get(key);
        int start =0;
        int end = list.size()-1;
        int mid = start+(end-start)/2;
        //if even first timestamp is greater than target means we have 0 met conditons
        if(timestamp<list.get(0).entrySet().iterator().next().getValue()) return "";


//we are giving away the timestamp key which timestamp is <= targetTimestamp
        while(start<=end){
            
            int midTime = list.get(mid).entrySet().iterator().next().getValue();
            String midKey = list.get(mid).entrySet().iterator().next().getKey();

            if(timestamp==midTime) return list.get(mid).entrySet().iterator().next().getKey();

            if(timestamp>midTime){ 
                // midTime is valid, but a larger valid timestamp may exist.
                // Discard the left half (including mid) and search right.
                start = mid+1; 
            }else{
                 // midTime is too large, so mid and everything to its right
                 // cannot be the answer. Search left.
                end= mid-1; 
            }
            mid = start+(end-start)/2;
        }

        return list.get(end).entrySet().iterator().next().getKey();

    }
}
