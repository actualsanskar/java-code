import java.util.Scanner;

public class classes_obj {
    int a , b;

    void get_it() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        a = sc.nextInt();

        System.out.println("Enter the second number:");
        b = sc.nextInt();
    }

    void add_it() {
        System.out.println("Addition = " + (a + b));
    }

    public static void main(String[] args){
        classes_obj cl = new classes_obj();
        cl.get_it();
        cl.add_it();
    }
}
