package LeetCode;

//633. Sum of Square Numbers
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
//
//
//
//Example 1:
//
//Input: c = 5
//Output: true
//Explanation: 1 * 1 + 2 * 2 = 5
//Example 2:
//
//Input: c = 3
//Output: false
//
//
//Constraints:
//
//        0 <= c <= 231 - 1

public class Problem_633 {
    public boolean judgeSquareSum(int c) {
        for(long i = 0; i*i <= c; i++){
            long rem = c - i * i;
            long j = (long) Math.sqrt(rem);
            if(j * j == rem) return true;
        }
        return false;
    }
}
