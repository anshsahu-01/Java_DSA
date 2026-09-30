package LeetCode;


//Code
//        Testcase
//Testcase
//Test Result
//
//
//73. Set Matrix Zeroes
//        Solved
//Medium
//        Topics
//premium lock icon
//        Companies
//Hint
//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
//
//You must do it in place.
//
//
//
//        Example 1:
//
//
//Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
//Output: [[1,0,1],[0,0,0],[1,0,1]]
//Example 2:
//
//
//Input: matrix = [[0,1,2,0],[3,4,5,2],[1,3,1,5]]
//Output: [[0,0,0,0],[0,4,5,0],[0,3,1,0]]
//
//
//Constraints:
//
//m == matrix.length
//n == matrix[0].length
//1 <= m, n <= 200
//        -231 <= matrix[i][j] <= 231 - 1
//
//
//Follow up:
//
//A straightforward solution using O(mn) space is probably a bad idea.
//A simple improvement uses O(m + n) space, but still not the best solution.
//Could you devise a constant space solution?

public class Problem_73 {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        boolean[] zeroRow = new boolean[m];
        boolean[] zeroCol = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i] == arr[j]){
                    zeroRow[i] = true;
                    zeroCol[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(zeroRow[i] || zeroCol[j]){
                    arr[i][j] = 0;
                }
            }
        }
    }
}
