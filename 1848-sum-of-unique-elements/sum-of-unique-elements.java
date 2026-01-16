class Solution {
    public int sumOfUnique(int[] nums) {
         Map<Integer,Integer> mp=new LinkedHashMap<>();
        for(int num:nums){
            if(mp.containsKey(num)){
                mp.put(num, mp.get(num)+1);
            }
            else{
                mp.put(num,1);
            }
        }
        int j=0;int [] countArr=new int[mp.size()];
        for(Map.Entry<Integer,Integer> count: mp.entrySet()){
            if(count.getValue()==1){
                countArr[j]=count.getKey();
                j++;
            }

        }
        int sum=0;
        for(int i=0;i< countArr.length;i++){
            sum+=countArr[i];
        }
        return  sum;
    }
}