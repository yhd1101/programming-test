public class Test4 {

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int result = search(nums, target);
        System.out.println(result);
    }

    public static int search(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                return i;
            }
        }

        return -1;
    }
}
