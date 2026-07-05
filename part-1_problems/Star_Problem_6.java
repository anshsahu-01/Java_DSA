import java.util.Scanner;

public class Star_Problem_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your number");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < 2*num ; j++) {
                if (i+j == num + 1 || i == j ){
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
