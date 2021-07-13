package simple;

/**
 * @author Administrator
 * @date 2021/04/25
 */
public class Solution {
    /*
        1.给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
        请你将两个数相加，并以相同形式返回一个表示和的链表。
        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     */

//      2.将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    //合并两个有序链表
    //递归的方法合并两个有序列表，斐波那列数列也是递归调用得出最终结果
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        //判断链表为空的状况
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {               //判断新的链表从那个链表开始
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;                              //将开头的链表返回
        } else {
            l2.next = mergeTwoLists(l2.next, l1);
            return l2;
        }
    }


    public static void main(String[] args) {
        dieDaiMerge();
        baoLiMerge();
    }

    private static void baoLiMerge() {
        ListNode l1 = createNodeList1();
        System.out.println("链表l1: "+l1);
        ListNode l2 = createNodeList2();
        System.out.println("链表l2: "+l2);
        ListNode l = baoLiMergeTwoList(l1, l2);
        System.out.println("合并后的链表： "+l);
    }

    private static ListNode baoLiMergeTwoList(ListNode l1, ListNode l2) {

        return null;
    }

    private static void dieDaiMerge() {
        ListNode l1 = createNodeList1();
        System.out.println("链表l1: "+l1);
        ListNode l2 = createNodeList2();
        System.out.println("链表l2: "+l2);
        ListNode l = mergeTwoLists(l1, l2);
        System.out.println("合并后的链表： "+l);
    }

    private static ListNode createNodeList2() {
        ListNode l1 = new ListNode(1);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);

        l3.next = l4;
        l1.next = l3;
        return l1;
    }

    private static ListNode createNodeList1() {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l4 = new ListNode(4);

        l2.next = l4;
        l1.next = l2;
        return l1;
    }

}

// 定义一个链表的节点
class ListNode {
    int val;
    ListNode next;

    //无参构造方法
    ListNode() {
    }

    //有参构造方法 给节点赋值
    ListNode(int val) {
        this.val = val;
    }

    //
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}
