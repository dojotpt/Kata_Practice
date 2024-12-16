public class LessBy10 {
    // takes 3 ints
    // return true if one value is 10 or more than another
    // negatives values
    // 0 fine
    // null irrelevant for ints

    static int a = -9;
    static int b = -13;
    static int c = -111;

    public static void main(String[] args) {
        lessBy10(a, b, c);
    }

    public static boolean lessBy10(int a, int b, int c) {
        if(Math.abs(a - b) >= 10 || Math.abs(b - c) >= 10 || Math.abs(a - c) >= 10) {
            System.out.println("true");
            return true;
        }
        return false;
    }
//    public static boolean lessBy10(int a, int b, int c) {
//        if(a - b >= 10 || b-a >= 10 || a-c >= 10 || c-a >=10 || b-c >= 10 || c-b>=10) {
//            System.out.println("true");
//            return true;
//        }
//        return false;
//    }

}
