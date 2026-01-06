class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
         int m=nums1.length;
        int n=nums2.length;
        
        int [] res=new int[m+n];
        
        for(int i=0;i<m;i++)
            res[i]=nums1[i];
            
        for(int j=0;j<n;j++)
            res[m+j]=nums2[j];

        Arrays.sort(res);
       int len=res.length;
       double median;int k=len/2;
       if(len%2==0){
           int mid1=res[k-1];
           int mid2=res[k];
           median=(mid1+mid2)/2.0;
           
       }
       else{
           median=res[k];
           
       }
       return median;
    }
}