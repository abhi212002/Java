//  https://leetcode.com/problems/find-the-duplicate-number/


class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> a = new HashSet<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (!a.add(nums[i])) {
                return nums[i];
            }
        }

        return 0;
    }
}
