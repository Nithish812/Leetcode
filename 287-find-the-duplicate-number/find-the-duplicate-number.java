class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num,mp.get(num)+1);
            }else{
                mp.put(num,1);
            }
        }
        for(Map.Entry<Integer,Integer> set:mp.entrySet()){
            if(set.getValue()>1){
                res=set.getKey();
            }
        }
        return res;
    }
}