public class Array123 {
    // nums == null
    // nums < 3
    //
    public static int[] nums = {1, 1, 2, 1, 2, 3};
    public static void main(String[] args) {
        array123(nums);
    }
    public static boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 3; i++) {
            if (nums == null || nums.length < 3) {
                return false;
            }
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}
