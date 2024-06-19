import java.util.Scanner;

public class nomultiple_of10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        for (int i = 1; i<=10; i++){
            int a = input.nextInt();
            if (a%10==0){
                continue;
            }
            System.out.println(a);
        }
    }
}
