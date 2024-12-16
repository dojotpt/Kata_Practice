public class Has12 {
    static int[] nums = {1, 3, 2};

    public static void main(String[] args) {
        has12(nums);
    }
    public static boolean has12(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        boolean result = false;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i] == 1) {
                result = true;
            }
            if(result && nums[i] == 2) {
                return true;
            }
        }
        return false;
    }
}
