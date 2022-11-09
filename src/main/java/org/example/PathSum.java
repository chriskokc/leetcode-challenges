package org.example;

public class PathSum {

    public static boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) return false;
        int subSum = targetSum - root.val;
        boolean ans = false;

        if (subSum == 0 && root.left == null && root.right == null) {
            return (ans =  true);
        }

        if (root.left != null) {
            ans = ans || hasPathSum(root.left, subSum);
        }

        if (root.right != null) {
            ans = ans || hasPathSum(root.right, subSum);
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(hasPathSum(new TreeNode(1, new TreeNode(2, null, null), new TreeNode(3, null, null)), 5));

    }
}
