import java.util.Scanner;

public class Prime_no_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();

        boolean isPrime = true;

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println("Number is prime");
        }else {
            System.out.println("Number is not prime");
        }
        sc.close();
    }
}
