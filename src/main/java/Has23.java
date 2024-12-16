public class Has23 {
public static int[] nums = {2, 3};
    public static void main(String[] args) {
    has23(nums);

    }
    // empty array
    // single array? Should 2 be true or false?
    // null array
    public static boolean has23(int[] nums) {
        if (nums == null) {
            return false;
        } else if (nums.length == 0) {
            return false;
        }

        for (int num: nums) {
            if (num == 2 || num == 3) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
