import java.util.*;
public class average_of_n_numbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int c = 0;
        System.out.println("Enter the number of items you want average of:");
        int a = input.nextInt();
        for (int i = 0; i<a; i++){
            int b = input.nextInt();
            c = c + b;
        }
        System.out.println("Average of these numbers are: " + c/a);
    }
}




