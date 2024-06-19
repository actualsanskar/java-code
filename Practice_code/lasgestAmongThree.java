package Practice_code;

public class lasgestAmongThree {
    public static void main(String[] args){
        int a = 1000;
        int b = 50;
        int c = 330;
        System.out.println("We are going to compare a, b and c");

        if(a> c){
            if (a>b){
                System.out.println("a is the biggest");
            } else System.out.println("b is the biggest");
        } else if (c>b){
            System.out.println("c is the biggest");
        } else System.out.println("b is the biggest");
    }
}
