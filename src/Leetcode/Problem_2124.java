package LeetCode;

//2124. Check if All A's Appears Before All B's
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Hint
//Given a string s consisting of only the characters 'a' and 'b', return true if every 'a' appears before every 'b' in the string. Otherwise, return false.
//
//
//
//Example 1:
//
//Input: s = "aaabbb"
//Output: true
//Explanation:
//The 'a's are at indices 0, 1, and 2, while the 'b's are at indices 3, 4, and 5.
//Hence, every 'a' appears before every 'b' and we return true.
//Example 2:
//
//Input: s = "abab"
//Output: false
//Explanation:
//There is an 'a' at index 2 and a 'b' at index 1.
//Hence, not every 'a' appears before every 'b' and we return false.
//Example 3:
//
//Input: s = "bbb"
//Output: true
//Explanation:
//There are no 'a's, hence, every 'a' appears before every 'b' and we return true.
//
//
//Constraints:
//
//        1 <= s.length <= 100
//s[i] is either 'a' or 'b'.
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//135,930/185.1K
//Acceptance Rate
//73.4%

public class Problem_2124 {
    public boolean checkString(String s) {
        char[] arr = s.toCharArray();

        for(int i = 0; i < arr.length - 1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}
