package org.example;

public class BalancedBinaryTree {
    public static boolean isBalanced(TreeNode root) {
        // height: max number of nodes from root to leaves
        // definition of a balanced tree:
        // height of left and right subtree should not be greater than 1
        // left subtree is balanced
        // right subtree is balanced

        if (root == null) {
            return true;
        }

        int heightOfLeftSubTree = 0;
        int heightOfRightSubTree = 0;

        heightOfLeftSubTree = maxDepth(root.left);
        heightOfRightSubTree = maxDepth(root.right);

        if (Math.abs(heightOfLeftSubTree - heightOfRightSubTree) <= 1 && isBalanced(root.left) && isBalanced(root.right)) {
            return true;
        }

        return false;
    }

    public static int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    public static void main(String[] args) {
        System.out.println(isBalanced(new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)))));
        System.out.println(isBalanced(new TreeNode(1, new TreeNode(2, new TreeNode(3, new TreeNode(4), new TreeNode(4)), new TreeNode(3)), new TreeNode(2))));
        System.out.println(isBalanced(null));
    }

}
