class Solution {
    public int majorityElement(int[] nums) {
      Map<Integer,Integer> map=new HashMap<>();
     int res=0,len=(int)nums.length/2;
    for(int num:nums){
      if(map.containsKey(num))
        map.put(num,map.get(num)+1);
      else
        map.put(num,1);
    }
    
    for(Map.Entry<Integer,Integer> entry:map.entrySet()){
      if(entry.getValue()>len){
        res=entry.getKey();
      }
    }
    return res;
    }
}