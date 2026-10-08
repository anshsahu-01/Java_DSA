package LeetCode;

//85. Maximal Rectangle
//Solved
//        Hard
//Topics
//premium lock icon
//        Companies
//Given a rows x cols binary matrix filled with 0's and 1's, find the largest rectangle containing only 1's and return its area.
//
//
//
//Example 1:
//
//
//Input: matrix = [["1","0","1","0","0"],["1","0","1","1","1"],["1","1","1","1","1"],["1","0","0","1","0"]]
//Output: 6
//Explanation: The maximal rectangle is shown in the above picture.
//        Example 2:
//
//Input: matrix = [["0"]]
//Output: 0
//Example 3:
//
//Input: matrix = [["1"]]
//Output: 1
//
//
//Constraints:
//
//rows == matrix.length
//cols == matrix[i].length
//1 <= rows, cols <= 200
//matrix[i][j] is '0' or '1'.
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//879,829/1.5M
//Acceptance Rate
//60.0%

public class Problem_85 {
    public int maximalRectangle(char[][] arr) {
        int max = 0;
        int rows = arr.length;
        int cols = arr[0].length;

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < arr[0].length; j++){
                if(arr[i][j] == '1'){
                    int minWidth = cols;

                    for(int k = i; k < rows; k++){
                        int count = 0;
                        while(j + count < cols && arr[k][j + count] == '1'){
                            count++;
                        }
                        minWidth = Math.min(minWidth, count);
                        if(minWidth == 0){
                            break;
                        }
                        max = Math.max(max, minWidth * (k - i + 1));
                    }
                }
            }
        }
        return max;
    }
}
