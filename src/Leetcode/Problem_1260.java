package LeetCode;

//1260. Shift 2D Grid
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Hint
//Given a 2D grid of size m x n and an integer k. You need to shift the grid k times.
//
//In one shift operation:
//
//Element at grid[i][j] moves to grid[i][j + 1].
//Element at grid[i][n - 1] moves to grid[i + 1][0].
//Element at grid[m - 1][n - 1] moves to grid[0][0].
//Return the 2D grid after applying shift operation k times.
//
//
//
//        Example 1:
//
//
//Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
//Output: [[9,1,2],[3,4,5],[6,7,8]]
//Example 2:
//
//
//Input: grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
//Output: [[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
//Example 3:
//
//Input: grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
//Output: [[1,2,3],[4,5,6],[7,8,9]]
//
//
//Constraints:
//
//m == grid.length
//n == grid[i].length
//1 <= m <= 50
//        1 <= n <= 50
//        -1000 <= grid[i][j] <= 1000
//        0 <= k <= 100
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//254,814/341.8K
//Acceptance Rate
//74.5%

import java.util.*;

public class Problem_1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;

        for(int x = 0; x < k; x++) {
            int last = grid[m - 1][n - 1];

            for(int i = m - 1; i >= 0; i--) {
                for(int j = n - 1; j >= 0; j--) {
                    if(i == 0 && j == 0) {
                        continue;
                    }

                    if(j > 0) {
                        grid[i][j] = grid[i][j - 1];
                    } else {
                        grid[i][j] = grid[i - 1][n - 1];
                    }
                }
            }

            grid[0][0] = last;
        }

        List<List<Integer>> ans = new ArrayList<>();

        for(int i = 0; i < m; i++) {
            List<Integer> row = new ArrayList<>();

            for(int j = 0; j < n; j++) {
                row.add(grid[i][j]);
            }

            ans.add(row);
        }

        return ans;
    }
}
