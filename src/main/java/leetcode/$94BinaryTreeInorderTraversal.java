package leetcode;

import java.util.ArrayList;
import java.util.List;

public class $94BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        travel(root, res);
        return res;
    }

    private void travel(TreeNode root, List<Integer> res) {

        if (root == null) {
            return;
        }
        if (root.left != null) {
            travel(root.left, res);
        }
        res.add(root.val);
        if (root.right != null) {
            travel(root.right, res);
        }
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
