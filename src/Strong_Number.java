import java.util.Scanner;

public class Strong_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int originalNum = num;
        int factSum = 0;

        while (num != 0){
            int lastDigit = num % 10;
            int fact = 1;
            for (int i = 1; i<=lastDigit; i++){
                fact = fact*i;
            }
            factSum += fact;
            num /= 10;
        }
        System.out.println(factSum == originalNum ? "Strong Number" : "Not a Strong Number");
    }
}
