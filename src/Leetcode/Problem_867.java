package LeetCode;

import java.util.Arrays;

public class Problem_867 {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int rows = arr.length;
        int cols = arr[0].length;
        int[][] ans = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                ans[j][i] = arr[i][j];
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(Arrays.toString(ans[i]));
        }

    }
}
