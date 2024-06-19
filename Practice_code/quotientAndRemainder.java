package Practice_code;

import java.util.Scanner;

public class quotientAndRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers you want to divide: ");
        int A = sc.nextInt();
        int B = sc.nextInt();

        int quotient = (int) A / B;

        int remainder = A % B;

        System.out.printf("Quotient: %d and remainder as Reminder: %d", quotient, remainder);
    }
}
