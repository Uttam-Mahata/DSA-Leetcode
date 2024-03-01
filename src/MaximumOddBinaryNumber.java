

public class MaximumOddBinaryNumber {
    public String maximumBinaryString(String binary) {
        int n = binary.length();
        int count = 0;
        int i = 0;
        while (i < n && binary.charAt(i) == '1') {
            i++;
        }
        while (i < n) {
            if (binary.charAt(i) == '0') {
                count++;
            }
            i++;
        }
        if (count == 0) {
            return binary;
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < n - count - 1; j++) {
            sb.append('1');
        }
        for (int j = 0; j < count; j++) {
            sb.append('0');
        }
        sb.append('1');
        return sb.toString();
    }
}
