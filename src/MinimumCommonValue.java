import java.util.HashSet;
import java.util.Set;

public class MinimumCommonValue {

    // use greedy algorithm to find the minimum common value
    public int minimumCommonValue(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        int min = Integer.MAX_VALUE;
        for (int i : nums2) {
            if (set.contains(i)) {
                min = Math.min(min, i);
            }
        }
        return min;
    }
    // use dynamic programming to find the minimum common  with less memory space
    
    public int minimumCommonValueDP(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[][] dp = new int[m + 1][n + 1];
        int min = Integer.MAX_VALUE;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                dp[i][j] = Math.min(dp[i - 1][j], dp[i][j - 1]);
                if (nums1[i - 1] == nums2[j - 1]) {
                    dp[i][j] = Math.max(dp[i][j], nums1[i - 1]);
                    min = Math.min(min, dp[i][j]);
                }
            }
        }
        return min;
    }
}