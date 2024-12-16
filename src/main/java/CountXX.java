public class CountXX {
    // UPPER/LOWER
    // EMPTY STRING
    // NULL
    static String str = "xX";
    public static void main(String[] args) {
        countXX(str);
    }
    public static int countXX(String str) {
        int count = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.toLowerCase(str.charAt(i)) == 'x' && Character.toLowerCase(str.charAt(i + 1)) == 'x') {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
