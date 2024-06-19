import java.sql.SQLOutput;
import java.util.Scanner;

public class ternarypass_fail {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int your_marks = input.nextInt();

        String result = your_marks>33? "Passed": "Failed";
        System.out.println("you have " + result);
    }
}
