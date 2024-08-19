class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int[] count = new int[nums.length + 1];
        count[0] = 1;
        int sum = 0;
        int res = 0;
        for (int a : nums) {
            sum += a;
            if (sum >= goal) {
                res += count[sum - goal];
            }
            count[sum]++;
        }
        return res;
        
    }
}