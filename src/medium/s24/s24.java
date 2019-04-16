package medium.s24;



public class s24 {
    public static void main(String[] args)
    {

    }
    public static ListNode swapPairs(ListNode head)
    {
            if(head == null || head.next == null)
            {
                return head  ;
            }
            ListNode n  = head.next ;
            head.next = swapPairs(head.next.next) ;
            n.next = head  ;
            return n ;
    }

    public static ListNode swapLinkNode(ListNode head){
//        if(head == null || head.next == null)
//        {
//            return head ;
//        }
//        ListNode n = head.next ;
//        head.next = head.next.next ;
//        n.next = head ;
//        swapLinkNode(head.next) ;
    return null ;
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
