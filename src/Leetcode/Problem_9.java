package LeetCode;

public class Problem_9 {
    public boolean isPalindrome(int x){
        int num = x;
        int rev = 0;

        if (x < 0){
            return  false;
        }
        while(num != 0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num /= 10;
        }
        if(x == rev){
            return true;
        }else {
            return false;
        }
    }
}
