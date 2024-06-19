public class character_pattern {
    public static void main(String[] args){
        // A\n BC \n DEF \n GHIJ



        for(int i = 1; i <= 10; i++){
            char ch = 'A';
            for (int j = 0; j <= i; j++){
                System.out.print((char)((int) ch + j ));
            }
            System.out.println();
        }
    }
}
