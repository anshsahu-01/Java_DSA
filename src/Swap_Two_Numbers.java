public class Swap_Two_Numbers {
    public static void main(String[] args){
        int a = 10;
        System.out.println("Initially a is :" + a);
        int b = 20;
        System.out.println("Initially b is :" + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Now a is "+ a + " and b is " + b );
    }
}
