import java.util.*;

class NoOfAtoms {
    public String countOfAtoms(String formula) {
        Stack<Map<String, Integer>> stack = new Stack<>();
        stack.push(new TreeMap<>());
        int i = 0, n = formula.length();
        while (i < n) {
            char c = formula.charAt(i);
            if (c == '(') {
                stack.push(new TreeMap<>());
                i++;
            } else if (c == ')') {
                Map<String, Integer> top = stack.pop();
                i++;
                int j = i;
                while (i < n && Character.isDigit(formula.charAt(i)))
                    i++;
                int count = j < i ? Integer.parseInt(formula.substring(j, i)) : 1;
                for (String atom : top.keySet()) {
                    int v = top.get(atom);
                    stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + v * count);
                }
            } else {
                int j = i + 1;
                while (j < n && Character.isLowerCase(formula.charAt(j)))
                    j++;
                String atom = formula.substring(i, j);
                i = j;
                j = i;
                while (j < n && Character.isDigit(formula.charAt(j)))
                    j++;
                int count = i < j ? Integer.parseInt(formula.substring(i, j)) : 1;
                stack.peek().put(atom, stack.peek().getOrDefault(atom, 0) + count);
                i = j;
            }
        }
        StringBuilder ans = new StringBuilder();
        for (String atom : stack.peek().keySet()) {
            ans.append(atom);
            int count = stack.peek().get(atom);
            if (count > 1)
                ans.append(count);
        }
        return new String(ans);
    }
}