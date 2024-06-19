import java.util.Scanner;

public class ternaryodd_even {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int number = 2001;
        // Here we are using ternary operator.
        String larger_number = (number%2 == 0)? "even": "odd";
        System.out.println(larger_number);
    }
}
