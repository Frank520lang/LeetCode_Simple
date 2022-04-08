package util;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : Frank
 * @date : 2022/4/8 12:32
 */
public class TestTree {

    /**
     *创建一颗用于测试相同的树
     *
     *  */
    public  Map SameTree() {
        Map treeNodeMap = new HashMap<Integer, TreeNode>();
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(3);
        TreeNode leaf = new TreeNode(4);
        head.left = left;
        head.right = right;
        left.left = leaf;

        TreeNode head1 = new TreeNode(1);
        TreeNode left1 = new TreeNode(2);
        TreeNode right1 = new TreeNode(3);
        TreeNode leaf1 = new TreeNode(4);
        head1.left = left1;
        head1.right = right1;
        left1.left = leaf1;

        treeNodeMap.put(1, head);
        treeNodeMap.put(2, head1);
        return treeNodeMap;


    }
/**
* 对称二叉树
* */
    public TreeNode SYMTree(){
        TreeNode head = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(4);
        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(3);
        head.left = left;
        head.right = right;
        left.left=left1;
        left.right=right1;
        right.left=left2;
        right.right=right2;
        return head;
    }

}
