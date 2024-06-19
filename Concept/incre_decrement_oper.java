public class incre_decrement_oper {
    public static void main(String[] args){

        int a = 10;
        int b = ++a;
//   here first the value of a changed and then it was assigned to b.
        System.out.println(a);
        System.out.println(b);

        int c = 20;
        int d = c--;
//        Here first the value was assigned to d and then value of c changed
        System.out.println(c);
        System.out.println(d);

    }
}
