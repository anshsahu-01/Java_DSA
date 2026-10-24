package LeetCode;

//2133. Check if Every Row and Column Contains All Numbers
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Hint
//An n x n matrix is valid if every row and every column contains all the integers from 1 to n (inclusive).
//
//Given an n x n integer matrix matrix, return true if the matrix is valid. Otherwise, return false.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,2,3],[3,1,2],[2,3,1]]
//Output: true
//Explanation: In this case, n = 3, and every row and column contains the numbers 1, 2, and 3.
//Hence, we return true.
//Example 2:
//
//
//Input: matrix = [[1,1,1],[1,2,3],[1,2,3]]
//Output: false
//Explanation: In this case, n = 3, but the first row and the first column do not contain the numbers 2 or 3.
//Hence, we return false.
//
//
//Constraints:
//
//n == matrix.length == matrix[i].length
//1 <= n <= 100
//        1 <= matrix[i][j] <= n
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//125,131/229.7K
//Acceptance Rate
//54.5%

import java.util.HashSet;

public class Problem_2133 {
    public boolean checkValid(int[][] matrix) {
        int n = matrix.length;

        for(int i = 0; i < n; i++){
            HashSet<Integer> set1 = new HashSet<>();
            HashSet<Integer> set2 = new HashSet<>();

            for(int j = 0; j < n; j++){
                set1.add(matrix[i][j]);
                set2.add(matrix[j][i]);
            }

            if(set1.size() != n || set2.size() != n){
                return false;
            }
        }
        return true;
    }
}
