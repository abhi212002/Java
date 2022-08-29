//  https://leetcode.com/problems/climbing-stairs/

class Solution {
    public int climbStairs(int n) {
//         if(n==0){
//             return 1;
//         }
//         if(n==1){
//             return 1;
            
//         }
//         if(n==2){
//             return 2;
//         }
//         return climbStairs(n-1)+climbStairs(n-2);
        
        //bottom-up
        int a[]=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<n+1;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];
    }
}
