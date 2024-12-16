public class Start1 {

        static int[] a = {1, 2, 3};
        static int[] b = {1, 7, 3, 1};

    public static void main(String[] args) {
        start1(a, b);
    }
    public static int start1(int[] a, int[] b) {
        int result = 0;
        if(a != null && a.length > 0 && a[0] == 1) {
            result++;
        }
        if(b != null && b.length > 0 && b[0] == 1) {
            result++;
        }
        System.out.println(result);
        return result;
    }
}
