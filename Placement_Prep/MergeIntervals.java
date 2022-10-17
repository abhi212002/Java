//  https://leetcode.com/problems/merge-intervals/
//  Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and 
//  return an array of the non-overlapping intervals that cover all the intervals in the input.

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> ans = new ArrayList<>();
		int[] a = intervals[0];
        
		ans.add(a);
        
		for (int[] i : intervals) {
			if (i[0] <= a[1])
				a[1] = Math.max(a[1], i[1]);
			else {                             
				a = i;
				ans.add(a);
			}
		}

		return ans.toArray(new int[ans.size()][]);
    }
}
