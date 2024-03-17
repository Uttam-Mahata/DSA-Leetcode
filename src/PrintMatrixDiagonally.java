
//     Input:
// n = 3
// mat[][] = {{1, 2, 3},
//            {4, 5, 6},
//            {7, 8, 9}}
// Output: {1, 2, 4, 7, 5, 3, 6, 8, 9}
// Explaination:
// Starting from (0, 0): 1,
// Move to the right to (0, 1): 2,
// Move diagonally down to (1, 0): 4,
// Move diagonally down to (2, 0): 7,
// Move diagonally up to (1, 1): 5,
// Move diagonally up to (1, 2): 3,
// Move to the right to (2, 1): 6,
// Move diagonally up to (0, 2): 8,
// Move diagonally up to (2, 2): 9
// There for the output is {1, 2, 4, 7, 5, 3, 6, 8, 9}.

public class PrintMatrixDiagonally {

    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] result = new int[m * n];
        int row = 0;
        int col = 0;
        for (int i = 0; i < m * n; i++) {
            result[i] = mat[row][col];
            if ((row + col) % 2 == 0) {
                if (col == n - 1) {
                    row++;
                } else if (row == 0) {
                    col++;
                } else {
                    row--;
                    col++;
                }
            } else {
                if (row == m - 1) {
                    col++;
                } else if (col == 0) {
                    row++;
                } else {
                    row++;
                    col--;
                }
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        PrintMatrixDiagonally pmd = new PrintMatrixDiagonally();
        int[][] mat = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] result = pmd.findDiagonalOrder(mat);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}