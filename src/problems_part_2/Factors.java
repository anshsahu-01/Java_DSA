package problems_part_2;
import java.util.Scanner;

public class Factors {
    public static void factor(int num) {

        for (int i = 1; i <= num; i++) {
            if (num % i == 0){
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        factor(num);
        sc.close();
    }
}
