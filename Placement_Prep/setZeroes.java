//    Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//    https://leetcode.com/problems/set-matrix-zeroes/

class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        //int a[]=new int[m][2];
        Set<Integer> r = new HashSet<Integer>();
        Set<Integer> c = new HashSet<Integer>();
        int n = matrix[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if (matrix[i][j] == 0) {
                  r.add(i);
                  c.add(j);
                }
            }
        }
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(r.contains(i) || c.contains(j)) {
                  matrix[i][j] = 0;
                }
            }
        }
        
    }
}
