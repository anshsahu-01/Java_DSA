package LeetCode;

//34. Find First and Last Position of Element in Sorted Array
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
//
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]
//
//
//Constraints:
//
//        0 <= nums.length <= 105
//        -109 <= nums[i] <= 109
//nums is a non-decreasing array.
//        -109 <= target <= 109
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//3,642,187/7.3M
//Acceptance Rate
//49.8%

public class Problem_34 {
    public int[] searchRange(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int[] ans = {-1,-1};

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans[0] = mid;
                end = mid -1;
            }else if(nums[mid] < target){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }

        start = 0;
        end = nums.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target){
                ans[1] = mid;
                start = mid + 1;
            }else if(nums[mid] < target){
                start = mid + 1;
            }else {
                end = mid - 1;
            }
        }
        return ans;
    }
}
