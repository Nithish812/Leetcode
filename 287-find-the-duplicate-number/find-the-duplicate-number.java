class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        Set<Integer> set = new HashSet<>();
for (int num : nums) {
    if (!set.add(num)) {
        res=num;
    }
}
        return res;
    }
}