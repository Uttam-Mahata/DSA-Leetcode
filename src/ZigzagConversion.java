public class ZigzagConversion {
    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder();
        }
        int index = 0;
        int increment = 1;
        for (char c : s.toCharArray()) {
            sb[index].append(c);
            if (index == 0) {
                increment = 1;
            }
            if (index == numRows - 1) {
                increment = -1;
            }
            index += increment;
        }
        for (int i = 1; i < sb.length; i++) {
            sb[0].append(sb[i]);
        }
        return sb[0].toString();
    }
    public static void main(String[] args) {
        ZigzagConversion zzc = new ZigzagConversion();
        System.out.println(zzc.convert("PAYPALISHIRING", 3));
    }
    
}
