import java.util.HashSet;
import java.util.Set;

class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
    int max = 0;
    int start = 0;
    int end = 0;
    Set<Character> set = new HashSet<>();
    while(end < s.length()){
      if(!set.contains(s.charAt(end))){
        set.add(s.charAt(end));
        end++;
        max = Math.max(max, set.size());
      }else{
        set.remove(s.charAt(start));
        start++;
      }
    }
    return max;
  }
}