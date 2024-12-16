public class FirstHalf {
    static String str = "WooHoo";
    public static void main(String[] args) {
        firstHalf(str);
    }

    public static String firstHalf(String str) {
        String result = "";
        int midpoint = str.length() / 2;
        if(str != null) {
            result = str.substring(0, midpoint);
        }
        System.out.println(result);
        return result;
    }
}
