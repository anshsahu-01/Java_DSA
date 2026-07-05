import java.util.Scanner;

public class Guess_The_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userNum = 0;
        int gameNum = (int)((Math.random()*100)+1);
        int attempt = 0;

        while(userNum != gameNum){
            System.out.println("Enter your guess number");
            userNum = sc.nextInt();
            attempt ++;
            if (userNum > gameNum){
                System.out.println("Plz guess a smaller number");
            }else if(userNum < gameNum){
                System.out.println("Plz guess a larger number");
            } else {
                System.out.println("Congratulations you won the game");
                System.out.println("You won in " + attempt + " attempts");
            }
        }
        sc.close();
    }
}
