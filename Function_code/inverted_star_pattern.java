public class inverted_star_pattern {
    public static void main(String[] args){
        String star = "*";

        for (int i = 5; i >=0; i--){
            for (int j = i; j > 0; j--) {
                System.out.print(star);
            }
            System.out.print("\n");
        }
    }
}
