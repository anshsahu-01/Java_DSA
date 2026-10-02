package LeetCode;

//74. Search a 2D Matrix
//        Solved
//Medium
//        Topics
//premium lock icon
//        Companies
//You are given an m x n integer matrix matrix with the following two properties:
//
//Each row is sorted in non-decreasing order.
//The first integer of each row is greater than the last integer of the previous row.
//Given an integer target, return true if target is in matrix or false otherwise.
//
//You must write a solution in O(log(m * n)) time complexity.
//
//
//
//Example 1:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
//Output: true
//Example 2:
//
//
//Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
//Output: false
//
//
//Constraints:
//
//m == matrix.length
//n == matrix[i].length
//1 <= m, n <= 100
//        -104 <= matrix[i][j], target <= 104

public class Problem_74 {
    public boolean searchMatrix(int[][] arr, int target) {
        int m = arr.length;
        int n = arr[0].length;
        int start = 0;
        int end = m * n - 1;
        while(start <= end){
            int mid = start + (end - start)/2;
            int val = arr[mid/n][mid%n];
            if(val == target){
                return true;
            }else if(val < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return false;
    }
}
