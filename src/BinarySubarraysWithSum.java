public class BinarySubarraysWithSum {
    public int numSubarraysWithSum(int[] A, int goal) {
        int[] count = new int[A.length + 1];
        count[0] = 1;
        int sum = 0;
        int res = 0;
        for (int a : A) {
            sum += a;
            if (sum >= goal) {
                res += count[sum - goal];
            }
            count[sum]++;
        }
        return res;
       
    }
}