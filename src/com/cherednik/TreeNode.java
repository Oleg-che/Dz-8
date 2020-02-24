package com.cherednik;

public class TreeNode {

    int val;

    TreeNode left;

    TreeNode right;

    TreeNode(int x) {
        val = x;
    }

    public static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        if (t2 == null)
            return t1;
        t1.val += t2.val;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
    }

    static void TreePrint(TreeNode node) {
        if (node == null) {
            return;
        }
        TreePrint(node.left);
        System.out.printf("%d ", node.val);
        TreePrint(node.right);
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left =  new TreeNode(3);
        root1.right =  new TreeNode(2);
        root1.left.left =  new TreeNode(5);

        TreeNode root2 = new TreeNode(2);
        root2.left =  new TreeNode(1);
        root2.right =  new TreeNode(3);
        root2.left.right =  new TreeNode(4);
        root2.right.right =  new TreeNode(7);

        TreeNode root3 = mergeTrees(root1, root2);
        TreePrint(root3);
    }
}