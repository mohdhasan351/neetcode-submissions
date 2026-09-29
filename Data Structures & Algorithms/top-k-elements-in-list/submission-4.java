class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
       // int [] freq = new int[nums.lenght+1]; // it represent freq of numbers 0 index means 0 freq which is not possible
        List<Integer> [] freq = new ArrayList[nums.length+1]; // it is array each index have list inside it It is an array, but specifically an array of List<Integer>.
        //applicable when two elements have equal frequencies

        map.forEach((key,count)->{
            List<Integer> list;
            if(freq[count]==null){
                list = new ArrayList<>();
            }else{
                list = freq[count];
            }
            list.add(key);
            freq[count]=list;
        });

        int [] result = new int[k];
        int index=0;
        for(int i=freq.length-1;i>0;i--){
            if(freq[i]!=null){
                List<Integer> list = freq[i];
                for(int j=0;j<list.size();j++){
                    result[index] = list.get(j);
                    index++;

                    if(index==k) return result;
                }
            }
        }

        return result;
    }
}
