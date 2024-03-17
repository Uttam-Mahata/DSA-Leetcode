import java.util.ArrayList;

public class SubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) {
    
        int start = 0;
        int end = 0;
        int sum = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while (start <= end) {
            if (sum < s) {
                sum += arr[end++];
                
            } else if (sum > s) {
                sum -= arr[start++];
            
            }
            if (end > n) {
                result.add(-1);
                return result;
            }
            else {
                result.add(++start);
                result.add(end);
                return result;
            }

        
        
        }
        result.add(-1);
        return result;


    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int targetSum = 9;
        ArrayList<Integer> result = subarraySum(arr, arr.length, targetSum);
        System.out.println(result);
    }
}
