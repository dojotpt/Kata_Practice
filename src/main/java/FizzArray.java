import java.util.Arrays;

public class FizzArray {
    static int n = 5;
    public static void main(String[] args) {
        fizzArray(n);
    }
    public static int[] fizzArray(int n) {
        int[] fizz = new int[n];
        for (int i = 0; i < fizz.length-1; i++) {
            fizz[i+1]+=(i+1);
        }
        System.out.println(Arrays.toString(fizz));
        return fizz;
    }
}
