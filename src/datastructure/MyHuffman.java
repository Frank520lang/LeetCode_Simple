package datastructure;

import java.util.TreeMap;

public class MyHuffman {

    public class TreeNode {
        //权重
        Integer weight;
        //左节点
        TreeNode leftNode;
        //右节点
        TreeNode rightNode;
        //字符
        char ch;
        //编码
        String code;

        public TreeNode(TreeNode leftNode, TreeNode rightNode, Integer weight) {
            this.leftNode = leftNode;
            this.rightNode = rightNode;
            this.weight = weight;
        }

    }

    public static void main(String[] args) {
        //        TreeMap根据key排序的集合,保存权重和对应的字符
        TreeMap<Integer, Character> tm = new TreeMap<>();
        tm.put(5, 'f');
        tm.put(9, 'e');
        tm.put(12, 'c');
        tm.put(13, 'b');
        tm.put(16, 'd');
        tm.put(45, 'a');
        testHuffman(tm);
        code();
        print();
    }

    private static void print() {
    }

    private static void code() {
    }

    private static void testHuffman(TreeMap<Integer,Character> tm) {

    }
}
