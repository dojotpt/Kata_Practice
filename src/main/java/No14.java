public class No14 {
    public static int[] nums = {2, 3};
    public static void main(String[] args) {
        no14(nums);
    }
    public static boolean no14 (int[] nums) {
        if (nums == null || nums.length == 0) {
            System.out.println("false");
            return false;
        }
        for (int num: nums) {
            if (num == 1 || num == 4) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
