package LeetCode;

public class Problem_2319 {
    public boolean checkXMatrix(int[][] arr) {
        int n = arr.length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                boolean isDiagonal = (i == j) || (i + j == n-1);
                if(isDiagonal){
                    if(arr[i][j] == 0){
                        return false;
                    }
                }else{
                    if(arr[i][j] != 0){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
