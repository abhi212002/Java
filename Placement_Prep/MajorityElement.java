//  https://leetcode.com/problems/majority-element
//  The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length/2;
   
        for(int i=0;i<nums.length;i++){
            int c=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]==nums[i])
                    c++;
            }//end of 2nd for loop
          
            if(c>n)
                return nums[i];
        }//end of 1st for loop
        return -1;
    }
}
