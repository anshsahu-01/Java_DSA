import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int originalNum = sc.nextInt();
        int num = originalNum;
        int rev = 0;

        while(num != 0){
            int lastDigit = num%10;
            rev = (rev*10) + lastDigit;
            num /= 10;
        }

        System.out.println(originalNum == rev ? "Palindrome" : "Not Palindrome");
        sc.close();
    }
}

