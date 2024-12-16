public class ArrayCount9 {
    static int[] nums = {9, 9, 99, -99, -9, 1};
    public static void main(String[] args) {
        arrayCount9(nums);
    }
    public static int arrayCount9(int[] nums) {
    int count = 0;
    if(nums.length == 0 || nums == null) return count;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 9) {
                count++;
            }
        }
        System.out.println(count);
           return count;
    }
}
