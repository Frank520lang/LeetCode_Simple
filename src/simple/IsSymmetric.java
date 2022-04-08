package simple;

import util.TestTree;
import util.TreeNode;

import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * @author : Frank
 * @date : 2022/4/8 12:31
 */
public class IsSymmetric {
    public static void main(String[] args) {
        TestTree testTree = new TestTree();
        TreeNode root = testTree.SYMTree();

        boolean b1 = IsSymmetricByRecursion(root, root);
        boolean b2 = IsSymmetricByIteration(root, root);

        System.out.println("递归："+b1+" 迭代："+b2);
    }

    /**
     * 迭代的方法判断是否是对称二叉树
     */
    private static boolean IsSymmetricByIteration(TreeNode p, TreeNode q) {
        //辅助队列
        Queue queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);
        while (!queue.isEmpty()) {
            p = (TreeNode) queue.poll();
            q = (TreeNode) queue.poll();
            if (p == null && q == null) {
                return true;
            }
            if (p == null || q == null) {
                return false;
            }
            if (p.val != q.val) {
                return false;
            }
            queue.offer(p.left);
            queue.offer(q.right);

            queue.offer(p.right);
            queue.offer(q.left);
        }
        return true;
    }

    /**
     * 递归的方法判断是否是对称二叉树
     *
     * @param p
     * @param q
     */
    private static boolean IsSymmetricByRecursion(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        //p 指针和 qq 指针一开始都指向这棵树的根，
        // 随后 p 右移时，q 左移，p 左移时，q 右移。每次检查当前 p 和 q 节点的值是否相等，
        // 如果相等再判断左右子树是否对称。

        //&左右两端条件式有一个为假就会不成立，但是两端都会运行
        //&&也叫做短路运算符，因为只要左端条件式为假直接不成立，不会去判断右端条件式。
        return p.val == q.val && IsSymmetricByRecursion(p.left, q.right) && IsSymmetricByRecursion(p.right, q.left);
    }

}
