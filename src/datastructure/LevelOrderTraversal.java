package datastructure;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author Administrator
 * 2022.3.23
 */
public class LevelOrderTraversal {
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

        //广度优先遍历二叉树
        testLevelOrderTraversal(treeNode1);
    }

    private static void testLevelOrderTraversal(TreeNode treeNode) {
        if (treeNode == null) {
            System.out.println("二叉树为空");
        }
        //借助队列实现广度遍历
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //将节点放到队列中
        queue.offer(treeNode);
        while (!queue.isEmpty()) {
            TreeNode q =queue.poll();
            if (q != null) {
                System.out.println(q.val);
            }
            if (q.left != null) {
                queue.offer(q.left);
            }
            if (q.right != null) {
                queue.offer(q.right);
            }
        }
    }
}
