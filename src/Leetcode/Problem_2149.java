package LeetCode;


//Code
//        Testcase
//Testcase
//Test Result
//2149. Rearrange Array Elements by Sign
//        Solved
//Medium
//        Topics
//premium lock icon
//        Companies
//Hint
//You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
//
//You should return the array of nums such that the array follows the given conditions:
//
//Every consecutive pair of integers have opposite signs.
//For all integers with the same sign, the order in which they were present in nums is preserved.
//The rearranged array begins with a positive integer.
//Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
//
//
//
//        Example 1:
//
//Input: nums = [3,1,-2,-5,2,-4]
//Output: [3,-2,1,-5,2,-4]
//Explanation:
//The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
//The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
//Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.
//Example 2:
//
//Input: nums = [-1,1]
//Output: [1,-1]
//Explanation:
//        1 is the only positive integer and -1 the only negative integer in nums.
//So nums is rearranged to [1,-1].
//
//
//Constraints:
//
//        2 <= nums.length <= 2 * 105
//nums.length is even
//1 <= |nums[i]| <= 105
//nums consists of equal number of positive and negative integers.
//
//
//It is not required to do the modifications in-place.
//
//        Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//1,006,999/1.2M
//Acceptance Rate
//84.9%

public class Problem_2149 {
    public int[] rearrangeArray(int[] nums) {
        int[] odd = new int[nums.length / 2];
        int[] even = new int[nums.length / 2];
        int[] ans = new int[nums.length];
        int k = 0;
        int l = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] < 0){
                odd[k] = nums[i];
                k++;
            }else if(nums[i] > 0){
                even[l] = nums[i];
                l++;
            }
        }

        int j = 0;
        for(int i = 0; i < nums.length / 2; i++){
            ans[j] = even[i];
            ans[j+1] = odd[i];
            j += 2;
        }
        return ans;
    }
}
