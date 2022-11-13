package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();
        Stack<TreeNode> treeStack = new Stack<>();
        TreeNode current = new TreeNode();
        current = root;

        if (root == null) {
            return resultList;
        }

        while (current != null || !treeStack.isEmpty()) {

            while (current != null) {
                treeStack.push(current);
                current = current.left;
            }

            current = treeStack.pop();
            int valToStore = current.val;
            resultList.add(valToStore);

            current = current.right;

        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null))));
        System.out.println(inorderTraversal(new TreeNode(1, new TreeNode(4), new TreeNode(2, new TreeNode(3), new TreeNode(5)))));
    }
}
