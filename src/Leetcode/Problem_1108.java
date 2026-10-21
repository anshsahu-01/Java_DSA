package LeetCode;

//1108. Defanging an IP Address
//Solved
//        Easy
//Topics
//premium lock icon
//        Companies
//Given a valid (IPv4) IP address, return a defanged version of that IP address.
//
//A defanged IP address replaces every period "." with "[.]".
//
//
//
//Example 1:
//
//Input: address = "1.1.1.1"
//Output: "1[.]1[.]1[.]1"
//Example 2:
//
//Input: address = "255.100.50.0"
//Output: "255[.]100[.]50[.]0"
//
//
//Constraints:
//
//The given address is a valid IPv4 address.
//
//Seen this question in a real interview before?
//        1/6
//Yes
//        No
//Accepted
//915,852/1M
//Acceptance Rate
//90.2%

public class Problem_1108 {
    public String defangIPaddr(String address) {
        char[] arr = address.toCharArray();
        StringBuilder ans = new StringBuilder(address.length());
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '.'){
                ans.append("[.]");
            }else{
                ans.append(arr[i]);
            }
        }
        return ans.toString();
    }
}
