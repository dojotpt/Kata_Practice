import java.util.List;

public class FoundIntTwice {
    static List<Integer> nums;
    static int value = 11;
    public static void main(String[] args) {
        nums = List.of(6, 8, 10, 11, 13);
        foundIntTwice(nums, value);
    }
    public static boolean foundIntTwice(List<Integer> nums, int value) {
        int count = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) == value) {
                count++;
                if (count >= 2) {
                    System.out.println("true");
                    return true;
                }
                }
            }
        System.out.println("false");
        return false;
    }
}
