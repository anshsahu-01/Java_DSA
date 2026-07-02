import java.util.Scanner;

public class Separate_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Number");
        int num = sc.nextInt();
        int sum = 0;

        while(num != 0){
            int lastDigit = num%10;
            sum += lastDigit;
            num /= 10;
        }
        System.out.println("The sum of all the digits is :" + sum);
    }
}
