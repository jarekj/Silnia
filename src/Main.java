public class Main {

    public static void main(String[] args) {
        int inSilnia = 5;
        System.out.println(Silnia1(inSilnia));
        System.out.println(Silnia2(inSilnia));
        System.out.println(SilniaReq(inSilnia));
    }


    public static long Silnia1(int n) { // pętla z góry
        long silnia = n;
        for (int i = n-1; i > 0; i--) {
                 silnia = silnia * i;
        }
        return silnia;

    }

    public static long Silnia2(int n){ // pętla z dołu
        long silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }
        return silnia;
    }

    private static long SilniaReq(int i) //rekurencyjnie
    {
        if (i == 1)
            return 1;
        else
            return i * SilniaReq(i - 1);
    }
}
