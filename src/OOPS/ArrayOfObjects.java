package OOPS;

import java.util.Scanner;

public class ArrayOfObjects {
    String name;
    int age;
    Long phoneNo;

    public ArrayOfObjects(String name, int age, Long phoneNo) {
        this.name = name;
        this.age = age;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "ArrayOfObjects{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", phoneNo=" + phoneNo +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array :");
        int size = sc.nextInt();
        ArrayOfObjects[] arr = new ArrayOfObjects[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter name of" + (i+1) + " student");
            String name = sc.next();
            System.out.println("Enter age of" + (i+1) + " student");
            int age = sc.nextInt();
            System.out.println("Enter PhoneNo. of" + (i+1) + " student");
            Long phoneNo = sc.nextLong();

            arr[i] = new ArrayOfObjects(name,age,phoneNo);
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
