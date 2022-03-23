package datastructure;

import util.TreeNode;

import java.util.Stack;

/**
 * @author Administrator
 * 2022.3.22
 */
public class DepthTraversal {
    public static void main(String[] args) {
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        testDepthTraversal(treeNode1);
    }

    private static void testDepthTraversal(TreeNode treeNode1) {
        Stack<TreeNode> stack =new Stack<TreeNode>();
        if (treeNode1 == null) {
            System.out.println("二叉树为空");
        }
        stack.push(treeNode1);
        while(!stack.empty()){
            TreeNode q =stack.pop();
            if (q != null) {
                System.out.println(q.val);
            }
            if (q.right != null) {
                stack.push(q.right);
            }
            if (q.left != null) {
                stack.push(q.left);
            }
        }
    }
}
