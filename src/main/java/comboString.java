public class comboString {
    static String a = "aa";
    static String b = "bbb";
    // if a = b?
    // empty strings?
    // null

    public static void main(String[] args) {
        comboString(a, b);
    }
    public static String comboString(String a, String b) {
        String result = "";
        if (a != null && b != null && a.length() > b.length()) {
            result = b + a + b;
        } else {
            result = a + b + a;
        }
        System.out.println(result);
        return result;
    }
}
