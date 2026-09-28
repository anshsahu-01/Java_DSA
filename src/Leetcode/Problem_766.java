package LeetCode;

//Input: matrix = [[1,2,3,4],[5,1,2,3],[9,5,1,2]]
//Output: true
//Explanation:
//In the above grid, the diagonals are:
//        "[9]", "[5, 5]", "[1, 1, 1]", "[2, 2, 2]", "[3, 3]", "[4]".
//In each diagonal all elements are the same, so the answer is True.


//Input: matrix = [[1,2],[2,2]]
//Output: false
//Explanation:
//The diagonal "[1, 2]" has different elements.


public class Problem_766 {
    public boolean isToepLitzMatrix(int[][] arr){
        int r = arr.length;
        int c = arr[0].length;

        for (int i = 0; i < r-1; i++) {
            for (int j = 0; j < c-1; j++) {
                if(arr[i][j] != arr[i+1][j+1]){
                    return false;
                }
            }
        }
        return true;
    }
}
