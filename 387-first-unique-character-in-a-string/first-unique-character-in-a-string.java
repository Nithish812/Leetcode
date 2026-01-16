class Solution {
    public int firstUniqChar(String s) {
        char unique='\u0000';
        char [] arr=s.toCharArray();
        Map<Character,Integer> mp=new LinkedHashMap<>();
        for(char ch:arr){
            if(mp.containsKey(ch)){
                mp.put(ch, mp.get(ch)+1);
            }
            else{
                mp.put(ch,1);
            }
        }

        for(Map.Entry<Character,Integer> count: mp.entrySet()){
            if(count.getValue()==1){
                unique=count.getKey();

                break;
            }
        }
        for(int i=0;i< arr.length;i++){
            if(unique==arr[i])
                return i;
        }
        return -1;
    }
}