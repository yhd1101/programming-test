public class Test5 {
    public static void main(String[] args) {
        int[] nums = {4, 1, 2, 1};
        int target = 4;

        int result = findTargetSumWays(nums, target);
        System.out.println(result);
    }

    public static int findTargetSumWays(int[] nums, int target) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        if (sum < target || (sum + target) % 2 != 0) {
            return 0;
        }

        int subsetSum = (sum + target) / 2;
        int[] dp = new int[subsetSum + 1];
        dp[0] = 1;

        for (int num : nums) {
            for (int i = subsetSum; i >= num; i--) {
                dp[i] += dp[i - num];
            }
        }

        return dp[subsetSum];
    }
}
