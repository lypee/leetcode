package easy.s110;


class TreeNode{
    int val ;
  TreeNode left ;
  TreeNode right ;
    TreeNode(int n)
    {
        this.val = n ;
    }
}
public class s110 {
    public static void main(String []args)
    {

    }
    public static boolean isBalanced(TreeNode root)
    {
        if(root == null )
        {
            return true ;
        }
        int LHeight =Depth(root.left) ;
        int RHeight =Depth(root.right);
        return Math.abs(LHeight - RHeight) < 2 && isBalanced(root.left) && isBalanced(root.right) ;
    }

    //获得该节点的高度
    public static int Depth(TreeNode node)
    {
        if(node == null) {
            return 0 ;
        }
        return Math.max(Depth(node.left) , Depth(node.right))  + 1 ;
    }
}
