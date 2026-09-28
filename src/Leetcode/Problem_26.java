package LeetCode;

public class Problem_26 {
    public int removeDuplicate(int[] arr){
        int count = 1;
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            if(arr[i] != arr[i+1]){
                arr[count] = arr[i];
                count++;
            }

        }
        return count;
    }
}
