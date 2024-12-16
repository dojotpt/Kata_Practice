// contains 3 ints
// loop check for 2 and save to result
// if 2 and i+ 1 = 3,
// return result
import java.util.Arrays;

public class Fix23 {
    static int[] nums = {1, 2, 3, 4};

    public static void main(String[] args) {
        fix23(nums);
    }
    public static int[] fix23(int[] nums) {
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == 2 && nums[i + 1] == 3) {
               nums[i+1] = 0;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}

