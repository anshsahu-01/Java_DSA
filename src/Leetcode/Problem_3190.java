package LeetCode;

//3190. Find Minimum Operations to Make All Elements Divisible by Three
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Hint
//You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//
//Return the minimum number of operations to make all elements of nums divisible by 3.
//
//
//
//Example 1:
//
//Input: nums = [1,2,3,4]
//
//Output: 3
//
//Explanation:
//
//All array elements can be made divisible by 3 using 3 operations:
//
//Subtract 1 from 1.
//Add 1 to 2.
//Subtract 1 from 4.
//Example 2:
//
//Input: nums = [3,6,9]
//
//Output: 0
//
//
//
//Constraints:
//
//        1 <= nums.length <= 50
//        1 <= nums[i] <= 50
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//292,058/322.2K
//Acceptance Rate
//90.6%

public class Problem_3190 {
    public int minimumOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 3 == 0){
                continue;
            }else if(nums[i] < 3){
                nums[i]++;
                count++;
            }else{
                nums[i]--;
                count++;
            }
        }
        return count;
    }
}
