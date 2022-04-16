package simple;

import util.CreateTrees;
import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Frank
 * @date : 2022/4/16 14:31
 */
public class MaxDepth {
    public static void main(String[] args) {
        CreateTrees createTrees = new CreateTrees();
        TreeNode head = createTrees.MaxDepthTree();
        testMaxDepthByWidth(head);
        testMaxDepthByHigh(head);
        System.out.println(testMaxDepthByHigh(head));
    }
    /**
     * 深度优先，找出最大深度
     * 迭代（理解不了）
     * */
    public static int testMaxDepthByHigh(TreeNode head){
        //递归的出口
        if (head == null) {
            return 0;
        }else{
            int leftHeight = testMaxDepthByHigh(head.left);
            int rightHeight = testMaxDepthByHigh(head.right);
            return Math.max(leftHeight, rightHeight) + 1;
        }
    }

    /**
     * 给定一个二叉树，找出其最大深度。
     * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
     */
    public static int testMaxDepthByWidth(TreeNode head) {
        //广度优先搜索
        if (head == null) {
            return 0;
        }
        //辅助队列
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(head);
        //深度的标志
        int res = 0;
        //控制深度
        while (!queue.isEmpty()) {
            int size = queue.size();
            //控制广度
            while (size > 0) {
                //出队
                TreeNode node = queue.poll();
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
                size--;
            }
            res++;
        }
        return res;
    }
}
