package Concept;

public class funct_overload {

    // func to cal int sum having two parameters
    public static int sum(int a, int b){
        return a + b;
    }

    //  func with three parameters
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    
    // func to cal float sum
    public static float sum(float a, float b) {
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 5));
        System.out.println(sum(4,5,6));
    }
}
