package jianZhiOffer.s6;

import java.util.LinkedList;
import java.util.Stack;

public class s6 {
    public static void main(String[]args)
    {

    }
    public static void test(ListNode root)
    {
        Stack<Integer> stackt = new Stack<>();
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        while (!integerLinkedList.isEmpty()){
            stackt.push(integerLinkedList.poll());
        }
        while(!stackt.isEmpty())
        {
            System.out.println(stackt.pop());
        }

    }
    public static void test2(ListNode root)
    {
        if(root != null)
        {
            if(root.next != null)
            {
                test2(root);

            }
        }
        System.out.println(root.val);
    }
}
class ListNode{
    int val ;
    ListNode next ;
    ListNode(int x)
    {
        this.val = x ;
    }
}
