package LeetCode;


// Given two strings s and t, return true if t is an anagram of s, and false otherwise.

 

// Example 1:

// Input: s = "anagram", t = "nagaram"

// Output: true

// Example 2:

// Input: s = "rat", t = "car"

// Output: false

 

// Constraints:

// 1 <= s.length, t.length <= 5 * 104
// s and t consist of lowercase English letters.
 

// Follow up: What if the inputs contain Unicode characters? How would you adapt your solution to such a case?

class Problem_242 {
    public boolean isAnagram(String s, String t) {
        int[] freq1 = new int[26];
        int n = freq1.length;
        int[] freq2 = new int[26];

        for(char ch : s.toCharArray()){
            freq1[ch - 'a']++;
        }
        for(char ch : t.toCharArray()){
            freq2[ch - 'a']++;
        }
        for(int i = 0; i < n; i++){
            if(freq1[i] != freq2[i]){
                return false;
            }
        }
        return true;
    }
}