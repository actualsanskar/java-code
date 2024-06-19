package Practice_code;

public class checkAlphabet {
    public static void main(String[] args) {
        char A = 'A';

//        if(A < 'a' || A > 'z'){
//            if(A < 'A' || A > 'Z'){
//                System.out.println("It's not alphabet");
//            }
//        } else System.out.println("it's an alphabet");
        if(A >= 'a' && A <= 'z' || A >= 'A' && A <= 'Z'){
            System.out.println("It's an alphabet");
        } else System.out.println("it's not an alphabet");
    }
}
