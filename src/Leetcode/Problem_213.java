package LeetCode;

//213. House Robber II
//        Solved
//Medium
//        Topics
//premium lock icon
//        Companies
//Hint
//You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
//
//Given an integer array nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
//
//
//
//        Example 1:
//
//Input: nums = [2,3,2]
//Output: 3
//Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
//        Example 2:
//
//Input: nums = [1,2,3,1]
//Output: 4
//Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
//Total amount you can rob = 1 + 3 = 4.
//Example 3:
//
//Input: nums = [1,2,3]
//Output: 3
//
//
//Constraints:
//
//        1 <= nums.length <= 100
//        0 <= nums[i] <= 1000
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//1,402,171/3.1M
//Acceptance Rate
//45.7%

public class Problem_213 {
    public int rob(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }

        int first = robLinear(nums, 0, nums.length-2);
        int second = robLinear(nums, 1, nums.length-1);

        return Math.max(first, second);
    }
    public int robLinear(int[] nums, int start, int end) {
        int prev1 = 0;
        int prev2 = 0;

        for(int i = start; i <= end; i++){
            int current = Math.max(prev1, prev2 + nums[i]);
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }
}
