package LeetCode;

//719. Find K-th Smallest Pair Distance
//Solved
//        Hard
//Topics
//premium lock icon
//        Companies
//Hint
//The distance of a pair of integers a and b is defined as the absolute difference between a and b.
//
//Given an integer array nums and an integer k, return the kth smallest distance among all the pairs nums[i] and nums[j] where 0 <= i < j < nums.length.
//
//
//
//        Example 1:
//
//Input: nums = [1,3,1], k = 1
//Output: 0
//Explanation: Here are all the pairs:
//        (1,3) -> 2
//        (1,1) -> 0
//        (3,1) -> 2
//Then the 1st smallest distance pair is (1,1), and its distance is 0.
//Example 2:
//
//Input: nums = [1,1,1], k = 2
//Output: 0
//Example 3:
//
//Input: nums = [1,6,1], k = 3
//Output: 5
//
//
//Constraints:
//
//n == nums.length
//2 <= n <= 104
//        0 <= nums[i] <= 106
//        1 <= k <= n * (n - 1) / 2
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//221,720/472.6K
//Acceptance Rate
//46.9%

import java.util.Arrays;

public class Problem_719 {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int n = nums.length;

        int start = 0;
        int end = nums[n-1] - nums[0];

        while(start < end){
            int mid = start + (end - start) / 2;
            int count = 0;
            int j = 0;

            for(int i = 0; i < n; i++){
                while(nums[i] - nums[j] > mid){
                    j++;
                }
                count += i - j;
            }
            if(count < k){
                start = mid + 1;
            }else{
                end = mid;
            }
        }
        return start;
    }
}
