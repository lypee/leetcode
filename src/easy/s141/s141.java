package easy.s141;

import java.util.List;

public class s141 {
    public static void main(String [] args)
    {

    }
    public static boolean hasCycle(ListNode head )
    {
        if(head == null )
    {
        return false ;
    }
        ListNode slow = head ;
        ListNode fast = head ;
        if(fast.next != null && fast.next.next != null)
        {

            slow = slow.next ;
            fast = fast.next.next ;
            if(slow == fast) {
                return true ;
            }
        }
        return false ;
    }
}
class ListNode{
    int val ;
    ListNode next ;
    ListNode(int val)
    {
        this.val = val ;
    }
}