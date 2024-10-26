//import java.util.stream.Stream;
//
//public class TargetSum {
//
//    public static void main(String[] args) {
//        int[] nums = {4, 1, 2, 1};
//        int target = 4;
//
//        int result = findTargetSumWays(nums, target);
//        System.out.println(result);
//    }
//
//    public static int findTargetSumWays(int[] nums, int target) {
//
//        int [] dd = Stream.of(String.valueOf(nums).split("")).mapToInt(Integer::parseInt).toArray()
//        for (int num : nums) {
//            sum += num;
//        }
//
//        // 전체 합이 목표값과 비교하여 홀수거나 목표값이 전체 합을 초과하면 만들 수 없음
//        if (sum < target || (sum + target) % 2 != 0) {
//            return 0;
//        }
//
//        int subsetSum = (sum + target) / 2;
//        int[] dp = new int[subsetSum + 1];
//        dp[0] = 1;
//
//        for (int num : nums) {
//            for (int i = subsetSum; i >= num; i--) {
//                dp[i] += dp[i - num];
//            }
//        }
//
//        return dp[subsetSum];
//    }
//}
