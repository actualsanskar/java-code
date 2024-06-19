import java.util.Scanner;

public class while_numbertoN {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number you want till you want the numbers to be printed: ");
        int a = input.nextInt();
        int b = 1;

        while (b<=a){
            System.out.print(b + " ");
            b++;
        }
    }
}
