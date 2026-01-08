class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> t=new HashSet<>();int n=0;
        if(nums1.length>nums2.length){
            n=nums1.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<nums2.length;j++){
                if(nums2[j]==nums1[i]){
                    t.add(nums2[j]);
                    
                }}
            }
        }else{
            n=nums2.length;
            for(int i=0;i<n;i++){
                for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j] && j<nums1.length){
                    t.add(nums1[j]);
                    
                }}
            }
        }
        int[] arr = new int[t.size()];
        int l = 0;

        for (int val : t) {
            arr[l++] = val;
        }
        return arr;
    }
}