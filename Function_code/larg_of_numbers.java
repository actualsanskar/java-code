import java.util.*;
public class larg_of_numbers {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
        System.out.println("This program gives you the larger of two numbers");
        System.out.println("Enter first number");
        int a = input.nextInt();
        System.out.println("Enter second number");
        int b = input.nextInt();

        if(a>b)
        {
            System.out.println("First number is greater:");
        } else
        {
            System.out.println("Second number is greater");
        }
    }
}
