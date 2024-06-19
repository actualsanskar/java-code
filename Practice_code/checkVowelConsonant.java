package Practice_code;

import java.util.Scanner;

public class checkVowelConsonant {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the alphabet: ");
        String A = sc.nextLine();


        if (A.charAt(0) == 'a' || A.charAt(0) == 'e' | A.charAt(0) == 'i' | A.charAt(0) == 'o' | A.charAt(0) == 'u'){
            System.out.println("the number you entered is vowel");
        } else System.out.println("The number you entered is Consonant");
    }
}
