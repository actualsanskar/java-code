public class binomial_coff {

    public static int factori(int a){

        int b = 1;
        for(int i = 1; i <=a; i++){
            b *=i;
        }
        return b;
    }

    public static int bin_coff(int n, int r){
        int bin_coff;

        int den = factori(r)* factori(n-r);

        bin_coff = factori(n)/ den;
        return bin_coff;
    }

    public static void main(String[] args) {
        System.out.println(factori(4));

        System.out.println(bin_coff(5, 2));


    }
}
