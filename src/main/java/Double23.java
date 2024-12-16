// loop through array
// check index value and compare to consecutive value
// if values are either 2 or 3 && match true
public class Double23 {
    public static int[] nums = {1, 3, 4, 3};
    public static void main(String[] args) {
        double23(nums);
    }
    public static boolean double23(int[] nums) {
        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
}

