public class BiggerTwo {
    //takes two int arrays a + b
    //return array w/the largest sum
    //tie = a
    //null or empty array
    static int[] a = {11, 33};
    static int[] b = {3, 41};
    public static void main(String[] args) {
        biggerTwo(a, b);
    }
    public static void biggerTwo(int[] a, int[] b) {
        if(a == null || a.length == 0 || b == null || b.length == 0) {
            System.out.println("invalid entry for a or b");
            return;
        } if(a[0] + a[1] > b[0] + b[1]) {
            System.out.println(a[0] + a[1]);
        } else if (b[0] + b[1] > a[0] + a[1]) {
            System.out.println(b[0] + b[1]);
        } else if ((a[0] + a[1]) == (b[0] + b[1])) {
            System.out.println("sum of values in a and b are the same");
        }
    }
}
