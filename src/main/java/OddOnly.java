import java.util.ArrayList;
import java.util.List;

public class OddOnly {
    public static int[] nums = {1143, 555, 7, 9953, 643};
    public static void main(String[] args) {
        oddOnly(nums);
    }
    public static List<Integer> oddOnly(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        if(nums == null || nums.length == 0) {
            return result;
        }
//        for (int i = 0; i < nums.length; i++) {
//            if(nums[i]%2 != 0) {
//                result.add(nums[i]);
//            }
        for(int num: nums) {
            if(num%2 != 0) {
                result.add(num);
            }
        }
        System.out.println(result);
        return result;
    }
}
