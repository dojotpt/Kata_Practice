public class DoubleX {
    static String str = "axbxbb";

    public static void main(String[] args) {
        doubleX(str);
    }
    public static boolean doubleX(String str) {
        for (int i = 0; i < str.length()-1; i++) {
            if (str != null && str.length() != 0 && str.charAt(i) == 'x' && str.charAt(i+1) == 'x') {
                System.out.println("true");
                return true;
            }
        }
        return false;
    }
}
