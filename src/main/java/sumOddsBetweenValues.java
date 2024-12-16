public class sumOddsBetweenValues {
    static int start = 28;
    static int end = 30;
    public static void main(String[] args) {
        sumOddsBetweenValues(start, end);
    }
    public static int sumOddsBetweenValues(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
              sum += i;
            }

        }
        System.out.println(sum);
        return sum;
    }
}
