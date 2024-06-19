import java.util.Scanner;

public class prime_number_check {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // this code will tell if the number entered by user is prime or not
        System.out.println("Enter the number you want to check if it is prime or not: ");
        int number = input.nextInt();
        boolean a = true;
        int i;

        if (number<2){
            System.out.println("Enter a number bigger than 1.");
        }
        else {
            for (i = 2; i<number; i++){
                if (number%i==0){
                    System.out.println("The number is divisible by: " + i + " hence it's not a prime number.");
                    a = false;
                    break;
                }
            }
        }

        if (a){
            System.out.println("It's a prime number.");
        }
    }
}
