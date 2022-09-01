//  https://leetcode.com/problems/jump-game

class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int r=0;
        for(int i=0;i<n;i++){
            if(r<i){
                return false;
            }
            r=Math.max(r,nums[i]+i);
        }
        return true;
    }
}
