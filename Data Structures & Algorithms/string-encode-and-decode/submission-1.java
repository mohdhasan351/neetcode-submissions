class Solution {

    public String encode(List<String> strs) {
        //5#Hello5#World
        String result="";
        for(String s: strs){
            result+=s.length()+"#"+s;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        while(str.length()>0){
            int index = str.indexOf("#");
            int num = Integer.parseInt(str.substring(0,index));
            //System.out.println("Beginning:"+(index+1)+" END:"+(num+1));
            result.add(str.substring(index+1,num+index+1));
            str = str.substring(num+index+1);
        }
   
        return result;
    }
}
