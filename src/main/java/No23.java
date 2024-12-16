public class No23 {
    public static int[] nums = {1, 1};
    public static void main(String[] args) {
        no23(nums);
    }
    public static boolean no23 (int[] nums) {
     if (nums == null || nums.length == 0) {
         System.out.println("false");
         return false;
     }
     for (int num:nums) {
         if (num == 2 || num == 3) {
             System.out.println("false");
             return false;
         }
     }
        System.out.println("true");
        return true;
    }
}
