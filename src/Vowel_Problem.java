import java.util.Scanner;

public class Vowel_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet :");
        char ch = sc.next().charAt(0);

        switch (ch){
            case'a', 'e', 'i', 'o' ,'u' ->
                System.out.println("This is a vowel");
            default ->
                System.out.println("This is a consonant");
        }
    }
}
