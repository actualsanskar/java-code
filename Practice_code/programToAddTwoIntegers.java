package Practice_code;

import java.util.Scanner;

public class programToAddTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int A = sc.nextInt();

        System.out.println("Enter second number: ");
        int B = sc.nextInt();

        System.out.println("sum of both numbers is " + (A + B));
    }
}
