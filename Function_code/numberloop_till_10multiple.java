import java.util.Scanner;

public class numberloop_till_10multiple {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("You are on a loop which will take input until you give a multiple of 10");


//        for (int i = 1; true; i++){
//            System.out.println("Enter a number: ");
//            int a = input.nextInt();
//            if (a%10==0){
//                System.out.println("you have entered a multiple of 10 and the loop is breaking.");
//                break;
//            }
//        }

        do{
            int a = input.nextInt();
            if (a%10==0){
                break;
            }
            System.out.println(a);
        } while (true);

    }
}
