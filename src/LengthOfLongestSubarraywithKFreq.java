import java.util.*;

public class LengthOfLongestSubarraywithKFreq {
    public int maxSubArrayLen(int[] nums, int k) {
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        map.put(0, -1);
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            int diff = sum - k;
            if (map.containsKey(diff)) {
                max = Math.max(max, i - map.get(diff));
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        return max;
    }

    
}
