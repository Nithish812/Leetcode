class Solution {
    public int lengthOfLastWord(String s) {
        s.trim();
      String [] arr=s.split(" ");
      int n=arr.length-1;
      String str=arr[n];
      int res=str.length();
      return res;
    }
}