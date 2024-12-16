public class ExtraEnd {
    //return string - 3 copies of last 2 char
    // str is >= 2
    static String str = "Hello";

    public static void main(String[] args) {
        extraEnd(str);
    }

    public static String extraEnd(String str) {
        String result = "";

        for (int i = 0; result.length() < 6; i++) {
            result += (String.valueOf(str.charAt(str.length() - 2)) + str.charAt(str.length() - 1));
        }
        System.out.println(result);
        return result;
    }
}
