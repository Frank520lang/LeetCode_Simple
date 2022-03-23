package simple;

import util.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class IsSameTree {
    public static void main(String[] args) {
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode leaf = new TreeNode(4);
        head.left = left;
        head.right = right;
        left.left=leaf;

        TreeNode head1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(4);
        head1.left = left1;
        head1.right = right1;
        left1.left=leaf1;

        //深度优先
        //boolean flag1=testIsSameTreeByDeep(head, head1);
        //广度优先
        boolean flag2=testIsSameTreeByWide(head, head1);
        //System.out.println("深度优先："+flag1+"\n"+"广度优先："+flag2);
    }

    //广度优先
    //一层一层遍历
    private static boolean testIsSameTreeByWide(TreeNode p, TreeNode q) {
        //节点先判空
        if (p == null && q == null) {
            return true;
        } else if (p == null || q == null) {
            return false;
        }
        //创建两个队列存放树节点
        Queue<TreeNode> queue1 = new LinkedList<TreeNode>();
        Queue<TreeNode> queue2 = new LinkedList<TreeNode>();
        //将两个根节点放到两个队列中
        queue1.offer(p);
        queue2.offer(q);
        //遍历两个队列
        //两个队列不为空
        while (!queue1.isEmpty() || !queue2.isEmpty()) {
            //检索并删除此队列的头，如果此队列为空，则返回 null 。
            //控制队列的长度，相当于循环的i--
            TreeNode t1 = queue1.poll();
            TreeNode t2 = queue2.poll();
            if (t1.val != t2.val) {
                return false;
            }

            TreeNode left1 = t1.left;
            TreeNode right1 = t1.right;
            TreeNode left2 = t2.left;
            TreeNode right2 = t2.right;
            //异或^操作，不同出1，相同出0
            //两个判断条件不相同返回1
            //两个判断条件相同返回0

            //两个左节点的一个为null，返回false
            if (left1 == null ^ left2 == null) {
                return false;
            }
            //两个右节点的一个为null，返回false
            if (right1 == null ^ right2 == null) {
                return false;
            }
            //第一棵树左节点不为空，放进队列queue1中
            if (left1 != null) {
                queue1.offer(left1);
            }
            //第一棵树右节点不为空，放进队列queue1中
            if (right1 != null) {
                queue1.offer(right1);
            }
            //第二棵树左节点不为空，放进队列queue2中
            if (left2 != null) {
                queue2.offer(left2);
            }
            //第二棵树右节点不为空，放进队列queue2中
            if (right2 != null) {
                queue2.offer(right2);
            }

        }


        //遍历完判断两个队列是否同时为空
        return queue1.isEmpty() && queue2.isEmpty();
    }

    //深度优先
    //先遍历完左节点
    private static boolean testIsSameTreeByDeep(TreeNode p, TreeNode q) {
        //两颗树都为空
        if (p == null && q == null) {
            return true;
            //有一棵树为空
        } else if (p == null || q == null) {
            return false;
            //根节点不相同
        } else if (p.val != q.val) {
            return false;
            //递归调用
        } else {
            return testIsSameTreeByDeep(p.left, q.left) && testIsSameTreeByDeep(p.right, q.right);
        }
    }

}
