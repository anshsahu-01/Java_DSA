import java.util.Scanner;

public class Shopping_Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount :");
        int amount = sc.nextInt();
        if (amount < 0){
            System.out.println("Invalid Amount");
        }else if (amount < 5000){
            System.out.println("You got 0% discount");
            System.out.println("Total Discount :" + 0);
            System.out.println("You have to pay :" + amount);
        } else if (amount <= 7000) {
            System.out.println("You got 5% discount");
            System.out.println("Total Discount :" + (amount*5)/100);
            System.out.println("You have to pay :" + (amount - (amount*5)/100));
        }else if (amount <= 9000) {
            System.out.println("You got 10% discount");
            System.out.println("Total Discount :" + (amount*10)/100);
            System.out.println("You have to pay :" + (amount - (amount*10)/100));
        }else {
            System.out.println("You got 20% discount");
            System.out.println("Total Discount :" + (amount*20)/100);
            System.out.println("You have to pay :" + (amount - (amount*20)/100));
        }
        sc.close();
    }
}
