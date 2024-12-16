public class FirstTwo {
    static String str = "hello";
    public static void main(String[] args) {
        firstTwo(str);
    }
    public static String firstTwo(String str) {
        String result = String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));

        System.out.println(result);
        return result;
    }
}
