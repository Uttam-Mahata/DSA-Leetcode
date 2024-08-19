public class FindTheWinner {

    public String findTheWinner(int n, int k) {
        int i = 0;
        int[] arr = new int[n];
        for (int j = 0; j < n; j++) {
            arr[j] = j + 1;
        }
        while (n > 1) {
            i = (i + k - 1) % n;
            for (int j = i; j < n - 1; j++) {
                arr[j] = arr[j + 1];
            }
            n--;
        }
        return String.valueOf(arr[0]);
    }

    public static void main(String[] args) {
        FindTheWinner findTheWinner = new FindTheWinner();
        System.out.println(findTheWinner.findTheWinner(5, 2));
    }
    
}
