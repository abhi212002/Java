//  https://www.interviewbit.com/problems/repeat-and-missing-number-array/


public class Solution {
    public int[] repeatedNumber(final int[] A) {
      int ans[]=new int[2];
      int c[]=new int[A.length+1];
      for(int i=0;i<A.length+1;i++){
        c[A[i]]+=1;
      }
      
      for(int i=0;i<c.length;i++){
      if(c[i]==0)
        ans[0]=i;
      else if(c[i]==2)
        ans[1]=i;
      }
      
      return ans;
    }
}
