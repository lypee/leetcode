package easy.s104;

public class s104 {
    public static void main(String[] args)
    {

    }
    public static int maxDepth(TreeNode root)
    {
        if(root == null) return 1 ;
        return Math.max(maxDepth(root.left)+1  , maxDepth(root.right) +1 ) ;
    }

}
class TreeNode{
    int val ;
    TreeNode left ;
    TreeNode right ;
    TreeNode(int n)
    {
        this.val = n ;
    }
}
