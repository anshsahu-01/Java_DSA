package LeetCode;

import java.util.Arrays;

public class Problem_27 {
    public static void main(String[] args) {
        int num = 3;
        int[] arr = {3,2,2,3};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] == num){
                count++;
            }
        }
        while(start < end){
            if(arr[start] == num){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                end--;
            }else {
                start++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i] == num){
                arr[i] = 0;
            }
        }
        System.out.println(count);
        System.out.println(Arrays.toString(arr));
    }
}
