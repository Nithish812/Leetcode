class Solution {
    public String triangleType(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> d=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            d.add(nums[i]);
        }
        if(d.size()==1){
            return "equilateral";
        }
        else if(d.size()==2 && nums[0]+nums[1]>nums[2]){
            return "isosceles";
        }
        else if(d.size()==3 && nums[0]+nums[1]>nums[2]){
            return "scalene";
        }
        return "none";
    }
}