package LeetCode;

//905. Sort Array By Parity
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Given an integer array nums, move all the even integers at the beginning of the array followed by all the odd integers.
//
//Return any array that satisfies this condition.
//
//
//
//        Example 1:
//
//Input: nums = [3,1,2,4]
//Output: [2,4,3,1]
//Explanation: The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
//Example 2:
//
//Input: nums = [0]
//Output: [0]
//
//
//Constraints:
//
//        1 <= nums.length <= 5000
//        0 <= nums[i] <= 5000
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//1,094,038/1.4M
//Acceptance Rate
//76.7%

public class Problem_905 {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        int[] ans = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                ans[start++] = nums[i];
            }else{
                ans[end--] = nums[i];
            }
        }
        return ans;
    }
}
