package Concept;

import java.util.Scanner;

public class construct_add {

    int a,b;
    construct_add(int x, int y){
        a = x;
        b = y;
    }

    void display(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    void output(){
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args){
        int x,y;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        x = sc.nextInt();

        System.out.println("Enter the second number: ");
        y = sc.nextInt();

        construct_add con = new construct_add(x,y);
        con.output();

    }
}
