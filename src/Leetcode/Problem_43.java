package LeetCode;

//43. Multiply Strings
//Solved
//        Medium
//Topics
//premium lock icon
//        Companies
//Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.
//
//Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.
//
//
//
//Example 1:
//
//Input: num1 = "2", num2 = "3"
//Output: "6"
//Example 2:
//
//Input: num1 = "123", num2 = "456"
//Output: "56088"
//
//
//Constraints:
//
//        1 <= num1.length, num2.length <= 200
//num1 and num2 consist of digits only.
//Both num1 and num2 do not contain any leading zero, except the number 0 itself.
//
//        Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//1,256,389/2.8M
//Acceptance Rate
//44.9%

public class Problem_43 {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0")){
            return "0";
        }

        int m = num1.length();
        int n = num2.length();

        int[] arr = new int[m+n];

        for(int i = m-1; i >= 0; i--){
            for(int j = n-1; j >= 0; j--){
                int a = num1.charAt(i) - '0';
                int b = num2.charAt(j) - '0';

                int product = a * b;

                int sum = product + arr[i + j + 1];
                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }
        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0 && i == 0){
                continue;
            }
            ans.append(arr[i]);
        }

        return ans.toString();
    }
}
