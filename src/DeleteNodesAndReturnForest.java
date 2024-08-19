import java.util.*;

public class DeleteNodesAndReturnForest {
    static class TreeNode {
        int val;
        TreeNode left, right;
        TreeNode(int x) { val = x; }
    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        Set<Integer> toDelete = new HashSet<>();
        for (int val : to_delete) {
            toDelete.add(val);
        }

        List<TreeNode> result = new ArrayList<>();
        dfs(root, toDelete, result, true);
        return result;
    }

    private TreeNode dfs(TreeNode node, Set<Integer> toDelete, List<TreeNode> result, boolean isRoot) {
        if (node == null) return null;

        boolean deleted = toDelete.contains(node.val);
        if (isRoot && !deleted) {
            result.add(node);
        }

        node.left = dfs(node.left, toDelete, result, deleted);
        node.right = dfs(node.right, toDelete, result, deleted);

        return deleted ? null : node;
    }
    
}
