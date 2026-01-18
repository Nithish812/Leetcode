class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
          List<Integer> al=new ArrayList<>();
      for(int i=0;i<m;i++){
          al.add(nums1[i]);
      }
       for (int num:nums2){
          al.add(num);
       }
       Collections.sort(al);
       int i=0;
       Iterator itr= al.iterator();
       while(itr.hasNext()){
           nums1[i]= (int) itr.next();
           i++;
       }
      
       
    }
}