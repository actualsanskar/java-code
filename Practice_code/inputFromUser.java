package Practice_code;

import java.util.Scanner;

public class inputFromUser {
    public static void main(String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter number: ");

        int a = sc.nextInt();
        System.out.println("The number you entered is " + a);

    }
}
