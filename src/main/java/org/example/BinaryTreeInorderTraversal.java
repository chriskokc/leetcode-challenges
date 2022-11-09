package org.example;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> resultList = new ArrayList<>();

        if (root == null) {
            return resultList;
        }

        return resultList;
    }

    public static void main(String[] args) {
        System.out.println(inorderTraversal(new TreeNode(1, null, new TreeNode(2, new TreeNode(3, null, null), null))));
    }
}
