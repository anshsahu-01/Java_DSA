import java.util.Scanner;

public class Scanner_Input {
    public static void main(String[] args){
        System.out.println("Enter the integer value : ");
        Scanner sc = new Scanner(System.in);
        long l = sc.nextLong();
        System.out.println("Long Value"+ l);
    }
}
