public class Only14 {
    public static int[] nums = {1, 4};
    public static void main(String[] args) {
        only14(nums);
    }
    public static boolean only14(int[] nums) {
        if(nums == null || nums.length == 0) {
            return false;
        }
        for(int num:nums) {
            if(num != 1 && num != 4) {
                System.out.println("false");
                return false;
            }
        }
        System.out.println("true");
        return true;
    }
}
