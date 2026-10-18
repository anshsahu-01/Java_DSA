package LeetCode;

//1582. Special Positions in a Binary Matrix
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Hint
//Given an m x n binary matrix mat, return the number of special positions in mat.
//
//        A position (i, j) is called special if mat[i][j] == 1 and all other elements in row i and column j are 0 (rows and columns are 0-indexed).
//
//
//
//Example 1:
//
//
//Input: mat = [[1,0,0],[0,0,1],[1,0,0]]
//Output: 1
//Explanation: (1, 2) is a special position because mat[1][2] == 1 and all other elements in row 1 and column 2 are 0.
//Example 2:
//
//
//Input: mat = [[1,0,0],[0,1,0],[0,0,1]]
//Output: 3
//Explanation: (0, 0), (1, 1) and (2, 2) are special positions.
//
//
//Constraints:
//
//m == mat.length
//n == mat[i].length
//1 <= m, n <= 100
//mat[i][j] is either 0 or 1.
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//296,530/406.8K
//Acceptance Rate
//72.9%

public class Problem_1582 {
    public int numSpecial(int[][] mat) {
        int count = 0;
        for(int i = 0; i < mat.length; i++){
            for(int j = 0; j < mat[0].length; j++){
                if(mat[i][j] == 1){
                    int row = 0;
                    int col = 0;

                    for(int k = 0; k < mat[0].length; k++){
                        row += mat[i][k];
                    }
                    for(int k = 0; k < mat.length; k++){
                        col += mat[k][j];
                    }
                    if(row == 1 && col == 1){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
