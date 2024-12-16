import java.util.Arrays;

public class MakeLast {
    static int[] nums = {4, 5, 6};

    public static void main(String[] args) {
        makeLast(nums);
    }

    public static int[] makeLast(int[] nums) {
        int[] result = new int[(nums.length)*2];
        result[result.length-1] = nums[nums.length-1];
        System.out.println(Arrays.toString(result));
        return result;
    }
}
