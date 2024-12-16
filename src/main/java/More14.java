public class More14 {
    static int[] nums = {1, 4, 1, 4};
    public static void main(String[] args) {
        more14(nums);
    }
    public static boolean more14(int[] nums) {
        int count1 = 0;
        int count4 = 0;
        for (int num : nums) {
            if (num == 1) {
                count1++;
            }
            if (num == 4) {
                count4++;
            }
        }
        System.out.println("# of 1s: " + count1);
        System.out.println("# of 4s: " + count4);

        if (count1 > count4) {
            System.out.println("true");
            return true;
        }
        System.out.println("false");
        return false;
    }
}
