public class SumOdds {
    public static void main(String[] args) {
        sumOdds();
    }
    public static int sumOdds() {
        int n = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                n += i;
            }
        }
        System.out.println(n);
        return n;
    }
}
