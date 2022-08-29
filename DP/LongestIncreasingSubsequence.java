// https://leetcode.com/problems/longest-increasing-subsequence

class Solution {
    public int lengthOfLIS(int[] nums) {
        int a[]=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            a[i]=1;
        }
        int ml=0;
        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]&& 1+a[j]>a[i]){
                    a[i]=a[j]+1;
                    ml=Math.max(ml,a[i]);
                }
            }
        }
        return ml; 
    }
}
