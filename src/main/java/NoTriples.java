public class NoTriples {
    static int[] nums = {0, 1, 3, 1, 1};
    public static void main(String[] args) {
        noTriples(nums);
    }
    public static boolean noTriples(int[] nums) {
        if (nums.length <= 2) {
            System.out.println("true");

            return true;
        }
        for (int i = 0; i < nums.length-2; i++) {
            if (nums[i] == nums[i + 1] && nums[i] == nums[i + 2]) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");

        return true;
    }
}
