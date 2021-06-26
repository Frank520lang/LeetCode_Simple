package simple;

/**
 * @author Administrator
 * @date 2021/04/25
 */
public class Solution {
    /*
         给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
        请你将两个数相加，并以相同形式返回一个表示和的链表。
        你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }

    public static void main(String[] args) {

    }

}

// 定义一个链表的节点
class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    //给节点赋值
    ListNode(int val) {
        this.val = val;
    }
    //
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
