import java.util.*;

public class pos_negative {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        String result = a>=0? "Positive": "Negative";
        System.out.println(result);

    }
}