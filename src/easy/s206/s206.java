package easy.s206;

import easy.ListNode.ListNode;

/**
 * 反转链表
 */
public class s206 {
    public static void main(String[]args)
    {

    }
    public static ListNode reverseList(ListNode head )
    {
        if(head == null || head.next == null)
        {
            return head ;
        }
        ListNode newHead = reverseList(head.next);
        head.next.next = head ;
        head.next = null ;

        return newHead ;
    }

}