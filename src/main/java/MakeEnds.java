import java.util.Arrays;

public class MakeEnds {
    static int[] nums = {1, 2, 3};
    public static void main(String[] args) {
        makeEnds(nums);
    }
    public static int[] makeEnds(int[] nums) {
        int[] result = {nums[0], nums[nums.length-1]};
        System.out.println(Arrays.toString(result));
        return result;
    }
}
