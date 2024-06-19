import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter your String: ");
        String PalString = Sc.nextLine();
        PalindromeCheck Pc = new PalindromeCheck();
        Pc.PalindromeChecker(PalString);
    }
}

class PalindromeCheck {
    public void PalindromeChecker(String A){
        int b = A.length()/2;
        int c = A.length() - 1;
        boolean result = true;

        if  (A.length()>1){
            for (int i = 0; i<b; i++) {
                if (A.charAt(i) == A.charAt(c)) {
                    c -= 1;
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
        } else {
            System.out.println("String is small");
            result = false;
        }

        if (result){
            System.out.println("It's Palindrome!");
        } else {
            System.out.println("It's not Palindrome!");
        }
    }
}