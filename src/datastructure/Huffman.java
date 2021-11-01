package datastructure;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Huffman {

    private static class TreeNode implements Comparable<TreeNode>{
        TreeNode left;
        TreeNode right;
        int weight;
        char ch;
        String code;

        public TreeNode(int weight,TreeNode left,TreeNode right) {
            this.weight = weight;
            this.left = left;
            this.right = right;
            this.code = "";
        }
        @Override
        public int compareTo(TreeNode o) {
            if (this.weight > o.weight) {
                return 1;
            }else if (this.weight < o.weight) {
                return -1;
            }else {
                return 0;
            }
        }
    }

    public static TreeNode huffman(TreeMap<Integer, Character> data) {
        TreeSet<TreeNode> tNodes = new TreeSet<>();
//        存权重
        Set<Integer> weights = data.keySet();
//        迭代器去取权值
        Iterator<Integer> iterator = weights.iterator();
        while (iterator.hasNext()) {
            int weight = iterator.next();
//            创建TreeNode实例
            TreeNode tmp = new TreeNode(weight, null, null);
//            通过权值获取到对应的字符
            tmp.ch = data.get(weight);
//            TreeSet存放TreeNode实例
            tNodes.add(tmp);
        }
        while (tNodes.size() > 1) {
//            检索并删除第一个元素（最低）
            TreeNode leftNode = tNodes.pollFirst();
            leftNode.code = "0";
            TreeNode rightNode = tNodes.pollFirst();
            rightNode.code = "1";
            TreeNode newNode = new TreeNode(leftNode.weight+rightNode.weight,
                    leftNode, rightNode);
            tNodes.add(newNode);
        }
//        返回集合的第一个元素（最低）
        return tNodes.first();
    }

    private static void code(TreeNode t) {
        if (t.left != null) {
            t.left.code = t.code + t.left.code;
            code(t.left);
        }
        if (t.right != null) {
            t.right.code = t.code + t.right.code;
            code(t.right);
        }
    }

    public static void print(TreeNode root) {
        if (root != null) {
            if (root.left == null && root.right == null) {
                System.out.println(root.ch + " 编码：" + root.code);
            }else {
                print(root.left);
                print(root.right);
            }
        }
    }

    public static void main(String[] args)
    {
//        TreeMap根据key排序的集合,保存权重和对应的字符
        TreeMap<Integer, Character> test = new TreeMap<>();
        test.put(5, 'f');
        test.put(9, 'e');
        test.put(12, 'c');
        test.put(13, 'b');
        test.put(16, 'd');
        test.put(45, 'a');

        TreeNode root = huffman(test);
        code(root);
        print(root);
    }

}
