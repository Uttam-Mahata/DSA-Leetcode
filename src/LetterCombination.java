class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return res;
        }
        String[] map = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        StringBuilder sb = new StringBuilder();
        dfs(digits, 0, sb, map, res);
        return res;
      

    }
    private void dfs(String digits, int index, StringBuilder sb, String[] map, List<String> res) {
        if (index == digits.length()) {
            res.add(sb.toString());
            return;
        }
        char c = digits.charAt(index);
        String str = map[c - '0'];
        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            dfs(digits, index + 1, sb, map, res);
            sb.deleteCharAt(sb.length() - 1);
        }

      
    }
    
  
}