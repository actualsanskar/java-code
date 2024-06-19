import java.util.Scanner;

public class sum_using_while {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Print the number till you want sum of: ");
        int limit = input.nextInt();
        int starter = 1;
        int sum = 0;
        while (starter<=limit){
            sum += starter;
            starter++;

        }
        System.out.println("Sum is: " + sum);
    }
}
