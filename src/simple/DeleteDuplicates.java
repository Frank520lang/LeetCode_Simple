package simple;

public class DeleteDuplicates {

    public static void main(String[] args) {
        ListNode listNode = createNodeList();
        //printListNode(listNode);
        ListNode l = testDeleteDuplicates(listNode);
        printListNode(l);
        System.out.println("-----------------------------------------");
        System.out.println(testDeleteDuplicates(listNode));
    }

    private static void printListNode(ListNode l) {
        while (l!=null){
            System.out.print(l.val);
            l=l.next;
        }
    }

    //    给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
    private static ListNode testDeleteDuplicates(ListNode listNode) {
        if (listNode == null){
            return null;
        }
        ListNode cur = listNode;
        while(cur.next != null){
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return listNode;
    }
    private static ListNode createNodeList() {
        ListNode l1 =new ListNode(1);
        ListNode l2 =new ListNode(1);
        ListNode l3 =new ListNode(2);
        ListNode l4 =new ListNode(3);
        ListNode l5 =new ListNode(4);
        ListNode l6 =new ListNode(4);
        ListNode l7 =new ListNode(4);
        ListNode l8 =new ListNode(5);
        ListNode l9 =new ListNode(6);
        l8.next=l9;
        l7.next=l8;
        l6.next=l7;
        l5.next=l6;
        l4.next=l5;
        l3.next=l4;
        l2.next=l3;
        l1.next=l2;
        return l1;
    }
    private static int length(ListNode listNode) {
        int count=0;
        while(listNode.next!=null){
            count++;
            listNode=listNode.next;
        }
        return count+1;
    }
}
