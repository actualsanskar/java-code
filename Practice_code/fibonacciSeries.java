package Practice_code;

import java.util.ArrayList;
import java.util.Scanner;

public class fibonacciSeries {
    static void fiboToN(int a){
        int fibo[] = new int[a];

        fibo[0] = 0;
        fibo[1] = 1;

        for (int i = 1; i < (a - 1); i++){
            fibo[i+1] = fibo[i] + fibo[i - 1];
        }

        for(int i = 0; i < a; i++){
            System.out.print(fibo[i] + ", ");
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to which you want fibonacci series");
        int A = sc.nextInt();

        if (A == 0){
            System.out.println("Enter a bigger number");
        } else fiboToN(A);
    }
}
