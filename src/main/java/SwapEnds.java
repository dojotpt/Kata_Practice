import java.util.Arrays;

public class SwapEnds {
    static int[] nums = {1, 2, 3};

    public static void main(String[] args) {
        swapEnds(nums);
    }
    public static int[] swapEnds (int[] nums) {
        if (nums.length == 0) {
            return nums;
        }
        int a = nums[0];
        int b = nums[nums.length - 1];
        nums[0] = b;
        nums[nums.length - 1] = a;
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
