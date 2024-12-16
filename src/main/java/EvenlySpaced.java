public class EvenlySpaced {
    static int a = 4;
    static int b = 6;
    static int c = 2;

    public static void main(String[] args) {
        evenlySpaced(a, b, c);
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        if (a != b && b != c && a != c) {
            int max = Math.max(Math.max(a, b), c);
            int min = Math.min(Math.min(a, b), c);
            int middle = a + b + c - max - min;
            if (Math.abs(max - middle) == Math.abs(middle - min)) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");

        return false;
    }
//    public static void main(String[] args) {
//        evenlySpaced(a, b, c);
//    }
//    public static boolean evenlySpaced(int a, int b, int c) {
//        if(Math.abs(a - b ) == Math.abs(b-c)) {
//            System.out.println("true");
//            return true;
//        }
//        System.out.println("false");
//        return false;
//    }
}
