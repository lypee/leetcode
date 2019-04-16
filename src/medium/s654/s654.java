package medium.s654;
import medium.TreeNode.TreeNode  ;

import java.util.Deque;
import java.util.LinkedList;

public class s654 {
    public static void main(String[]args)
    {

    }
    public static TreeNode constructMaximumBinaryTree(int[] nums)
    {
        Deque<TreeNode> stack = new LinkedList<>();
        for (int i = 0; i < nums.length; i++) {
            TreeNode curr = new TreeNode(nums[i]);
            while (!stack.isEmpty() && stack.peek().val < nums[i]) {
                curr.left =  stack.pop() ;
            }
            if (!stack.isEmpty()) {
                stack.peek().right = curr ;
            }
            stack.push(curr);
        }
        return stack.isEmpty() ? null : stack.removeLast() ;

    }
}

