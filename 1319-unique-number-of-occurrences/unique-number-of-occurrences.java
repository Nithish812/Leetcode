class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int num:arr){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        int j=0;int [] countArr=new int[mp.size()];
        for(Map.Entry<Integer,Integer> count: mp.entrySet()){
            countArr[j]=count.getValue();
            j++;
        }
        Set<Integer> s=new HashSet<>();
        for(int n:countArr){
            if(!s.add(n))
                return false;
        }
        return true;
    }
}