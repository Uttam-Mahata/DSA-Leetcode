public class MatrixScore {
    public int matrixScore(int[][] A) {
        int m = A.length, n = A[0].length;
        int res = m * (1 << (n - 1));
        for (int j = 1; j < n; j++) {
            int cnt = 0;
            for (int i = 0; i < m; i++) {
                cnt += A[i][j] == A[i][0] ? 1 : 0;
            }
            res += Math.max(cnt, m - cnt) * (1 << (n - j - 1));
        }
        return res;
    }
}