// true if one of 0-3 = 9
// nums can be < 4
// empty array && != null

public class ArrayFront9 {
    static int[] nums = {0};
    public static void main(String[] args) {
        arrayFront9(nums);
    }
    static boolean arrayFront9(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return false;
        }
        int n = Math.min(nums.length, 4);
        for (int i = 0; i < n; i++) {
            if (nums[i] == 9) {
                System.out.println("true");
                return true;
            }
        }
        System.out.println("false");
        return false;
    }
//    static boolean arrayFront9(int[] nums) {
//if (nums == null || nums.length == 0) {
//    System.out.println("false");
//    return false;
//}
//if (nums[0] == 9 || nums[1] == 9 || nums[2] == 9 || nums[3] == 9) {
//    System.out.println("true");
//    return true;
//}
//        System.out.println("false");
//        return false;
//    }
}
