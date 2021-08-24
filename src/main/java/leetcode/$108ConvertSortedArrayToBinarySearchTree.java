package leetcode;

public class $108ConvertSortedArrayToBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return sort(nums);
    }

    TreeNode sort(int[] nums) {
        if (nums == null) {
            return null;
        }
        if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int middle = nums.length / 2;
        TreeNode middleN = new TreeNode(nums[middle]);
        int[] left = new int[middle];
        for (int i = 0; i < middle; i++) {
            left[i] = nums[i];
        }
        int[] right = null;
        if (nums.length - middle - 1 > 0) {
            right = new int[nums.length - middle - 1];

            for (int i = 0; i < nums.length - middle - 1; i++) {
                right[i] = nums[i + middle + 1];
            }
        }
        middleN.left = sort(left);
        middleN.right = sort(right);
        return middleN;
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
