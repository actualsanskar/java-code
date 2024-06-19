import java.io.IOException;
import java.util.Scanner;

public class inputOutput {
    public static void main(String[] args) throws IOException {
//        System.out.println("Enter your name");
//        InputStreamReader in = new InputStreamReader(System.in);
//        BufferedReader bf = new BufferedReader(in);

//        int a = Integer.parseInt(bf.readLine());
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a);
//        bf.close();
        System.out.printf("My name is %s and I am going to complete this %s", "Sanskar", "challenge \n");
        System.out.printf("Pie: %.3f", Math.PI); //Here we have told placeholder to roundof the value till 3 digits
    }
}
