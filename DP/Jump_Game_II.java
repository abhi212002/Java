//  https://leetcode.com/problems/jump-game-ii

class Solution {
    public int jump(int[] nums) {
        // int n=nums.length;
        // int[]dp=new int[n];
        // Arrays.fill(dp,Integer.MAX_VALUE);
        // dp[n-1]=0;
        // for(int i=n-2;i>=0;i--){
        //     int a=Integer.MAX_VALUE;
        //     for(int j=i+1;j<=Math.min(n-1,i+nums[i]);j++){
        //         a=Math.min(a,dp[j]);
        //     }
        //     if(a!=Integer.MAX_VALUE){
        //         dp[i]=a+1;
        //     }
        // }
        // return dp[0];
        
        int j=0,b=0,e=0,f=0;
        for(int i=0;i<nums.length-1;i++){
            f=Math.max(f,nums[i]+i);
            if(i==e){
                j++;
                e=f;
            }
        }
        return j;
    }
}
