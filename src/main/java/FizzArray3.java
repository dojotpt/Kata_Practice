import java.util.Arrays;

public class FizzArray3 {
    static int start = 5;
    static int end = 10;
    public static void main(String[] args) {
        fizzArray3(start, end);
    }
    public static int[] fizzArray3 (int start, int end) {
        int[] newArray = new int[end - start];
        int index = 0;
        for (int i = start; i < end; i++) {
            newArray[index] = i;
            index++;
        }
        System.out.println(Arrays.toString(newArray));
        return newArray;
    }
}
