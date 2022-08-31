//  https://leetcode.com/problems/house-robber

class Solution {
    public int rob(int[] nums) {
        int a=0,b=0;
        for(int i=0;i<nums.length;i++){
            int c=a;
            a=Math.max(a,b+nums[i]);
            b=c;
        }
        return a;
    }
}
