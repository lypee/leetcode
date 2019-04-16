package medium.s513;

import medium.TreeNode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class s513  {
    static int number ;
    public static void main(String[]args)
    {
        TreeNode node = new TreeNode(2) ;
        TreeNode node1 = new TreeNode(1) ;
        TreeNode node2 = new TreeNode(3) ;
        node.left = node1 ;
        node.right = node2 ;
        findLeftMostNode(node) ;
    }
    public static int findLeftMostNode(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = queue.poll();
            if (root.right != null)
            {
                queue.add(root.right);
            }
            if (root.left != null)
            {
                queue.add(root.left);
            }
        }
        return root.val;
    }

    public static int heightOfTree(TreeNode root)
    {
        int depth = 0 ;
        if(root != null )
        {
            depth = Math.max(heightOfTree(root.left) + 1  , heightOfTree(root.right)+1  );
        }
        return depth ;
    }
    public static int dfs(TreeNode node , int height)
    {
        number = heightOfTree(node) ;
        if(height == number  )
        {
            return node.val ;
        }
        if(node != null )
        {
            dfs(node.left , height +1 ) ;
            dfs(node.right.left , height + 2) ;
        }
        return 0 ;
    }

}

