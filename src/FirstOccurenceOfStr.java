public class FirstOccurenceOfStr {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int n = haystack.length();
        int m = needle.length();
        for (int i = 0; i < n - m + 1; i++) {
            if (haystack.substring(i, i + m).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";
        // expected = 2
        System.out.println(new FirstOccurenceOfStr().strStr(haystack, needle));
    }
    
}
