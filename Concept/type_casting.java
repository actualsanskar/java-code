public class type_casting {
    public static void main(String[] args){

        // Type Casting: is the process of converting a value from one data type to another.


        //implicit type casting: Automatically done by java, no loss of data.

        int num = 100;
        double num2 = num; // value of num2 will be 100.0, this will not lose any data.

        float a = 6677.546f;
        // int b = a; (this will give an error because of loss conversation)

        //explicit type casting: Force conversion to another data type with loss of data

        int b = (int)a; // This will not give any error as we are transferring only the integer part of a into b.

        System.out.println(b);
        System.out.println(a);

        // Type Casting between Different Data Types:
        int my_Int = 5;
        char my_Char = (char) (my_Int + 'A'); // 70
        System.out.println(my_Char);

    }
}
