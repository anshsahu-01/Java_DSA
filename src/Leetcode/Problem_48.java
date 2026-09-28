package LeetCode;

import java.util.Arrays;

public class Problem_48 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},{4,5,6},{7,8,9}};
        int r = arr.length;
        int c = arr[0].length;

        // Transpose

        for (int i = 0; i < r; i++) {
            for (int j = i+1; j < c; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //Reverting

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c/2; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][c-1-j];
                arr[i][c-1-j] = temp;
            }
        }

        for (int i = 0; i < r; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
