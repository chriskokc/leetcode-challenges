package org.example;


public class ConvertSortedArrayToBinarySearchTree {
    public static TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        return getTreeNode(nums, 0, nums.length - 1);
    }

    public static TreeNode getTreeNode(int[] nums, int left, int right) {
        int mid = (left + right) / 2;
        if (left > mid || right < mid) {
            return null;
        }

        TreeNode root = new TreeNode(nums[mid]);

        root.left = getTreeNode(nums, left, mid - 1);
        root.right = getTreeNode(nums, mid + 1, right);

        return root;
    }


    public static void main(String[] args) {
        System.out.println(sortedArrayToBST(new int[] {-10, -3, 0, 5, 9}));
    }
}
