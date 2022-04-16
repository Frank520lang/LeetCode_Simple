package simple;

/**
 * @author : Frank
 * @date : 2022/4/14 2:32
 */
public class ReverseList {
    public static void main(String[] args) {
        ListNode head=new ListNode();
        testReverseList(head);
    }
    /**
     * 反转链表
     * */
    private static ListNode testReverseList(ListNode head){
        ListNode prev=null;
        ListNode cur=head;
        while(cur!=null){
            //暂存cur.next
            ListNode next=cur.next;
            //cur的next指向prev
            cur.next=prev;
            //prev前进以为
            prev=cur;
            //cur前进一位
            cur=next;
        }
        return new ListNode();
    }
}
