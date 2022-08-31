//  https://leetcode.com/problems/min-cost-climbing-stairs

class Solution {
    
    public int minCostClimbingStairs(int[] cost) {
        // for(int i=cost.length-3;i>=0;i--)
        //     cost[i]+=Math.min(cost[i+1],cost[i+2]);
        // return Math.min(cost[0],cost[1]);
        
      //optimized code
        int n=cost.length;
        int a[]=new int[n];
        if(n==0||n==1){
            return 0;
        }
        int p=cost[0];
        int q=cost[1];
        
        for(int i=2;i<n;i++){
            int c=cost[i]+Math.min(p,q);
            p=q;
            q=c;
        }
        return Math.min(p,q);
    }
}
