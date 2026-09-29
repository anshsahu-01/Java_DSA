package LeetCode;

//14. Longest Common Prefix
//        Solved
//Easy
//        Topics
//premium lock icon
//        Companies
//Write a function to find the longest common prefix string amongst an array of strings.
//
//If there is no common prefix, return an empty string "".
//
//
//
//Example 1:
//
//Input: strs = ["flower","flow","flight"]
//Output: "fl"
//Example 2:
//
//Input: strs = ["dog","racecar","car"]
//Output: ""
//Explanation: There is no common prefix among the input strings.
//
//
//        Constraints:
//
//        1 <= strs.length <= 200
//        0 <= strs[i].length <= 200
//strs[i] consists of only lowercase English letters if it is non-empty.



public class Problem_14 {
    public String longestCommonPrefix(String[] arr) {
        String prefix = arr[0];
        for(String s : arr){
            while(!s.startsWith(prefix)){
                prefix = prefix.substring(0 , prefix.length() - 1);
            }
        }
        return prefix;
    }
}
