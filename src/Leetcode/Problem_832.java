package LeetCode;

import java.util.Arrays;

public class Problem_832 {
    public static void main(String[] args) {
        int[][] arr = {{1,1,0},{0,0,1},{1,0,1}};
        int n = arr.length;
        int start = 0;
        int end = n-1;

        while(start != end){
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    int temp = arr[i][start];
                    arr[i][start] = arr[i][end];
                    arr[i][end] = temp;
                }
            }
            start++;
            end--;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                }
                else{
                    arr[i][j] = 1;
                }
            }

        }
        for (int i = 0; i < n; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }
    }
}
