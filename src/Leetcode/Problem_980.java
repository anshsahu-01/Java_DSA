package LeetCode;

//980. Unique Paths III
//        Solved
//Hard
//        Topics
//premium lock icon
//        Companies
//You are given an m x n integer array grid where grid[i][j] could be:
//
//        1 representing the starting square. There is exactly one starting square.
//        2 representing the ending square. There is exactly one ending square.
//        0 representing empty squares we can walk over.
//-1 representing obstacles that we cannot walk over.
//Return the number of 4-directional walks from the starting square to the ending square, that walk over every non-obstacle square exactly once.
//
//
//
//Example 1:
//
//
//Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,2,-1]]
//Output: 2
//Explanation: We have the following two paths:
//        1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2)
//        2. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2)
//Example 2:
//
//
//Input: grid = [[1,0,0,0],[0,0,0,0],[0,0,0,2]]
//Output: 4
//Explanation: We have the following four paths:
//        1. (0,0),(0,1),(0,2),(0,3),(1,3),(1,2),(1,1),(1,0),(2,0),(2,1),(2,2),(2,3)
//        2. (0,0),(0,1),(1,1),(1,0),(2,0),(2,1),(2,2),(1,2),(0,2),(0,3),(1,3),(2,3)
//        3. (0,0),(1,0),(2,0),(2,1),(2,2),(1,2),(1,1),(0,1),(0,2),(0,3),(1,3),(2,3)
//        4. (0,0),(1,0),(2,0),(2,1),(1,1),(0,1),(0,2),(0,3),(1,3),(1,2),(2,2),(2,3)
//Example 3:
//
//
//Input: grid = [[0,1],[2,0]]
//Output: 0
//Explanation: There is no path that walks over every empty square exactly once.
//Note that the starting and ending square can be anywhere in the grid.
//
//
//        Constraints:
//
//m == grid.length
//n == grid[i].length
//1 <= m, n <= 20
//        1 <= m * n <= 20
//        -1 <= grid[i][j] <= 2
//There is exactly one starting cell and one ending cell.
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//274,370/330.5K
//Acceptance Rate
//83.0%

public class Problem_980 {
    public int uniquePathsIII(int[][] grid) {
        int sx = 0;
        int sy = 0;
        int zero = 0;

        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 0){
                    zero++;
                }else if(grid[i][j] == 1){
                    sx = i;
                    sy = j;
                }
            }
        }
        return dfs(grid, sx, sy, zero);
    }

    public int dfs(int[][] grid, int x, int y, int zero){
        if(x >= grid.length || y >= grid[0].length || x < 0 || y < 0 || grid[x][y] == -1){
            return 0;
        }
        if(grid[x][y] == 2){
            return zero == -1 ? 1 : 0;
        }
        int original = grid[x][y];
        grid[x][y] = -1;
        zero--;

        int totalPaths = dfs(grid, x + 1, y, zero) + dfs(grid, x - 1, y, zero) + dfs(grid, x, y+ 1, zero) + dfs(grid, x, y - 1, zero);
        grid[x][y] = original;

        return totalPaths;
    }
}
