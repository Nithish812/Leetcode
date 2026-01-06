class Solution {
    public void duplicateZeros(int[] arr) {
       int n=arr.length;int j=0;
        int newarr[]=new int[n];
        for(int i=0;i<n;i++){
            int num=arr[i];
            if(j<n){
            if(num==0){
                newarr[j]=arr[i];
                newarr[j++]=0;
                j++;
            }
            else{
                 newarr[j]=arr[i];
            
                j++;
            }}
        }
        for(int i=0;i<n;i++){
            arr[i]=newarr[i];
        }
    }
}