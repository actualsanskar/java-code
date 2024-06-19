import java.util.*;
public class income_tax_calculator {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your per annum income:");
        int income = input.nextInt();

        if (income<500000){
            System.out.println("your income is non taxable.");
        } else if (income>500000 && income <1000000) {
            System.out.println("You will have to pay 20% tax on your income which will be: " + income*0.2);
        } else if (income > 1000000){
            System.out.println("You will have to pay 30% tax on your income: " + income*.3);
        }
    }
}
