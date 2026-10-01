package LeetCode;

public class Problem_7 {
    public int reverse(int x){
        int rev = 0;
        while(x != 0){
            int lastDigit = x%10;
            if(rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE){
                return 0;
            }
            rev = (rev*10) + lastDigit;
            x /= 10;
        }
        return rev;
    }
}
