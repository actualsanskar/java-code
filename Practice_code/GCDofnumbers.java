package Practice_code;

import java.util.Scanner;

class CalculateGCF {

    void GCFcalculator(int A, int B) {
        int GCD = 1;
        int BigNum;

        if (A>=B){
            BigNum = A;
        } else BigNum = B;


        for (int i = 1; i < BigNum+1; i++) {
            if (A == 1 && B == 1) {
                System.out.println("GCF of those numbers is: " + GCD);
                break;
            }
            else {
                if (A % i == 0 && B % i == 0) {
                    GCD = GCD * i;
                    System.out.println("i: " + i);
                    A = A / i;
                    B = B / i;
                } else if (A % i == 0) {
                    GCD = GCD * i;
                    A = A / i;
                } else {
                    GCD = GCD * i;
                    B = B / i;
                }
            }
        }
    }
}

public class GCDofnumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();

        System.out.print("enter the second number: ");
        int b = sc.nextInt();

        CalculateGCF GD = new CalculateGCF();
        if(a>0 && b>0){
            GD.GCFcalculator(a, b);
        } else System.out.println("Enter numbers bigger than 0");
    }

}