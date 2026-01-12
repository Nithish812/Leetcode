class Solution {
    public int singleNonDuplicate(int[] nums) {
       int max=0,res=0;
    for(int i=0;i<nums.length;i++){
      max=Math.max(nums[i],max);
    }
    int [] count=new int[max+1];
    for (int num : nums) {
            count[num]++;
           
    }
    for(int i=0;i<count.length;i++){
      if(count[i]==1){
        res=i;
      }
    }
    return res;
    }
}