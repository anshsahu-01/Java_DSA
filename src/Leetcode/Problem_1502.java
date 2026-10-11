package LeetCode;

//1502. Can Make Arithmetic Progression From Sequence
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Hint
//A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements is the same.
//
//Given an array of numbers arr, return true if the array can be rearranged to form an arithmetic progression. Otherwise, return false.
//
//
//
//Example 1:
//
//Input: arr = [3,5,1]
//Output: true
//Explanation: We can reorder the elements as [1,3,5] or [5,3,1] with differences 2 and -2 respectively, between each consecutive elements.
//Example 2:
//
//Input: arr = [1,2,4]
//Output: false
//Explanation: There is no way to reorder the elements to obtain an arithmetic progression.
//
//
//        Constraints:
//
//        2 <= arr.length <= 1000
//        -106 <= arr[i] <= 106
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//376,571/548.5K
//Acceptance Rate
//68.7%

import java.util.Arrays;

public class Problem_1502 {
    public boolean canMakeArithmeticProgression(int[] arr) {
        Arrays.sort(arr);
        if(arr.length <= 2){
            return true;
        }
        for(int i = 0; i < arr.length - 2; i++){
            if(arr[i+1] - arr[i] != arr[i+2] - arr[i+1]){
                return false;
            }
        }
        return true;
    }
}
