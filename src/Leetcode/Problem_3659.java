package LeetCode;

//3659. Partition Array Into K-Distinct Groups
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Hint
//You are given an integer array nums and an integer k.
//
//Your task is to determine whether it is possible to partition all elements of nums into one or more groups such that:
//
//Each group contains exactly k elements.
//All elements in each group are distinct.
//Each element in nums must be assigned to exactly one group.
//        Return true if such a partition is possible, otherwise return false.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4], k = 2
//
//Output: true
//
//Explanation:
//
//One possible partition is to have 2 groups:
//
//Group 1: [1, 2]
//Group 2: [3, 4]
//Each group contains k = 2 distinct elements, and all elements are used exactly once.
//
//Example 2:
//
//Input: nums = [3,5,2,2], k = 2
//
//Output: true
//
//Explanation:
//
//One possible partition is to have 2 groups:
//
//Group 1: [2, 3]
//Group 2: [2, 5]
//Each group contains k = 2 distinct elements, and all elements are used exactly once.
//
//Example 3:
//
//Input: nums = [1,5,2,3], k = 3
//
//Output: false
//
//Explanation:
//
//We cannot form groups of k = 3 distinct elements using all values exactly once.
//
//
//
//        Constraints:
//
//        1 <= nums.length <= 105
//        1 <= nums[i] <= 105
//        ​​​​​​​1 <= k <= nums.length
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//56,398/120.2K
//Acceptance Rate
//46.9%

import java.util.Arrays;

public class Problem_3659 {
    public boolean partitionArray(int[] nums, int k) {
        if(nums.length % k != 0){
            return false;
        }
        Arrays.sort(nums);
        int groups = nums.length / k;
        int count = 1;

        for(int i = 1; i < nums.length; i++){
            if(nums[i] == nums[i - 1]){
                count++;
                if(count > groups){
                    return false;
                }
            }else{
                count = 1;
            }
        }
        return true;
    }
}
