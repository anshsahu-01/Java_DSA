import java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Marks :");
        float marks = sc.nextFloat();
        if (marks >= 90){
            System.out.println("Your grade is A+");
        }
        else if (marks >= 80 && marks <= 89){
            System.out.println("Your grade is A");
        }
        else if (marks >= 70 && marks <= 79){
            System.out.println("Your grade is B+");
        }
        else if (marks >= 60 && marks <= 69){
            System.out.println("Your grade is B");
        }
        else if (marks >= 50 && marks <= 59){
            System.out.println("Your grade is C+");
        }
        else if (marks >= 40 && marks <= 49){
            System.out.println("Your grade is C+");
        }
        else if (marks >= 33 && marks <= 39){
            System.out.println("Your grade is C+");
        }
        else{
            System.out.println("You Failed");
        }
    }
}
